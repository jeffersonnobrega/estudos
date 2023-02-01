import java.util.Scanner;

public class loopFor {

    public static void main(String[] args) {
        
        // for (inicialização; condição booleana; atualização)
        for (int i=0; i < 5; i++) { //as variaveis existem apenas nesse bloco e o valor dela só no bloco
            System.out.println(i);
        }

        //quando usa mais de uma variável seprar por vírgula

        for (int i=0, j=10; i < j ; i++, j--) {
            System.out.println(" I: " + i + "  |  J: " + j);
        }

        //for com parte ausentes

        int count = 0;
        for( ; count < 5; ) {
            System.out.println(" | Valor de count: " + count);
            count +=2;
        }

        for (int cont = 0; cont < 10; cont += 2) {
            System.out.println(" ** Valor de cont: " + cont);
        }

        int soma = 0;
        for( int i=1; i < 5; soma += i++);
        System.out.println("o valor da soma é " + soma);
    }

}