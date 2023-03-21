import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = scan.nextInt();
        boolean primo = true;

        for(int i=2; i < num; i++){ //começa no 2 pq todo número é divisível por 1 e i < num ao invés de I <=, pq todo número é divisível por ele mesmo
            if (num % i == 0) {
                System.out.println("Não é número primo - divisível por " + i);
                primo = false;
            }        
        }

        if (primo) {
        System.out.println("é um número primo");
        }

    }
}

/*Altere o programa de cálculo dos números primos, informando, caso o 
número não seja primo, por quais número ele é divisíve */
