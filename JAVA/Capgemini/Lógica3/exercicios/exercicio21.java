import java.util.Scanner;
public class exercicio21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome, sexo, saude, pergunta;
        int idade = 0;
        int totaisAptos = 0;
        int total = 0;
        boolean flag = true;
        boolean apto = false;
        boolean continuar = true;

        while (flag == true) {

            System.out.println("Informe o nome: ");
            nome = scan.next();
             total++;

            do {
                continuar = true;
                System.out.println("Informe o sexo. M- Masculino F- Feminino");
                sexo = scan.next();

                switch (sexo) {
                    case "m":
                        continuar = false;
                        break;
                    case "M":
                        continuar = false;
                        break;
                    case "f":
                        continuar = false;
                        break;
                    case "F":
                        continuar = false;
                        break;
                    default:
                        System.out.println("caracter inválido");
                }
            } while (continuar == true);

            if (sexo.equalsIgnoreCase("m"))  {
            System.out.println("Informe a idade: ");
            idade = scan.nextInt();
            System.out.println("Informe como está a saúde");

            do {
                System.out.println("R-Ruim, B-Bom,O-Ótimo");
                saude = scan.next();
                continuar = true;
                switch (saude) {
                    case "r":
                        continuar = false;
                        break;
                    case "R":
                        continuar = false;
                        break;
                    case "b":
                        continuar = false;
                        break;
                    case "B":
                        continuar = false;
                        break;
                    case "O":
                        continuar = false;
                        break;
                    case "o":
                        continuar = false;
                        break;
                    default:
                        System.out.println("caracter inválido");
                }
            } while (continuar == true);

            /** condições para servir:
             * idade >= 18 && <=21
             * sexo f
             * saude b ou o*/


               if (idade >= 18 && idade <=21) {

                if (saude.equalsIgnoreCase("b") || saude.equalsIgnoreCase("o")) {
                    System.out.println("Prezado " + nome + " seja bem vindo ao serviço militar. Você está apto");
                    totaisAptos++;
                }  else {
                    System.out.println("Prezado " + nome + " devido sua saúde você não está apto. Procure um médico.");
                }

            }   else if (idade < 18) {
                System.out.println("Prezado" + nome + " você ainda é novo para prestar o serviço militar");
                System.out.println("Volte daqui " + (18 - idade) + " anos");

            }    else {
                System.out.println("Prezado " + nome + " infelizmente sua idade de serviço militar obrigatório já passou. Faça a prova de formação de oficiais");
            }
            } else {
                System.out.println("Prezada " + nome + " o serviço militar é apenas para homens. Mulheres podem fazer a formação de oficial.");
            }
            do {
                continuar = true;
                System.out.println("Deseja adicionar outra pessoa? S-sim N-Não para finalizar e exibir o resultado");
                pergunta = scan.next();

                if (pergunta.equalsIgnoreCase("s")) {
                    continuar = false;
                } else if (pergunta.equalsIgnoreCase("n")) {
                    flag = false;
                    continuar = false;
                } else {
                    System.out.println("caracter inválido.");

                }
            } while (continuar == true);


        }
        System.out.println("Foram avaliados o total de " + total + " canditados, desses " + totaisAptos + " estão aptos ao serviço militar ");
    }
}
/*1. Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta
ou não para cumprir o serviço militar obrigatório. Informe os totais;*/