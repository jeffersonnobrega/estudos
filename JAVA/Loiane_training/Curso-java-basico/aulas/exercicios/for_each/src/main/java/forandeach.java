import java.util.Random;

public class forandeach {
    public static void main(String[] args) {

        int[] notas = new int[10];

        Random random = new Random();

        for(int i=0;i<notas.length;i++){
            notas[i] = random.nextInt(10);
        }

        for(int i=0;i<notas.length;i++){
            System.out.println(notas[i]);
        }


    }

}
