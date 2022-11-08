/* Joãozinho resolveu ligar para o seu amigo dizendo que hoje se entupiu de comer doeces
 * a proposta é, joaozinho vai telefonar, enquanto estiver discando ele vai ficar tocando, quando atender o do é interrompido
 */
import java.util.Random;

public class exemploDoWhile {

    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            //executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");
        }while(tocando());

        System.out.println("Alô !!!");
    }
    
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }
}
