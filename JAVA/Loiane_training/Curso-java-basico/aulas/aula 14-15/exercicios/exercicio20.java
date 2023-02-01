/*20 Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:

telefonou para a vítima?
esteve no local do crime?
mora perto da vitima?
devia para a vítima?
"Já trabalhou com a vítima?" O programa deve no final emitir uma classificação 
sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 
2 questões ela deve ser classificada como suspeita, entre 3 e 4 como "cúmplice" 
e 5 como "assassino". Caso contrário, ele será classificado como "inocente"
 */

 import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Responda as perguntas a seguir com S para sim e N para Não!");

        System.out.println("telefonou para a vítima?");
        String resp1 = scan.next();

        System.out.println("esteve no local do crime?");
        String resp2 = scan.next();
       
        System.out.println("mora perto da vitima?");
        String resp3 = scan.next();
       
        System.out.println("devia para a vítima?");
        String resp4 = scan.next();
       
        System.out.println("Já trabalhou com a vítima?");
        String resp5 = scan.next();
       
       int cont = 0;

       if (resp1.equalsIgnoreCase("s")) {
         cont++;
       }

       if (resp2.equalsIgnoreCase("s")) {
        cont++;
      }

      if (resp3.equalsIgnoreCase("s")) {
        cont++;
      }

      if (resp4.equalsIgnoreCase("s")) {
        cont++;
      }

      if (resp5.equalsIgnoreCase("s")) {
        cont++;
      }
      if (cont == 0) {
        System.out.println("Inocente");
      } else if (cont == 2) {
        System.out.println("Suspeito!");
      } else if (cont == 3 || cont == 4) {
        System.out.println("Cumplice!");
      }else if (cont == 5) {
        System.out.println("Assassino");
      }

    }
}
