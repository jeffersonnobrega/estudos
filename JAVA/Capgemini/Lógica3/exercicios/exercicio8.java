

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float valorDolar, valorReal, cotacao;

        System.out.println("Informe quantos dólares você tem em seu poder: ");
        valorDolar = scan.nextFloat();

        System.out.println("Informe a cotação atual do dólar: ");
        cotacao = scan.nextFloat();

        valorReal = valorDolar * cotacao;

        System.out.println("Você receberá R$ " + valorReal);
    }
}
/** 8. Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
 dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares
 disponíveis com ousuário*/