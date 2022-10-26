public class PlanoOperadora_switchcase {
    public static void main(String[] args) {
        String plano = "M"; //M / T

        switch(plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}

//diferente do anterior, como esse case não tem break, no caso M ele executa tudo o que estive em M e abaixo, puxando assim a informação whats, insta, 100 mintuos de ligação
//enquanto no anterior foi preciso escrever cada um em um if else, assim diminuiu o número de linhas

// além disso é importante estudar os conceitos de continue, break e default