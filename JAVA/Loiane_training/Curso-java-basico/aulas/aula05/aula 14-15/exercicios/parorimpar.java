import java.util.Scanner;

public class parorimpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); 

        System.out.println("Informe um número inteiro: ");
        int num = scan.nextInt();

            if (num%2 == 0) {
                System.out.println("O número : " + num + " é par");
            } else {
                System.out.println("O número " + num + " é impár.");
            }
            
        }
}
