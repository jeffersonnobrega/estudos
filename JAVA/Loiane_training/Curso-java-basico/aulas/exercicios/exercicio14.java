/**
 * João Papo-de-Pescador homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de SP (50 kg) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e verifique se há excesso. Se houver, gravar na variável excesso e na variável multa o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
 * 
 * PASSOS:
 * 
 * pedir a variável pesoPeixe
 * variável pesoLimite
 * variável excesso
 * variável multa 
 */
import java.util.Scanner;
 
public class exercicio14 {  

    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.print("Informe quantos Kg têm no total de peixes pescados: ");
    double pesoPeixe = scan.nextDouble();

    double pesoLimite = 50d;  
   
    if (pesoPeixe > pesoLimite){
        
    double excesso = pesoPeixe - pesoLimite - 1;
    double multa =  4 * excesso; 
    
    System.out.println("Você excedeu " + excesso + "Kg do limite permitido e por isso deve pagar uma multa de R$ " + multa);

    } else {
       Byte excesso = 0;
       Byte multa = 0;

       System.out.println("Excesso: " + excesso);
       System.out.println("Multa a pagar: " + multa);
    }


   } 
    
}