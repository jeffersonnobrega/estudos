/*
 * 4. Supondo que a população de um país A seja da ordem de 80000
habitantes com uma taxa anual de crescimento de 3% e que a
população de B seja 200000 habitantes com uma taxa de crescimento
de 1.5%. Faça um programa que calcule e escreva o número de anos
necessários para que a população do país A ultrapasse ou iguale a
população do país B, mantidas as taxas de crescimento.

a cada um ano A cresce quanto? Cacular a porcentagem
a cada ano B cresce quanto calcular a porcetagem

enquanto A for menor que B execute e a cada valor aumente 1 na variável ano
 */

public class exercicio4 {
    
    public static void main(String[] args) {
        
        double populacaoA = 80000;
        double taxaCrescimentoA = 0;

        double populacaoB =200000;
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

        // ABAIXO A FORMA COMO A PROFESSORA FEZ e minha matemática está errada

        int popA = 80000;
        int popB = 200000;
        int cont = 0;

        while (popA < popB) {

            popA += (popA/100) * 3;
            popB += (popA/100)  * 1.5;
            cont++;
        }

        System.out.println("População A " + popA);
        System.out.println("População B " + popB);
        System.out.println("Qtd anos " + cont);



    }

}
