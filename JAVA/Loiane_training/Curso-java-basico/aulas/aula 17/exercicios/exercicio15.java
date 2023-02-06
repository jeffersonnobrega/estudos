package exercicios;
import java.util.Scanner;
public class exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n= 0;
        int num = 0;

        System.out.println("Digite um número maior que 0");
        num = scan.nextInt();

        if (n == 1 || n ==2) {
            System.out.println("Inválido");
        } else {
            System.out.println(n);

        }
    // NÃO CONSEGUI. MAS O PROBLEMA FOI MINHA MATEMÁTICA E NÃO A LINGUAGEM
    }
}

/*15. A série de Fibonacci é formada pela seqüência
1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série
até o n−ésimo termo.*/