import java.util.Scanner;

public class exercicio21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = scan.nextInt();
        boolean primo = true;

        for(int i=2; i < num; i++){ //começa no 2 pq todo número é divisível por 1 e i < num ao invés de I <=, pq todo número é divisível por ele mesmo
            if (num % i == 0) {
                System.out.println("Não é número primo");
                primo = false;
            }        
        }

        if (primo) {
        System.out.println("é um número primo");
        }

    }
}
    /*21.Faça um programa que peça um número inteiro e determine se ele é
ou não um número primo. Um número primo é aquele que é divisível
somente por ele mesmo e por 1.*/