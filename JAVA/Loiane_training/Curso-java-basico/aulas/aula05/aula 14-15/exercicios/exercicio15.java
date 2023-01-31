/*15 - Faça um programa que peça os 3 lados de um triângulo.
O programa deverá informar se os valores podem ser um triângulo. 
Indique, caso os lados forme um triêngulo, se o mesmo é: equilátero, isosceles ou escaleno.

Dicas:
Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro.
Triângulo Equilátero: três lados iguais
Triângulo Isósceles: quaisquer dois lados iguais;
Triângulo Escaleno: três lados diferentes. */

import java.util.Scanner;

public class exercicio15 {
     public static void main(String[] args) {
        
    
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do primeiro lado: ");
        double lado1 = scan.nextDouble();

        System.out.println("Informe o valor do segundo lado: ");
        double lado2 = scan.nextDouble();

        System.out.println("Informe o valor do terceiro lado: ");
        double lado3 = scan.nextDouble();

        //verificar se é um triângulo: a soma de quaisquer dois lados devem ser maior que o terceiro

        if (((lado1 + lado2) > lado3 || (lado1 + lado3) > lado2 || (lado3 + lado2) > lado1) ) {
            
            if ((lado1 == lado2 && lado1 != lado3 && lado2 != lado3)|| (lado1 == lado3 && lado1 != lado2 && lado2 != lado3) 
            || (lado2 == lado3 && lado2 != lado1 && lado3 != lado1)) {

                System.out.println("Esse é um triângulo Isósceles");

            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {

                System.out.println("Triângulo Escaleno");

            } else {
                
                System.out.println("Triângulo Equilátero");
            }
        }




    }


}
