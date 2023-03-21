import java.text.DecimalFormat;

public class exercicio38 {
    public static void main(String[] args) {

        DecimalFormat deci = new DecimalFormat("0.00");

        double salarioInicial = 1000;
        int TotalAnos = 2023 - 1996;
        int ano = 1997;
        double porcentagem = 1.5;
        double aumento = 0;
        double dobro = 0;
        aumento = salarioInicial * porcentagem / 100;
        double soma = salarioInicial + aumento;

        for(int i=1;i<TotalAnos;i++) {
            
            dobro = aumento * 2;
            soma = salarioInicial + dobro;
            aumento = dobro;
            ano++;
            System.out.println("No ano de "+ano + " o salário é de: " + deci.format(soma));
        }
        
    }
}
/*38. Um funcionário de uma empresa recebe aumento salarial anualmente:
Sabe-se que:
. Esse funcionário foi contratado em 1995, com salário inicial de
R$ 1.000,00;
a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
b. A partir de 1997 (inclusive), os aumentos salariais sempre
correspondem ao dobro do percentual do ano anterior. Faça um
programa que determine o salário atual desse funcionário. Após
concluir isto, altere o programa permitindo que o usuário digite o
salário inicial do funcionário. */