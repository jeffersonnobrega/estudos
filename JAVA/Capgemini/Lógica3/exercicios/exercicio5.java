import java.util.Scanner;
public class exercicio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        float nota = 0;
        float soma = 0;
        float media = 0;

        System.out.println("Informe o nome do aluno: ");
        nome = scan.next();

            for (int i=1;i<=3;i++) {
                System.out.println("Digite a nota da prova " + i + ":");
                nota = scan.nextFloat();

                soma += nota;
            }

        media = soma / 3;

        System.out.println("A média do aluno " + nome +  " é de: " + media);

    }
}

/** 5. Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
 No finalinformar o nome do aluno e a sua média (aritmética);*/
