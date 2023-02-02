/*7. Faça um programa que leia 5 números e informe o maior número */
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num = 0;
        int maior = 0;        
        
        for(int i=0; i<5; i++) {
            if (maior < num) {
                maior = num;
            }    
            
            System.out.println("Informe um número: ");
            num = scan.nextInt();                     
        }

        System.out.println("O número maior é " + maior);
    }
    
    }

   