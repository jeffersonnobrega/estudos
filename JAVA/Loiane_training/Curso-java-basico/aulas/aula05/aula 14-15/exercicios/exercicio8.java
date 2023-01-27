/*8 - Faça um programa que pergunte o preço de três produtos e informe 
qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato. */

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o preço do primeiro produto: ");
        double preco1 = scan.nextDouble();

        System.out.println("Informe o preço do segundo produto: ");
        double preco2 = scan.nextDouble();

        System.out.println("Informe o preço do terceiro produto: ");
        double preco3 = scan.nextDouble();
        
        if (preco1 < preco2 && preco1 < preco3){
            System.out.println("O primeiro produto custa R$" + preco1 + " é o menor preço, pode comprá-lo.");
        } else if (preco2 < preco1 && preco2 < preco3){
            System.out.println("O segundo produto custa R$ " + preco2 + " é o menor preço, pode comprá-lo.");
        } else if (preco3 < preco1 && preco3 < preco1){
            System.out.println("O terceiro produto custa R$ " + preco3 + " é menor preço, pode comprá-lo.");
        } else {
            System.out.println("Não há diferença de preços entre os produtos, leve qualquer um ou peça desconto.");
        }
    }
}
