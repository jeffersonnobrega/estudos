import java.util.Scanner;
public class exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        float nota = 0;
        float media = 0;
        float soma = 0;
        boolean flag = true;

        System.out.println("Informe o nome do aluno:");
        nome = scan.next();

            for (int i=1;i<=3;i++) {
                flag = true;

               do {
                   System.out.println("Informe a nota do bimestre " + i + ":");
                   nota = scan.nextFloat();

                    if (nota >= 0 && nota <=10) {
                        flag = false;
                    } else {
                        System.out.println("A nota precisa estar entre 0 e 10.");
                    }


               } while (flag == true);
                soma += nota;
            }
        media = soma / 3;

            if (media >= 7) {
                System.out.println("Aluno " + nome + " aprovado com média " + media);
            } else if (media <= 5) {
                System.out.println("Aluno " + nome + " reprovado com média " + media);
            } else if (media > 5 && media < 7) {
                System.out.println("Aluno " + nome + " em recuperação com média " + media);
            } else {
                System.out.println("Algumas das notas informadas são menores " +
                        "que zero ou ultrapassam 10, assim não foi possível calcular. Favor refazer o processo");
            }
    }
}
/*16. Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a
sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
Recuperação (media entre 5.1 a 6.9);*/