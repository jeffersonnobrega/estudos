/*7. Faça um programa que leia 5 números e informe o maior número */
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        /*int num = 0;
        int maior = 0;        
        
        for(int i=0; i<5; i++) {
            if (maior < num) {
                maior = num;
            }    
            
            System.out.println("Informe um número: ");
            num = scan.nextInt();                     
        }

        System.out.println("O número maior é " + maior);*/

        //ACIMA É MINHA LÓGICA ABAIXO É A LÓGICA DA PROFESSORA

        int num;
        int maior = Integer.MIN_VALUE; //esse é o menor número possível

        for(int i=0; i<5; i++){
            System.out.println("Entre com o número: ");
            num = scan.nextInt();

            if (num > maior) {
                maior = num;
            }  

        System.out.println("O número maior é " + maior); 

        }
    }
    
    }

   