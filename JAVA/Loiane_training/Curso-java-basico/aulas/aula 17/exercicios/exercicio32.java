import java.util.Scanner;

public class exercicio32 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        long num1 = scan.nextInt();

        long num = num1;
        long i = num;
        System.out.print(num1 + "!= ");
        while (i > 1) {
            i--;
            num *= i;
            if (i > 1 ) {
            System.out.print(i + " . ");
            } else {
                System.out.print(i + " ");
            }

            
            }
        System.out.print(" = " + num);   
       
            

        
    }
}

/*.Faça um programa que calcule o fatorial de um número inteiro 
fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser 
conforme o exemplo abaixo:
o Fatorial de: 5 
o 5! = 5 . 4 . 3 . 2 . 1 = 120 */
