package exerciciosaula19;
/*/**  Ler as duas notas bimestrais para um conjunto de 10 alunos.
 //Armazenar as notas informadas em dois vetores nota1 e nota2 do
 //tipo real. Escreva um programa que calcule a média aritmética simples
 //das notas informadas armazenando o resultado em um vetor resultado
 //de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação de cada aluno.
 //Se a média calculada for superior ou igual a 7 o aluno
 //estará aprovado, caso contrário, a situação do aluno será
 //reprovado.*/
import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] nota1 = new double[4];
        double[] nota2 = new double[nota1.length];
        double[] resultado = new double[nota1.length];
        int[] aluno = new int[nota1.length];

        for(int i=0;i< nota1.length;i++){
            aluno[i] = i+1;
            System.out.println("Informe a primera nota do aluno ["+aluno[i]+"]: ");
            nota1[i] = scan.nextDouble();

            System.out.println("Informe a segunda do aluno ["+aluno[i]+"]: ");
            nota2[i] = scan.nextDouble();

            resultado[i] = (nota1[i] + nota2[i]) / 2;

        }

        for(int i=0;i<nota1.length;i++) {
            if(resultado[i] >= 7) {
                System.out.println("O aluno ["+aluno[i]+"] foi aprovado com média " + resultado[i]);
            } else {
                System.out.println("O aluno ["+aluno[i]+"] foi reprovado com média " + resultado[i]);
            }
        }

    }
}


