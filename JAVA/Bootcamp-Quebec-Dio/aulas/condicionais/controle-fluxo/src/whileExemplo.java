import java.util.concurrent.ThreadLocalRandom; // para números aleatórios

public class whileExemplo {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada > 0) {
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
            valorDoce = mesada;
            

            System.out.println("Doce do valor: " + valorDoce + "Adicionado no carrinho");
            valorDoce = mesada - valorDoce;
        }
     
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);            
    }
   
}

 /*João recebeu 50 reais de mesada e foi em uma loja de doces gastar todo seu dinheiro, logo enquanto
    o valor dos doces não igualar a R$ 50,00 ele foi adicionando ao carrinho*/
