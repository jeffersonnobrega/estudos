import java.util.Scanner;

/*21 - Um posto está vendendo combustíveis com a seguinte tabela de descontos:

Alcool:
até 20 litros, desconto de 3% por litro
acima de 20 litros, desconto de 5% por litro

Gasolina:
até 20 litros, desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro

Escreva um algoritmo que leia o numero de litros vendido, 
o tipo de combustível (codificado da seguinte forma: A-álcool, 
G-gasolina), calcule e imprima o valor a ser pago pelo cliente 
sabendo-se que o preço do litro da gasolina é de R$ 2,50 preço do litro do álccol é R$ 1,90. */

public class exercicio21 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Bom dia. Álcool ou Gasolina? A-álcool, G-gasolina");
        String tipo = scan.next();

        System.out.println("Vai querer quantos litros? ");
        double qtdLitro = scan.nextDouble();

        double precoGasolina = 2.50 * qtdLitro;
        double precoAlcool = 1.90 * qtdLitro;
        double desconto = 0;
        double precoFinal = 0;

        

        if (tipo.equalsIgnoreCase("g")) {
            if (qtdLitro <= 20) {
                desconto = (2.50 * 4 / 100) * qtdLitro;
                precoFinal = precoGasolina - desconto;
            } else if (qtdLitro > 20) {
                desconto = (2.50 * 6 / 100) * qtdLitro;
                precoFinal = precoGasolina - desconto;
            }
        } else if (tipo.equalsIgnoreCase("a")){
            if (qtdLitro <= 20) {
                desconto = (2.50 * 3 / 100) * qtdLitro;
                precoFinal = precoAlcool - desconto;
            } else if (qtdLitro > 20) {
                desconto = (2.50 * 5 / 100) * qtdLitro;
                precoFinal = precoAlcool - desconto;
            } 
            } else {
                System.out.println(" Caracter Inválido");            

        }

        System.out.println("O valor a ser pago é de R$ " + precoFinal);

        
    }
}
