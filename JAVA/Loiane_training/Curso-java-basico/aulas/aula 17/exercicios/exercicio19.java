import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a quantidade de números do conjunto: ");
        int n = scan.nextInt();
        int num = 0;
        int maior = Integer.MIN_VALUE; //esse é o menor número possível
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        
        System.out.println("Informe um número: ");
        int cont = scan.nextInt();

        if (cont >= 0 && cont <= 1000 ) {

            for ( int i = 1 ; i < n; i++) {
                
                System.out.println("Informe um número: ");
                num = scan.nextInt();

                soma += num;

                if ( cont < menor) {
                    menor = cont;
                }
                if (num < menor) {
                    menor = num;
                }
                if ( cont > maior) {
                    maior = cont;
                }
                if (num > maior) {
                    maior = num;
                }

            }
            
        } else {
            System.out.println("Inválido");
        }

        System.out.println("soma " + (soma + cont));
        System.out.println("maior " + maior);
        System.out.println("menor " + menor);

    }
}

/*19.Altere o programa anterior para que ele aceite apenas números entre 0
e 1000.*/
