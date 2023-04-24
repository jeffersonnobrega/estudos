import java.util.Scanner;
public class exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;
        int count = 0;

        for(int i=0;i<80;i++){
            System.out.println("Informe um número: ");
            num = scan.nextInt();

                if (num >= 10 && num <= 150) {
                    count++;
                }

        }
        System.out.println(count + " números estão no intervalo entre 10 e 150");
    }
}
/*17. Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150
(inclusive);*/
