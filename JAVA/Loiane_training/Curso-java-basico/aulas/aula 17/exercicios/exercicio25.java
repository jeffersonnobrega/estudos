import java.util.Scanner;
public class exercicio25 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas pessoas? Informe: ");
        int pessoas = scan.nextInt();

        int idade;
        int soma = 0;
        double media;

        for (int i=0;i<pessoas;i++ ){
            System.out.println("Informe a idade: ");
            idade = scan.nextInt();
            soma += idade;

        }
        media = soma / pessoas;

        System.out.println("A Média de idade é " + media);

        if (media > 0 && media <=25 ) {
            System.out.println("Média de Jovens");
        } else if (media > 25 && media < 60){
            System.out.println("Média de Adultos");
        } else  {
            System.out.println("Média de Idosos");
        }
        
       
    }
}

/*25.Faça um programa que peça para n pessoas a sua idade, ao final o 
programa devera verificar se a média de idade da turma varia entre 0 e 
25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta 
ou idosa, conforme a média calculada. */
