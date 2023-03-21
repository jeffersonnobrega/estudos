import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio33 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        boolean encerrar = false;
        double temperatura = 0;
        double maior = Integer.MIN_VALUE; //esse é o menor número possível
        double menor = Integer.MAX_VALUE;
        double soma = 0;
        double media = 0;
        String continuar;
        int cont = 0;

        do {

            System.out.println("Informe a temperatura:");
            temperatura = scan.nextDouble();

            soma += temperatura;

                if (temperatura < menor) {
                    menor = temperatura;
                }
                if (temperatura > maior) {
                    maior = temperatura;
                }

                System.out.println("Digite S se quiser adicionar nova temperatura: ");
                continuar = scan.next();

                if (continuar.equalsIgnoreCase("s")) {
                    encerrar = false;
                } else {
                    encerrar = true;
                } 
                
            cont++;

        } while (encerrar == false);

        media = soma / cont;

        System.out.println("maior " + maior);
        System.out.println("menor " + menor);
        System.out.println("média " + media);
        
    }
}
/*33.O Departamento Estadual de Meteorologia lhe contratou para 
desenvolver um programa que leia as um conjunto indeterminado de 
temperaturas, e informe ao final a menor e a maior temperaturas 
informadas, bem como a média das temperaturas. */