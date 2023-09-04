public class exercicio02 {
    
public static void main(String[] arg) {

    livr livro = new livr();

    livro.autor = "Jefferson Nóbrega";
    livro.dataLancamento = "10/2015";
    livro.editora = "Métrica Editorial";
    livro.genero = "Romance";
    livro.titulo = "A Crõnica de Sangue e Fé";
    livro.isbn = "12345678991011";
    livro.numPaginas = 330;
    
            System.out.println("O livro é do autor" + livro.autor);
        }

}