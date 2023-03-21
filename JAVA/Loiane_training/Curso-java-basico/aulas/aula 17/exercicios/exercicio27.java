import java.util.Scanner;

public class exercicio27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //pedir quantidade de turmas

        System.out.println("Informe a quantidade de turmas: ");
        int turmas = scan.nextInt();
        int soma=0;
        double media;

        //pedir quantidade de alunos para cada turma

        for (int i=1;i<=turmas;i++) {

        System.out.println("Informe a quantidade de alunos para a tuma " + i + ":");
        int alunosQtd = scan.nextInt();
        
            if (alunosQtd > 40) {
                System.out.println("O limite máximo de alunos por turma são 40 alunos. Favor digitar novamente");
                i--;
                alunosQtd = 0;
            }

        soma += alunosQtd;


        }
        // calcular a media de alunos por turmas

        media = soma / turmas;
        
        System.out.println("A média de alunos por turma é de " + media + " alunos.");

        
        
    }
}
/*Faça um programa que calcule o número médio de alunos por turma. 
Para isto, peça a quantidade de turmas e a quantidade de alunos para 
cada turma. As turmas não podem ter mais de 40 alunos. */