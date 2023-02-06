/*3. Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd'; */

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
       
        // boa pratica do java declarar as variaveis fora dos blocos de repetição
        String nome;
        double salario;

        do {
            System.out.println("Entre com seu nome");
            nome = scan.nextLine();
        } while (nome.length() < 3);
                  
        int idade = 0;   

        do {

            System.out.println("Entre com sua idade: ");
            idade = scan.nextInt();

        } while (idade < 0 || idade > 150);

        System.out.println("Informe o salário: ");
            salario = scan.nextDouble();

        while (salario < 0) {
            System.out.println("Salário inválido: ");
            salario = scan.nextDouble();
            
        }
        
        System.out.println("Informe seu sexo, M-Masculino ou F-feminino ");
        String sexo = scan.next();

        boolean sexoinvalid = true;
        if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
            sexoinvalid = true;
        }  else{
            sexoinvalid = false;
            while (sexoinvalid == false) {
                System.out.println("Inválido. Informe seu sexo, M-Masculino ou F-feminino ");
                sexo = scan.next();
                if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                sexoinvalid = true;
                }
            }
        }
        
        //Estado Civil: 's', 'c', 'v', 'd';
        
        System.out.println("Informe seu estado civil:  's', 'c', 'v', 'd");
        String civil = scan.next();

        while (civil.length() > 1) {
            System.out.println("Informe seu estado civil:  's', 'c', 'v', 'd");
        }

        boolean validCivil = true;
        switch (civil) {
            case "s": validCivil = true; break;
            case "c": validCivil = true; break;
            case "v": validCivil = true; break;
            case "d": validCivil = true; break;
            default: validCivil = false; 
        } 
        

        while(validCivil == false) {

            System.out.println("Informe seu estado civil:  's', 'c', 'v', 'd");
            civil = scan.next();

            switch (civil) {
                case "s": validCivil = true; break;
                case "c": validCivil = true; break;
                case "v": validCivil = true; break;
                case "d": validCivil = true; break;
            }    

        }
           
        

    }
}
