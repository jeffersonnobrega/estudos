import java.util.Random;
public class gerador_senha {

    public static void main(String[] args) {

     //instância um objeto da classe Random usando o construtor básico
     Random gerador = new Random();

     String[] letras = {
               "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V","W", "Y", "Z" };

       int primeraLetra = letras.length;
       int letraMaiuscula= (int) (Math.random() * primeraLetra);
       String inicio = letras[letraMaiuscula];

        System.out.print(inicio);

       String caracter = "!@#$%&*?<>/-";

        int randomUm = gerador.nextInt(caracter.length());
        char randomChar = caracter.charAt(randomUm);

        System.out.print(randomChar);

        for (int i=0; i < 4; i++) {
            System.out.print(gerador.nextInt(9));
        }

        for (int i=0; i < 3; i++) {
            String minusculas = "abcdefghijklmnopqrstuvwyz";
            int randomMin = gerador.nextInt(minusculas.length());
            char letrasMin = minusculas.charAt(randomMin);

            System.out.print(letrasMin);
        }

        int randomDois = gerador.nextInt(caracter.length());
        char randomCharDois = caracter.charAt(randomDois);

        System.out.print(randomCharDois);
    }
}
