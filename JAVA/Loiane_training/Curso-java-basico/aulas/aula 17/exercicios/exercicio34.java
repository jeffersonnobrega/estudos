import java.util.Scanner;

public class exercicio34 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        int num = scan.nextInt();

        if (num % 2 == 0 && num != 2) {
            System.out.println(num + " Não é primo");
        } else {
            System.out.println(num + " é primo");
        }
        
    }
}
/*34.Os números primos possuem várias aplicações dentro da 
Computação, por exemplo na Criptografia. Um número primo é aquele 
que é divisível apenas por um e por ele mesmo. Faça um programa 
que peça um número inteiro e determine se ele é ou não um número 
primo */
