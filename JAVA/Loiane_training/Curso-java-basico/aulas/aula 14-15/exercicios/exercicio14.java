/*14. Faça um programa que lê as duas notas parciais obtidas por um alino numa disciplin
 ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo.

Entre 9.0 e 10.0 A
Entre 7.5 e 9.0 B
Entre 6.0 e 7.5 C
Entre 4.0 e 6.0 D
Entre 4.0 e zero E

O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente 
e a mensagem "Aprovado" se o conceito for a, b, ou c ou "reprovado" se o conceito for D ou E. */

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        String conceito = " ";
        String msg = " ";

        if (media >= 9 && media <= 10 ) {
            conceito = "A";
            msg = "APROVADO";         
        } else if (media >= 7.5 && media < 9 ) {
            conceito = "B";
            msg = "APROVADO";  
        } else if (media >= 6 && media < 7.5 ) {
            conceito = "C";
            msg = "APROVADO"; 
        } else if (media >= 4 && media < 6 ) {
            conceito = "D";
            msg = "REPROVADO";  
        } else if (media < 4) {
            conceito = "E";
            msg = "REPROVADO";
        }        
        
        /*O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente 
e a mensagem "Aprovado" se o conceito for a, b, ou c ou "reprovado" se o conceito for D ou E.  */

        System.out.println("Nota do primeiro semestre:   " + nota1);
        System.out.println("Nota do segundo semestre:   " + nota2);
        System.out.println("Média anual do aluno:   " + media);
        System.out.println("Conceito:   " + conceito);
        System.out.println("Com base no conceito o aluno está: " + msg);
    }
}
