/*2. Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações. */

import java.util.Scanner;


public class exercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu nome de usuario alfa numérico: ");
        String nome = scan.next();

        System.out.println("Informe sua senha alfa numérica: ");
        String senha = scan.next();

        while (nome.equals(senha)) {
            System.out.println("A senha não pode ser a mesma que o usuário. Digite uma nova senha válida: ");
            senha = scan.next();
        }
        
        System.out.println("Login efetuado com sucesso!");
    }
}
