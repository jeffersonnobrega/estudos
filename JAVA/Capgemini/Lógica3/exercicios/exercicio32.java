import java.util.Scanner;
public class exercicio32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numA,numB,numC;


        System.out.println("Informe o primeiro valor: ");
        numA = scan.nextInt();
        System.out.println("Informe o segundo valor: ");
        numB = scan.nextInt();
        System.out.println("Informe o terceiro valor: ");
        numC = scan.nextInt();

        // verifique se eles forma um triângulo.
        /*Condições para formação de um triângulo:


        a < b + c
        b < a + c
        c < a + b*/

        if (numA < (numB + numC) && numB < (numA + numC) && numC < (numA + numB) ) {
            System.out.println("Os três números formam um triângulo.");

            //equilátero? Regra:  três lados iguais
            //isóscele? Regras: dois lados iguais
            //escaleno? comprimentos de seus três lados diferentes

            if (numA == numB && numB == numC && numA == numC) {
                System.out.println("Esse é um triângulo equilátero");
            } else if (numA == numB || numA == numC || numB == numC){
                System.out.println("Esse é um triângulo isóscele");
            } else {
                System.out.println("Esse é um triângulo escaleno");
            }
        } else {
            System.out.println("Os três valores não formam um triângulo");
        }
    }
}

/*32. Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo.
Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.
Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos
outros dois lados.

a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
c. Triângulo equilátero é também isóscele;
d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;*/