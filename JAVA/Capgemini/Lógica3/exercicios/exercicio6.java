import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a;
        int b;
        int temp;

        System.out.println("Informe o valor de A: ");
        a = scan.nextInt();

        System.out.println("Informe o valor de B: ");
        b = scan.nextInt();

        System.out.println("Inicialmente A tem o valor de " + a + " e B tem o valor de " + b);
        System.out.println("Efetuando a troca...");
        temp = a;
        a = b;
        b = temp;

        System.out.println("Agora A tem o valor de " +a + " e B tem o valor de " + b);


    }
}
/** Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a
 possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores
 trocados; */