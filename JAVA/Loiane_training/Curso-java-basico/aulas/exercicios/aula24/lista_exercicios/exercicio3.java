package lista_exercicios;

public class exercicio3 {
    public static void main(String args[]) {
        Livro livro = new Livro();
        LivroLivraria livroLivraria = new LivroLivraria();

        livro.titulo = "A queda de Ardyan";
        livro.autor = "Jefferson Nóbrega";
        livro.genero = "Fantasia";
        livro.editora = "Draco";
        livro.isbn = "126987599PR";
        livro.numPaginas = 300;

        livroLivraria.preco = 20;
        livroLivraria.disponivelEstoque = true;

        System.out.println(livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Gênero: " + livro.genero);
        System.out.println("Editora " + livro.editora);
        System.out.println("ISBN: " + livro.isbn);
        System.out.println("Nº páginas: " + livro.numPaginas);
        System.out.println("Preço do livro: " + livroLivraria.preco + " R$");
        System.out.println("Disponível em estoque: " + livroLivraria.disponivelEstoque);


    }
}
