import java.util.Scanner;

// ficou um código complexo e com muitas arestas por isso vou comentar ponto a ponto
public class exercicio20 {

    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       // crei uma flag porque o exercício exigeque o usuário escolha executar quantas vezes quiser
       boolean flag = true;  
       String resposta;  
       int num1;
       
       // então o primeiro while define a interrupção ou continuação da executação, se o usuário escolhe sim a flag é true e executa se não ela é falsa e interrompe
       while (flag == true) {
                System.out.println("Informe um número: ");
                num1 = scan.nextInt();

                // o código exige que a execução seja entre 0 e 16 por isso esse if         
                if (num1 <=0 || num1 > 16) {

                    System.out.println("O número precisa ser positivo e menor que 16");
                    flag = false;
                } else {

                    // com o número dentro do cretério ele executa o fatorial abaixo:

                            long num = num1;
                            long i = num;
                        
                        while (i > 1) {
                            i--;
                            System.out.println("O fatorial de " + num1 + "!=" + num1 + "*" + i);
                            num = (num * (i));                         

                        }

                        // aqui eu executo a continuação ou não da execução do programa, uso a flag para exigir a reposta válida
                        do {
                            System.out.println("Deseja executar novamente? S - Sim N- Não");
                            resposta = scan.next(); 
                                if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n")){
                                    flag = false;
                                }
                                    
                        } while (flag == true);                            
                            
                            // por fim baseado no sim ou não uso novamente a flag para executar ou encerrar, atribuindo false ou true a flag                            
                            if (resposta.equalsIgnoreCase("s")) {
                                            flag = true;
                            } else if (resposta.equalsIgnoreCase("n")) {
                                    flag = false;
                                System.out.println("Obrigado e até mais!");
                            } 
                               
                }  
                    
        }        
    }             

}
//     0. Altere o programa de cálculo do fatorial, permitindo ao usuário calcular
///o fatorial várias vezes e limitando o fatorial a números inteiros positivos
//e menores que 16.

