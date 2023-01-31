/*22 - Uma fruteira está vendendo frutas com a seguinte tabela de preços.

morango: até 5kg - 2,50 por kg / acima de 5kg 2,20 por kg
maça até 5 kg 1,80 por kg / acima de 5kg 1,50 por kg

Se o cliente comprar mais de 8kg em frutas ou o valor total da compra 
ultrapassar R$ 25,00, receberá ainda um desconto de 10% 
sobre este total. Escreva um algoritmo para ler a 
.quantidade (em kg) de morangos e a quantidade (em kg) 
de maças adquiridas e escreva o valor a ser pago pelo cliente.
 */

import java.util.Scanner;

public class exercicio22novo {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Bom dia cliente, vai querer quantos kilos de morangos? ");
        double kgMorango = scan.nextDouble();

        System.out.println("Bom dia cliente, vai querer quantos kilos de maças? ");
        double kgMaca = scan.nextDouble();

        double precoKgMorango = 0;
        double precoKgMaca = 0;
        double valorTotal = 0;
        double ValorAPagar = 0;
        int descontoTotal = 10;
        
        if ( kgMorango <= 5 ){
            precoKgMorango = 2.50; 
        } else if (kgMorango > 5) {
            precoKgMorango = 2.20;
        }

        if ( kgMaca <= 5 ){
            precoKgMaca = 1.80; 
        } else if (kgMorango > 5) {
            precoKgMaca = 1.50;
        }
        
        valorTotal = (kgMorango * precoKgMorango) + (kgMaca * precoKgMaca);
        ValorAPagar = valorTotal;

        if ((kgMaca + kgMorango) > 8 || valorTotal > 25 ) {

            ValorAPagar = valorTotal - ((valorTotal / 100) * descontoTotal);
        }
        
        System.out.println("Prezado cliente o total da sua compra saiu por R$ " + ValorAPagar);
    }
}
