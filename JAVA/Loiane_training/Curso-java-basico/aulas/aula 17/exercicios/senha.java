import java.util.Random;


public class senha {
    public static void main(String[] args) {
        
        //instância um objeto da classe Random usando o construtor básico
        Random gerador = new Random();

        //o padrão da senha deve ser da seguinte forma:
        // uma letra maíscula, seguida de 4 letras minúscula + quatro numeros + um caracter especial

        // gerando a letra maíscula

        String letraCapsLockOn = "ABCDEFGHIJKLMNOPQRSTUVWYZ";

        // chama o random recebendo os valores da variável string
        int randomLetra1 = gerador.nextInt(letraCapsLockOn.length());        

        // o charAT busca no índice (randomletra1) a letra "sorteada"
        char indiceMaiuscula = letraCapsLockOn.charAt(randomLetra1);

        System.out.print(indiceMaiuscula);

        // gerando as 4 letras minúsculas

        String letrasCapsLockOff;
        int randomMinuscula;
        char indiceMinuscula;

        for (int i = 0; i < 4; i++) {
            letrasCapsLockOff = "abcdefghijklmnopqrstuvwyz";
            randomMinuscula = gerador.nextInt(letrasCapsLockOff.length());
            indiceMinuscula = letrasCapsLockOff.charAt(randomMinuscula);

            System.out.print(indiceMinuscula);          
            
        }

        //gerando 4 números aleatórios entre 0 e 9
        for (int i = 0; i < 4; i++) {
            System.out.print(gerador.nextInt(9));
        }
        
        //gerando um caracter especial aleatório

        String caracter = "!@#$%&*?<>/-";

        int randomCaracter = gerador.nextInt(caracter.length());
        char indiceCaracter = caracter.charAt(randomCaracter);

        System.out.print(indiceCaracter);        


    }
}
