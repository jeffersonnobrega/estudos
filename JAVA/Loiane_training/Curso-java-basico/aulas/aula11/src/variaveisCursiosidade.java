public class variaveisCursiosidade {
    public static void main(String[] args) {
        int var1 = 2147483647; //esse é o número máximo de números que cabe no int
        int var2 = 100;

        //se trocar o 7 pelo 8 no var1 dá erro pq é o limite da variável inteira
        // então o que acontece se eu somar var1 e var2? Vai dar erro?

        System.out.println(var1 + var2);

        //resultado não deu erro, depois do 7 ali ele vai somar para o início da contagem, como se fosse uma roleta. então 
        // o proximo valor depois do 2147483647 é o ínicio da cotagem que é o -2147483648, então se
        // va2 fosse 1 o resultado seria  -2147483648
        // isso é pra qualquer tipo de inteiro
    }
}
