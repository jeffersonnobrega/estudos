import java.util.Scanner;
public class exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome,sexo;
        int countH = 0;
        int countF = 0;

            for (int i=0; i<5;i++){
                System.out.println("Informe o nome: ");
                nome = scan.next();

                System.out.println("Informe o sexo. M-Masculino ou F-Feminino");
                sexo = scan.next();

                if (sexo.equalsIgnoreCase("m")){
                    countH++;
                } else if (sexo.equalsIgnoreCase("f")) {
                    countF++;
                } else {
                    System.out.println("Sexo inválido");
                }

            }
        System.out.println("Total de homens: " + countH);
        System.out.println("Total de mulheres: " + countF);
    }
}

/*19. Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou
mulher. No final informe total de homens e de mulheres;*/
