/*10 - Faça um programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-vespertino ou N-Nortuno. 
Imprima a mensagem "Bomdia, "Boa Tarde!", ou "Boa noite!" ou "Valor Inválido!", conforme o caso. */

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Em qual turno você estuda? Responda  M-matutino ou V-vespertino ou N-Nortuno");
        String turno = scan.next();       

        if (turno.equals("M") || turno.equals("m")) {

            System.out.println("Bom dia!");

        } else if (turno.equals("V") || turno.equals("v")) {

            System.out.println("Boa tarde!");

        } else if (turno.equals("n") || turno.equals("N")) {

            System.out.println("Boa noite!");
        } else {
            System.out.println("Caracter Inválido. Responda  M-matutino ou V-vespertino ou N-Nortuno ");
        }     


    }
}
