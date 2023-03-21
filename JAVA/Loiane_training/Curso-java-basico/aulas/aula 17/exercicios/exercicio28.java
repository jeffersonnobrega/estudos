import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de CD's: ");
        int qtdCD = scan.nextInt();
        double soma = 0;
        double media;

        for (int i=1;i<=qtdCD;i++){
            System.out.println("Informe o valor do CD " + i + ":");
            double valor = scan.nextDouble();

            soma += valor;
        }

        media = soma / qtdCD;
        System.out.println("O valor total investido em sua coleção é de R$ " + soma);
        System.out.println(" E a média gasta na coleção é de R$ " + media);
        
    }
}

/*28.Faça um programa que calcule o valor total investido por um 
colecionador em sua coleção de CDs e o valor médio gasto em cada 
um deles. O usuário deverá informar a quantidade de CDs e o valor 
para em cada um */