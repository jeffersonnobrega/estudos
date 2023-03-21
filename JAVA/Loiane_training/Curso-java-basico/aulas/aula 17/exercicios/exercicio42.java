import java.util.Scanner;

public class exercicio42 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;
        int contA = 0;
        int contB = 0;
        int contC = 0;
        int contD = 0;

        do {

           System.out.println("entre com um número"); 
           num = scan.nextInt();

            if (num >= 0 && num <= 25) {
                    contA++;
            }

            if (num >= 26 && num <= 50) {
                contB++;
            }

            if (num >= 51 && num <= 75) {
                contC++;
            }

            if (num >= 76 && num <= 100) {
                contD++;
            }
            
        } while (num >= 0);

        System.out.println("No intervalo de [0-25] há " + contA + " números");
        System.out.println("No intervalo de [26-50] há " + contB + " números");
        System.out.println("No intervalo de [51-75] há " + contC + " números");
        System.out.println("No intervalo de [76-100] há " + contD + " números");
    }

    
}
/*42.Faça um programa que leia uma quantidade indeterminada de 
números positivos e conte quantos deles estão nos seguintes 
intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados 
deverá terminar quando for lido um número negativo. */