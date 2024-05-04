package lista_exercicios;

public class exercicio2 {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.titulo = "A queda de Ardyan";
        livro.autor = "Jefferson Nóbrega";
        livro.genero = "Fantasia";
        livro.editora = "Draco";
        livro.isbn = "126987599PR";
        livro.numPaginas = 300;

        System.out.println(livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Gênero: " + livro.genero);
        System.out.println("Editora " + livro.editora);
        System.out.println("ISBN: " + livro.isbn);
        System.out.println("Nº páginas: " + livro.numPaginas);


    }
}
