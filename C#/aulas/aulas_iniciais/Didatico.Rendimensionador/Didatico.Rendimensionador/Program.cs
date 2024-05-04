using System;
using System.Threading;

internal class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Iiniciando redimensionador");

        Thread thread = new Thread(Redimensionar);
    }

    static void Redimensionar()
    {
        #region "Diretórios"
        string diretorio_entrada = "Arquivos de Entrada";
        string diretorio_finalizado = "Arquivo_Finalizado";
        string diretorio_redimensionado = "Arquivo_Redimensionado";

        if (!Directory.Exists(diretorio_entrada))
        {
            Directory.CreateDirectory(diretorio_entrada);
        }

        if (!Directory.Exists(diretorio_finalizado))
        {
            Directory.CreateDirectory(diretorio_finalizado);
        }

        if (!Directory.Exists(diretorio_redimensionado))
        {
            Directory.CreateDirectory(diretorio_redimensionado);
        }

        #endregion
        while (true)
        {
            //meu programa vai olhar para o diretório de entrada
            // havendo arquivos ele irá redimensionar
            var arquivosEntrada = Directory.EnumerateFiles(diretorio_entrada);

            // tamanho que ele irá redimensionar
            int tamanho = 200;

            foreach(var arquivo in arquivosEntrada)
            {
                FileStream fileStream = new FileStream(arquivo,FileMode.Open, FileAccess.ReadWrite,FileShare.ReadWrite);
                FileInfo fileInfo = new FileInfo(arquivo);    
            }


            Thread.Sleep(new TimeSpan(0, 0, 5));
        }
    }
}
