/*13. Faça um programa que leia um número e exiba o dia correspondente 
da semana(1-Domingo,2-Segunda e etc), se digitar outra valor deve aparecer valor inválido.
 * 
 */
import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 7: ");
        short dia = scan.nextShort();

        switch(dia) {
            case 1: System.out.println("Segunda"); break;
            case 2: System.out.println("Terça"); break;
            case 3: System.out.println("Quarta"); break;
            case 4: System.out.println("Quinta"); break;
            case 5: System.out.println("Sexta"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            
            default:
            System.out.println("Valor inválido");
        } 
    

    }

}
