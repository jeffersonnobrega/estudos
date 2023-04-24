import java.util.Scanner;
public class exercicio18 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade = 0;

            for (int i=1;i<= 75;i++) {
                System.out.println("Informe a idade da pessoa de número " + i + ":");
                idade = scan.nextByte();

                if (idade >= 18) {
                    System.out.println("Pessoa de número " + i + " é maior de idade");
                } else {
                    System.out.println("Pessoa de número " + i + " é menor de idade");
                }
            }
    }
}

/*18. Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e
“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;
*/
