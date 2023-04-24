import java.util.Scanner;
public class exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valor = 0;
        int ano = 0;
        String execucao;
        boolean flag = true;
        boolean prossiga;
        double desconto = 0;
        int totalDoisMil = 0;
        int totalGeral=0;

            while (flag == true) {
                System.out.println("Informe o valor do veículo: ");
                valor = scan.nextDouble();

                System.out.println("Informe o ano do veículo: ");
                ano = scan.nextInt();

                    if (ano <= 2000) {
                        desconto = valor * 12 / 100;
                        System.out.println("Valor do desconto é R$" + desconto);
                        totalDoisMil++;
                    } else if (ano > 2000) {
                        desconto = valor * 7 / 100;
                        System.out.println("Valor do desconto é R$" + desconto);
                    }
                totalGeral++;
                prossiga = true;
                    while (prossiga == true) {
                        System.out.println("Deseja continuar calculando desconto?");
                        System.out.println("Digite S para continuar ou N para encerrar:");
                        execucao = scan.next();

                            if (execucao.equalsIgnoreCase("s")) {
                                prossiga = false;
                            } else if (execucao.equalsIgnoreCase("n")) {
                                prossiga = false;
                                flag = false;
                            } else {
                                System.out.println("Caracter inválido.");
                            }

                    }


            }
        System.out.println("Total de carros: " + totalGeral);
        System.out.println("Total de carros com ano até 2000: " + totalDoisMil);
    }
}

/** 20. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
 um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
 desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
 sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
 Informar total de carros com ano até 2000 e total geral;*/
