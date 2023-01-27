/*12- Faça um programa para o cálculo de uma folha de pagamento sabendo que os 
descontos são do imposto de renda, que depende do salário bruto (conforme tabela abaixo)
 e 3% para o sindicato e que o fgts corresponde a 11% do salário bruto, 
 mas não é descontado (é a empresa que deposita). O Salário líquido corresponde ao salário bruto menos os descontos. 
 O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

 inss 10% ( o enunciado fala 3% mas na impressão colocaram 10% vou optar por 10% 
 // e o sindicato não é descontado e nem aparece na impressão então não tem pq declarar

Desconto do IR:
Salário bruto até 900 (inclusive) - isento
Salário bruto até 1500 (inclusive) - desconto de 5%
Salário bruto até 2500 (inclusive) - desconto de 10%
Salário bruto acima de 2500 - desconto de 20%

Imprima na tela as informações dispostas conforme exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220: */

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor da sua hora de trabalho: ");
        double valorHora = scan.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double desconto = 0;

        double inss = salarioBruto * 10 / 100;
        double fgts = salarioBruto * 11 / 100;        
        double iR = 0;

        //Desconto do IR:
        //Salário bruto até 900 (inclusive) - isento:        

        if ((salarioBruto >= 900) && (salarioBruto < 1500)) {
            desconto = 5d;   
            iR = (salarioBruto * 5) / 100;    

        } else if (salarioBruto > 1500 && salarioBruto <= 2500 ) { //Salário bruto até 2500 (inclusive) - desconto de 10%
            desconto = 10d;   
            iR = (salarioBruto * 10) / 100;  
            
        } else { //Salário bruto acima de 2500 - desconto de 20%
            desconto = 20d;   
            iR = (salarioBruto * 20) / 100;
        }


        double totalDescontos = inss + iR;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println(" ");
        System.out.println("Salário Bruto: (" + valorHora + " * " + horasTrabalhadas + ")          : R$  " + salarioBruto);
        System.out.println("(-)    IR    ( " + desconto + "%)         " +"         : R$  " + iR);
        System.out.println("(-)   INSS   ( 3%)           " +"         : R$  " + inss);
        System.out.println("FGTS (11%)           " +"                 : R$  " + fgts);
        System.err.println("Total de Descontos                    : R$  " + totalDescontos);
        System.err.println("Salário Líquido                       : R$  " + salarioLiquido);
        System.out.println(" ");
    }
}
