package exercicios;
import java.util.Scanner;
public class exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o n-ébimo termo da série de Fibonnaci");
        int n = scan.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.println(primeiro);
        System.out.println(segundo);
    // o i vai começar do três pq acima tem o termo um e o termo 2

        for (int i=3;i<=n; i++){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);
        }




    // NÃO CONSEGUI. MAS O PROBLEMA FOI MINHA MATEMÁTICA E NÃO A LINGUAGEM
    }
}

/*15. A série de Fibonacci é formada pela seqüência
1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série
até o n−ésimo termo.*/