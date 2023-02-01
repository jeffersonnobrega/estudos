/*Faça um programa que leia 2 numeros e em seguida pergunte ao usuário qual 
operação ele deseja realizar. O resultado da operação deve ser
 acompanhado de uma frase que diga se o número é 

par ou impar
positivo ou negativo */

import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Informe o segundo número: ");
        int num2 = scan.nextInt();

        int result = 0;

        System.out.println("Qual operação deseja realizar? (+, -, x ou /): ");
        String op = scan.next();

        String msgParImpar = " ";
        String msgPosiNegativo = " ";
        boolean valida = true;

        switch(op) {
            case "+": result =  result = num1 + num2; break;
            case "-": result =  result = num1 - num2; break;
            case "x": result =  result = num1 * num2; break;
            case "X": result =  result = num1 * num2; break;
            case "*": result =  result = num1 * num2; break;
            case "/": result =  result = num1 / num2; break;
            default: 
                    System.out.println("Operação inválida"); 
                    valida = false;
                     break;
        }        
        
        if (valida) {
            
            if (result%2 == 0 ) {
                msgParImpar = "O número PAR";
            } else {
                msgParImpar = "O número é IMPÁR";
            }

            if (result >= 0) {
                msgPosiNegativo = "O Número é POSITIVO";
            } else {
                msgPosiNegativo = "O número é NEGATIVO";
            }
        }

        System.out.println("O resultado é " + result + " e " + msgParImpar + ", " + msgPosiNegativo);

       
    }
}
