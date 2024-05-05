using System;
using System.IO;
using System.Drawing;
using System.Drawing.Imaging;
using System.Threading;

internal class Program
{
    // Método principal
    static void Main(string[] args)
    {
        Console.WriteLine("Iniciando redimensionador");

        // Inicia uma nova thread para redimensionar as imagens
        Thread thread = new Thread(Redimensionar);
        thread.Start();
    }

    // Método para redimensionar imagens
    static void Redimensionar()
    {
        // Diretórios de entrada, saída e redimensionamento
        string diretorio_entrada = "Arquivo_Entrada";
        string diretorio_finalizado = "Arquivo_Finalizado";
        string diretorio_redimensionado = "Arquivo_Redimensionado";

        // Verifica se os diretórios de entrada, saída e redimensionamento existem, senão os cria
        if (!Directory.Exists(diretorio_entrada))
            Directory.CreateDirectory(diretorio_entrada);

        if (!Directory.Exists(diretorio_finalizado))
            Directory.CreateDirectory(diretorio_finalizado);

        if (!Directory.Exists(diretorio_redimensionado))
            Directory.CreateDirectory(diretorio_redimensionado);

        while (true)
        {
            // Obtém a lista de arquivos no diretório de entrada
            var arquivosEntrada = Directory.EnumerateFiles(diretorio_entrada);

            // Altura desejada para redimensionamento
            int novaAltura = 200;

            // Itera sobre os arquivos no diretório de entrada
            foreach (var arquivo in arquivosEntrada)
            {
                // Abre o arquivo
                using (FileStream fileStream = new FileStream(arquivo, FileMode.Open, FileAccess.ReadWrite, FileShare.ReadWrite))
                {
                    // Obtém informações do arquivo
                    FileInfo fileInfo = new FileInfo(arquivo);

                    // Nome do arquivo redimensionado
                    string nomeArquivoRedimensionado = $"{DateTime.Now:yyyyMMddHHmmss}_{fileInfo.Name}";
                    string caminhoRedimensionado = Path.Combine(diretorio_redimensionado, nomeArquivoRedimensionado);

                    // Redimensiona a imagem e salva no diretório de redimensionamento
                    Redimensionador(Image.FromStream(fileStream), novaAltura, caminhoRedimensionado);

                    // Fecha o stream do arquivo
                    fileStream.Close();

                    // Caminho para o arquivo finalizado
                    string caminhoFinalizado = Path.Combine(diretorio_finalizado, fileInfo.Name);

                    // Verifica se o arquivo finalizado já existe, se sim, exclui-o
                    if (File.Exists(caminhoFinalizado))
                    {
                        File.Delete(caminhoFinalizado);
                    }

                    // Move o arquivo redimensionado para o diretório finalizado
                    fileInfo.MoveTo(caminhoFinalizado);
                }
            }

            // Aguarda 5 segundos antes de verificar novamente
            Thread.Sleep(new TimeSpan(0, 0, 5));
        }
    }

    // Método para redimensionar uma imagem
    static void Redimensionador(Image imagem, int altura, string caminho)
    {
        // Calcula a proporção para redimensionar a imagem
        double ratio = (double)altura / imagem.Height;
        int novaLargura = (int)(imagem.Width * ratio);
        int novaAltura = (int)(imagem.Height * ratio);

        // Cria uma nova imagem com as dimensões redimensionadas
        Bitmap novaImage = new Bitmap(novaLargura, novaAltura);

        // Desenha a imagem original na nova imagem
        using (Graphics g = Graphics.FromImage(novaImage))
        {
            g.DrawImage(imagem, 0, 0, novaLargura, novaAltura);
        }

        // Salva a nova imagem no caminho especificado
        novaImage.Save(caminho);
        imagem.Dispose();
    }
}
