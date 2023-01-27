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
        double a = scan.nextDouble();

        if (a != 0) {

            System.out.println("Informe o valor de B: ");
            double b = scan.nextDouble();

            System.out.println("Informe o valor de B: ");
            double c = scan.nextDouble();

            double delta = (Math.pow(b, 2)) + (-4 * (a * c));
            double b2 = 0;

             // bhaskara
            // x = -b +ou- raiz de delta
            //___________________________
                    //2*a
             if (b < 0) {
            b2 = b * -1;
             }    
        
            double deltaRaiz = Math.sqrt(delta);
            double a2 = 2 * a;

            double eqPositiva = (b2 + deltaRaiz);
            double eqNegativa = (b2 - deltaRaiz);

            double x1 = eqPositiva / a2;
            double x2 =  eqNegativa/ a2;

            //verificadndo se a raiz é real
            //Se o delta calculado for igual a zero a equção possui apenas uma raiz real; informe-a ao usuário;

            if (delta == 0 && eqPositiva%a2 == 0) {
                System.out.println("A equação possui apenas uma raiz real: " + eqPositiva);
            }  else if (delta == 0 && eqNegativa%a2 == 0) {
                System.out.println("A equação possui apenas uma raiz real: " + eqPositiva);
            }

            //Se o delta for positivo, a equeção possui duas raiz reais; informe-as ao usuário.

            if (delta > 0) {
                System.out.println("A Equação possui duas raizes que são x1: " + x1 + "e x: " + x2);
            }

            


            if  (delta < 0) {
                System.out.println("A Equação não possui raízes real");
            } if (delta == 0) {
                System.out.println();
                
            }


            System.out.println(delta);
            
        } else {

        System.out.println("A equação não é de segundo grau.");

        }

        

    }
}
