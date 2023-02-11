package exercicios;

import java.util.Scanner;

public class exercicio12 {

    /*12. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
numero ele deseja ver a tabuada. A saída deve ser conforme o
exemplo abaixo:
o Tabuada de 5:
o 5 X 1 = 5
o 5 X 2 = 10
o ...
o 5 X 10 = 50*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num1 = scan.nextInt();

        int mult = 0;
        int result = 0;
        int i =1;
        int j = 0;

        if (num1 > 0 && num1 <=10) {

            for (; i <= 10; i++){
                j = num1;
                result = j * i;
                System.out.println(num1 + " x " + i + " = " +result);
            }

        } else {
            System.out.println("Favor informar um número entre 1 e 10");
        }

        //lógica da professora bem mais simples
        /* for (int i=1; i<=10;i++){
        System.out.println(num + " x " + i + " = " + (num*i));
         */
    }
}
