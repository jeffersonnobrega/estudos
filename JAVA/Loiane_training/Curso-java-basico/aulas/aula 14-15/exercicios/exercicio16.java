/*

16- Faça um programa que calcule as raizes de uma equação do segundo grau, na forma ax² + bx +c. 
O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:

a. Se o usuário informar o valor de A igual a zero, a equeçao não é do segundo grau e o programa não deve pedir os demais valores.
b. Se o delta calculador for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
c. Se o delta calculado for igual a zero a equção possui apenas uma raiz real; informe-a ao usuário;
d. Se o delta for positivo, a equeção possui duas raiz reais; informe-as ao usuário.



 * delta = b² -4*a*c
 * Δ = b2 – 4ac
 * 
 * x = -b +ou- raiz de delta
 * ___________________________
 *         2*a
 */

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
        int a = scan.nextInt();

        if ( a == 0) {
            System.out.println("Não é equação de segundo grau");
        } else {

            System.out.println("Informe o valor de B: ");
            int b = scan.nextInt();

            System.out.println("Informe o valor de C: ");
            int c = scan.nextInt();

            // primeiro vamos calcular o delta

            double delta = (Math.pow(b, 2)) - (4*4*5);

            if (delta < 0) {
                System.out.println("Delta negativo");
            } else {

                // formula de bascara

                double x1 = ((-b) + Math.sqrt(delta)) / (2*a); //sqrt para calcular a raiz quadrada
                double x2 = ((-b) - Math.sqrt(delta)) / (2*a);

                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);




            }

        }


    }
        
}
