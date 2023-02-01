/*5 - Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:

Aprovado se for maior ou igual a sete
Reprovador menor do que sete
Aprovado com Distinção se a média for igual a dez */
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Informe a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if ( media >= 7) {
            System.out.println("Parabéns você foi aprovado!");
        } else if (media == 10) {
            System.out.println("UAU! Você foi aprovado com DISTINÇÃO!");
        } else {
            System.out.println("Infelizmente você foi reprovado. Estude mais no ano que vem!");
        }
    }
}