import java.util.Scanner;

/*4 - Faça um programa que verifique se uma letra digitada é vogal ou consoante. */



public class exercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe uma letra qualquer: ");
        String letra = scan.next();

       switch(letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U": System.out.println("É vogal"); break;
            default: System.out.println("É consoante");
        }
        
        
    }
}



