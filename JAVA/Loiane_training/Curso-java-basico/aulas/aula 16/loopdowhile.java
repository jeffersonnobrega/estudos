
public class loopdowhile {

    public static void main(String[] args) {

        int i = 1;
        int max = 10;

        System.out.println("Contando até " + max);

        // while enquanto
        while (i <= max) {

            System.out.println("valor de i " + i);       
            i++; // i = i +1;9  

        }

        // do while faça enquanto
        System.out.println("");

        do {
            i--;
            
            System.out.println("valor de i " + i);
        } while (i > 0);

        System.out.println(i);

        // no while ele avalia a expressão se for verdadeira ele executa o bloco de código
        // já no do while primeiro ele executa e depois avalia

    }

}