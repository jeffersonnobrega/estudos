import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        float temperaturaF;
        float temperaturaC;

        System.out.println("Informe a temperatura em graus Celsuis: ");
        temperaturaC = scan.nextFloat();

        //F=(9*C+160) / 5

        temperaturaF = (9 *temperaturaC + 160) / 5;

        System.out.println("A temperatura " + temperaturaC + " graus Celsius convertida fica: " + temperaturaF + " Fahrenheit");

    }
}

/** 7. Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de
 conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius; */
