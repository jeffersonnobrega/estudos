import java.util.Date;

public class exercicio04 {
    public static void main(String[] arg) {

        LivroDeBiblioteca livroLivraria = new LivroDeBiblioteca();
    
        livroLivraria.autor = "Jefferson Nóbrega";
        livroLivraria.dataLancamento = "10/2015";
        livroLivraria.editora = "Métrica Editorial";
        livroLivraria.genero = "Romance";
        livroLivraria.titulo = "A Crõnica de Sangue e Fé";
        livroLivraria.isbn = "12345678991011";
        livroLivraria.numPaginas = 330;
        livroLivraria.dataEntrega = new Date();
        livroLivraria.emprestado = true;
        
                System.out.println("O livro é do autor" + livroLivraria.autor);
            }
}
