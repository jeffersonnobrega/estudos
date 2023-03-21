import java.util.Scanner;
public class exercicio36 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quer a tabuada de qual número? ");
        int tab = scan.nextInt();

        System.out.println("Informe o valor inicial: ");
        int num1 = scan.nextInt();

        System.out.println("Informe o valor final: ");
        int num2 = scan.nextInt();

        int result = 0;

        System.out.println("Vou montar a tabuada de " + tab + " começando em " + num1 +  " e terminando em " + num2);
        if (num1 < num2) {

            for (int i=num1; i <= num2; i++) {
                result = tab * i;
                System.out.println(tab + " x " + i + " = " + result);
            }

        } else {
            System.out.println("O número final não pode ser menor que o inicial");
        }

    }
}
/*.Desenvolva um programa que faça a tabuada de um número qualquer 
inteiro que será digitado pelo usuário, mas a tabuada não deve 
necessariamente iniciar em 1 e terminar em 10, o valor inicial e final 
devem ser informados também pelo usuário, conforme exemplo 
abaixo:
o Montar a tabuada de: 5 
o Começar por: 4 
o Terminar em: 7 
o
o Vou montar a tabuada de 5 começando em 4 e terminando em 7: 
o 5 X 4 = 20 
o 5 X 5 = 25 
o 5 X 6 = 30 
o 5 X 7 = 35
Obs: Você deve verificar se o usuário não digitou o final menor 
que o inicial */