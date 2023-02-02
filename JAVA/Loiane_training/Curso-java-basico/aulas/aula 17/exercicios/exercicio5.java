/*5. Altere o programa anterior permitindo ao usuário informar as
populações e as taxas de crescimento iniciais. Valide a entrada e
permita repetir a operação. */

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a população do país A: ");
        double populacaoA = scan.nextDouble();

        double taxaCrescimentoA = 0;

        System.out.println("Informe a população do país B: ");
        double populacaoB = scan.nextDouble();
        
        double taxaCrescimentoB = 0;     

        double ano = 1;

        while (populacaoA <= populacaoB) {
            
            taxaCrescimentoA = (populacaoA / 100) * 3;
            taxaCrescimentoB = (populacaoB / 100) * 1.5;
            populacaoA = populacaoA + taxaCrescimentoA;
            populacaoB = populacaoB + taxaCrescimentoB;
            
            ano++;

         }

        System.out.println("Serão necessários " + ano + " anos para que o país A iguale ou ultrapesse o país B em números de habitantes");
    }
}
