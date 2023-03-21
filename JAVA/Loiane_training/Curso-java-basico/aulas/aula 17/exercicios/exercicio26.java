import java.util.Scanner;

public class exercicio26 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

              
        //pedir o número de eleitores
        System.out.println("Informe a quantidade de eleitores: ");
        int numEleitores = scan.nextInt();
        int voto = 0;
        int i = 0;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int nulos = 0;


        System.out.println("Eleitor " + i + "Favor escolher entres os canditados:");
        System.out.println("Psicopata 1 / Bebin 2 / Falso 3");

        //cada eleitor votar em um loop for
        do {
           
            System.out.println("Seu voto:");
            voto = scan.nextInt();
            
            
                if (voto == 1) {
                    candidato1 += 1;
                } else if (voto == 2) {
                candidato2 += 1;
                } else if (voto == 3) {
                    candidato3 += 1;
                } else {
                    nulos +=1;
                }

         i++;                        
        } while (i < numEleitores);

        //mostrar o candidato eleito

            if (candidato1 > candidato2 && candidato1 > candidato3) {
                System.out.println("Canditato Psicopata Eleito");
            } else if (candidato2 > candidato1 && candidato2 > candidato3) {
                System.out.println("Canditato Bebin Eleito");                 
            } else if (candidato3 > candidato2 && candidato3 > candidato1) {
                System.out.println("Canditato Falso Eleito");   
            } else {
                System.out.println("Empate, irá para segundo turno");
            }

        //mostrar o numero de votos de cada canditato

        System.out.println("O canditado Psicopata recebeu " + candidato1 + " votos");
        System.out.println("O canditado Bebin recebeu " + candidato2 + " votos");
        System.out.println("O canditado Falso recebeu " + candidato3 + " votos");
        System.out.println("Foram computados " + nulos + " votos nulos e inválidos");
       


        
    }
}
/*Numa eleição existem três candidatos. Faça um programa que peça o 
número total de eleitores. Peça para cada eleitor votar e ao final 
mostrar o número de votos de cada candidato. */