/*19 - Faça um programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.

Observando que o termos no prlulral a colocação do "e", da vírgula entre outros. Exemplo:
326 = 3 centenas, 2 dezenas e 6 unidades */

import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número inteiro menor que 1000: ");
        int numero = scan.nextInt();
        String msgCentena = " ";

        if (numero < 1000) {
            
            // centenas divido por 100
            // dezena pego o numero total divido por 10, pego o resultado, divido por 10 dessa segunda divisão pego o resto e multiplico por 10, tenho a quantidade de dezenas
            // o resto será a uniade, multiplica por 100

            /*/ ************************CALCULO CENTENA ****************/
            int centena = numero / 100;

            if (centena < 2 ) {
                msgCentena = "Centena";
            } else {
                msgCentena = "Centenas";
            }

            /*********************************************************** */
            /*                      CALCULO DEZENA                        */

            Double dezenaCalculo = (numero / 10) % 10;
            Double dezena = dezenaCalculo * 10;
        




            System.out.println( "Centena: " + centena + msgCentena);
            System.out.println( "Dezena: " + dezenaCalculo);











        } else {
            System.out.println("O número deve ser menor que 1000");
        }

    }
}
