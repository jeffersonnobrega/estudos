/*9- Faça um programa que leia três números e mostre-os em ordem decrescente. */

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int x = scan.nextInt();

        System.out.print("Informe o segundo número: ");
        int y = scan.nextInt();

        System.out.print("Informe o terceiro número: ");
        int z = scan.nextInt();

        // Possiveis combinações:
        // x > y > z --------- x > z > y
        // y > x > z --------- y > z > x
        // z > x > y --------- z > y > x
        
        if( ( x > y && x > z ) && ( y > z ) ) { //  x > y > z
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        }
        else if( ( x > y && x > z ) && ( z > y ) ) { // x > z > y
            System.out.println(x);
            System.out.println(z);
            System.out.println(y);
        }
        else if( ( y > x && y > z ) && ( x > z ) ) { //y > x > z
            System.out.println(y);
            System.out.println(x);
            System.out.println(z);
        }
        else if( ( y > x && y > z ) && ( z > x ) ) { // y > z > x
            System.out.println(y);
            System.out.println(z);
            System.out.println(x);
        }
        else if( ( z > x && z > y ) && ( x > y ) ) { // z > x > y
            System.out.println(z);
            System.out.println(x);
            System.out.println(y);
        }
        else if( ( z > x && z > y ) && ( y > x ) ) { // z > y > x
            System.out.println(z);
            System.out.println(y);
            System.out.println(x);
        }
    }
}
