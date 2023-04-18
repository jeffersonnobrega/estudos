import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        float salarioFixo;
        float totalVendas;
        float salarioFinal;

        System.out.println("Favor informar seu nome");
        nome = scan.next();

        System.out.println("Informe seu salário fixo");
        salarioFixo = scan.nextFloat();

        System.out.println("Informe o total de vendas");
        totalVendas = scan.nextFloat();

        salarioFinal = salarioFixo + ((totalVendas * 15) /100);

        System.out.println("Nome: " + nome);
        System.out.println("Salario fixo: " + salarioFixo);
        System.out.println("Salário final (fixo + comissão): " + salarioFinal);

    }
}

/**4. Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
 por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
 efetuadas, informar o seu nome, o salário fixo e salário no final do mês; */