/*. Faça um programa que imprima na tela os números de 1 a 20, um
abaixo do outro. Depois modifique o programa para que ele mostre os
números um ao lado do outro. */

public class exercicio6 {
    
    public static void main(String[] args) {

        
        for (int i=1; i <= 20; i++ ) {
        System.out.println(i);
        
       }
       System.out.println("*******************************");   
        for (int i=1 , j=2; i <=20 && j<=20 ; i+=2, j+=2 ) {
            System.out.println(i + " | " + j);
        }
    }
}
