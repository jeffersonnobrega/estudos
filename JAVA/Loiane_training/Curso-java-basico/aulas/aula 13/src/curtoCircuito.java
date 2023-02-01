public class curtoCircuito {
    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso & verdadeiro; //não é curto circuito
        boolean resultado2 = falso && verdadeiro;
        System.out.println(resultado1);
        System.out.println(resultado2);

        /*explicação, só dá verdadeiro se os dois valores forem verdadeiros
         no & ele faz ler o primeiro falso e o verdadeiro
         já no && quando ele vê que o primeiro valor é falso ele nem olha o segundo pq sabe que o resultado
         será falso de qualquer maneiro, por isso no dia a dia usa-se o && 
        
        */
       }
}
