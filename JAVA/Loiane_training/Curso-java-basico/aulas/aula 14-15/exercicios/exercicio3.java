import java.util.Scanner;

/*3 - Faça um programa que verifique se uma letra digitada é "F" ou "M". 
Conforme a letra escrever: F - Feminino, M - Masculino, Não-Binário. */

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu sexo através de uma letra: ");
        String letra = scan.next();
        String sexo = " ";

        if (letra.equals("f") || letra.equals("F")) {
            sexo = "F - Feminino";
        } else if (letra.equals("m") || letra.equals("M")) {
            sexo = "M - Masculino";
        }  else {
            System.out.println("Não-Binário ou LBGTQIA+");
        } 
        System.out.println(sexo);
    }
}
