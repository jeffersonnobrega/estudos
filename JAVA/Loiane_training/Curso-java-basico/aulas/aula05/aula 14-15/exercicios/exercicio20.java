/*5 - Faça um programa para a leitura de duas notas parciais de um alino. O programa deve calcular a média alcançada por aluno e apresentar:

Aprovado se for maior ou igual a sete
Reprovador menor do que sete
Aprovado com Distinção se a média for igual a dez
 */

 import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.println("Informe a terceira nota: ");
        double nota3 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if ( media >= 7 && media < 10) {
            System.out.println("APROVADO! Parabéms. Você alcançou a media " + media);
        } else if (media < 7 ) {
            System.out.println("REPROVADO! Infelizmente a media " + media + " não foi o suficiente para aprovação. Estude mais");
        } else if (media == 10) {
            System.out.println("UUAU! Você foi aprovado com DISTINÇÃO ao atingir a incível média de " + media);
        }

    }
}
