import java.util.Scanner;

public class exercicio39 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int cont = 1, id = 0, alunoMaior = 0, alunoMenor = 0;
        double altura=0, menorAltura=300, maiorAltura=0;

        while (cont <= 10) {
            System.out.println("Informe o ID do aluno:");
            id = scan.nextInt();

            System.out.println("Informe a altura do aluno:");
            id = scan.nextInt();

            if (altura > maiorAltura) {
                maiorAltura = altura;
                alunoMaior = id;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
                alunoMenor = id;
            }

            cont++;
        }
        
        System.out.println("O aluno  " + alunoMaior + "é o mais alto com " + maiorAltura);
        System.out.println("O aluno  " + alunoMenor + "é o menor com " + menorAltura);
              
    }
}
/*39. Faça um programa que leia dez conjuntos de dois valores, o primeiro
representando o número do aluno e o segundo representando a sua
altura em centímetros. Encontre o aluno mais alto e o mais baixo.
Mostre o número do aluno mais alto e o número do aluno mais baixo,
junto com suas alturas. */