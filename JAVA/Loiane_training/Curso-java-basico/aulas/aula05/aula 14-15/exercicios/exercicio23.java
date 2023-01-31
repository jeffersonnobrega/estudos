/*23. O hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira.

File duplo: até 5kg 4,90 o kilo / acima de 5kg 5,80 o kilo
Alcatra: até 5kg 5,90 o kilo / acima de 5kg 6,80 o kilo
Picanha: até 5kg 6,90 o kilo / acima de 5kg 7,80 o kilo

Para atender a todos os clientes, cada cliente poderá levar apenas um dos 
tipos de carne na promoção, porém não há limites para a quantidade de carne por cliente. 
Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total da compra. 

Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, 
contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.

 */

import java.util.Scanner;

public class exercicio23 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Olá cliente, escolha sua opção de carne: 1 para Filé Duplo / 2  para Alcatra e 3 para Picanha: ");
        int tipoCarne = scan.nextInt();

        boolean validacao = true;

        switch(tipoCarne) {
            case 1: validacao = true; break;
            case 2: validacao = true; break;
            case 3: validacao = true; break;
            default: validacao = false;
        }

            if (validacao == true) {

            System.out.println("Informe agora quantos kilos você deseja: ");
            double qtd = scan.nextDouble();

            System.out.println("A Compra é no cartão tabajara? S -para sim N para não: ");
            String cartao = scan.next();            

            String nomeCarne = "";
            double precoCarne= 0;     
            String tipoPgto = "";      

                switch(tipoCarne) {
                    case 1: nomeCarne = "Filé Duplo"; break;
                    case 2: nomeCarne = "Alcatra"; break;
                    case 3: nomeCarne = "Picanha"; break;
                }

                //File duplo: até 5kg 4,90 o kilo / acima de 5kg 5,80 o kilo

                if (tipoCarne == 1 && tipoCarne <= 5) {

                    precoCarne = 4.9;
                    
                } else if (tipoCarne == 1 && tipoCarne > 5){

                    precoCarne = 5.8;

                } else if (tipoCarne == 2 && tipoCarne <= 5) { //Alcatra: até 5kg 5,90 o kilo / acima de 5kg 6,80 o kilo
                
                    precoCarne = 5.9;           
                
                } else if (tipoCarne == 2 && tipoCarne > 5){

                    precoCarne = 6.8;

                } else if (tipoCarne == 3 && tipoCarne <=5) { //Picanha: até 5kg 6,90 o kilo / acima de 5kg 7,80 o kilo

                    precoCarne = 6.9;

                } else if (tipoCarne == 3 && tipoCarne > 5){

                    precoCarne = 6.8;
                }    
                
                double valorCompra = qtd * precoCarne;
                double valortotal = 0;
                double valorDesconto = 0;

                if (cartao.equalsIgnoreCase("s")) {
                    valorDesconto = ((valorCompra / 100) * 5);
                    valortotal = valorCompra - valorDesconto;
                    tipoPgto = " Cartão Tabajara";
                } else {                    
                    tipoPgto = " Dinheiro ou cartão de outro estabelecimento";
                }
                //tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.
            
            System.out.println("Compra de " + qtd + " kilos de " + nomeCarne);    
            System.out.println("Preço total da compra R$ " + valorCompra);
            System.out.println("Tipo de pagamento: "+ tipoPgto);            
            System.out.println("Valor do desconto: R$ " + valorDesconto);
            System.out.println("Valor a pagar R$ " + valortotal);
        
        
        
        
        
        
        
        
        
        
        
        
        
        }  else {
            System.out.println("Opção escolhida não corresponde a nenhum tipo de carne. Execute o programa novamente e escolha uma opção válida.");
        }        
        
        



    }
    
}
