import java.util.Scanner;
public class eercicio26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        for (int i=0;i<5;i++){
            System.out.println("Informe um número no intervalo de 1 a 5: ");
            num = scan.nextInt();

                switch (num) {
                    case 1: System.out.println("Digitou: Um"); break;
                    case 2: System.out.println("Digitou: Dois"); break;
                    case 3: System.out.println("Digitou: Três"); break;
                    case 4: System.out.println("Digitou: Quatro"); break;
                    case 5: System.out.println("Digitou: Cinco"); break;
                    default:
                        System.out.println("Número inválido");
                }
        }
    }
}
/*26. Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número
que não esteja neste intervalo, exibir a seguinte mensagem: número inválido*/