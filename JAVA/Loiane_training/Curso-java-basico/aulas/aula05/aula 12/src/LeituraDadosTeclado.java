import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        //ler uma linha inteira
        /*System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        //ler um tipo de dado específico

        System.out.println("Digite seu Primeiro Nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu first name é: " + primeiroNome);

        //ler um inteiro

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);

        //ler um double

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é: " + altura);*/

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem animal de estimação ");
        String primeiroNome = scan.next(); //só o next pega só a primeira palavra digitada
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte(); //byte pq ninguém é abraão para ter um milhão de filhos, então byte ocupa memória mínima
        float altura = scan.nextFloat(); // O float tem uma precisão de 6 casas decimais e o double tem uma precisão de 10 casas decimais
        boolean temPet = scan.nextBoolean();

        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("Primeiro Nome" + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Tem bichinho de estimação? " + temPet);

    }
}
