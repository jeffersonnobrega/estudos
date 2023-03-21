import java.util.Scanner;

public class exercicio35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Declaring the variables
        int  x, y, flg;
        
 
        // Printing display message
        System.out.println( "Entre com o número");
        int N = scan.nextInt();
 
        // Using for loop for traversing all
        // the numbers from 1 to N
        for (x = 1; x <= N; x++) {
 
            // Omit 0 and 1 as they are
            // neither prime nor composite
            if (x == 1 || x == 0)
                continue;
 
            // Using flag variable to check
            // if x is prime or not
            flg = 1;
 
            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
 
            // If flag is 1 then x is prime but
            // if flag is 0 then x is not prime
            if (flg == 1)
                System.out.print(x + " ");
        }
    }
}
/*Encontrar números primos é uma tarefa difícil. Faça um programa que 
gera uma lista dos números primos existentes entre 1 e um número 
inteiro informado pelo usuário. */