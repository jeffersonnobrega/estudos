import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio38_2 {

    public static void main(String[] args) {

        DecimalFormat deci = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o salário inicial: ");
        double salarioInicial = scan.nextDouble();
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
/*Após
concluir isto, altere o programa anterior permitindo que o usuário digite o
salário inicial do funcionário. */ 
