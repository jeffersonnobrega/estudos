public class Resultado{
    public static void main(String[] args) {
        int nota = 6;

        if(nota >=7)
        System.out.println("Aprovado");

        else if (nota > 5 && nota < 7)
        System.out.println("Está de recuperação");

        else
        System.out.println("Reprovado");
        //quando tiver mais de uma instrução dentro do if ou do else é preciso colocar {}
    }
}

