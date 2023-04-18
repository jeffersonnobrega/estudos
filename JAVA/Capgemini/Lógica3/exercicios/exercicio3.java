

/** . Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
 total percorrida pelo automóvel e o total de combustível gasto;
 */

import  java.util.Scanner;
 public class exercicio3 {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

         float distancia;
         float totalCombustivel;
         float consumo;
         float km;

         System.out.println("Informe a distância percorrida em metros");
         distancia = scan.nextFloat();

         km = distancia / 1000;

         System.out.println("Informe a quantidade de combustível");
         totalCombustivel = scan.nextFloat();

         consumo = (km + totalCombustivel) / 2;

         System.out.println("A média de consumo do veículo é: " + consumo);

     }
}
