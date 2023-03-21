import java.util.Scanner;

public class exercicio40 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int flag = 0;
        int codigo = 0;
        int qtdVeiculos = 0;
        int qtdAcidentes = 0;
        int menorIndiceAcidente = Integer.MAX_VALUE;
        double menorIndiceAciValue = 0;
        int menorCodigoAci = 0;
        int maiorIndiceAcidente = 0;
        double maiorIndiceAciValue = 0;
        int maiorCodigoAci = 0;
        int somaVeiculos = 0;
        double mediaVeiculos = 0;
        int somaAcidentes = 0;
        double mediAcidentes = 0;

            while (flag < 3) {
                System.out.println("Informe o código da cidade ");
                codigo = scan.nextInt();

                System.out.println("Informe o o número de veículos de passeio ");
                qtdVeiculos = scan.nextInt();

                somaVeiculos += qtdVeiculos;

                System.out.println("Informe o número de acidentes com vítimas ");
                qtdAcidentes = scan.nextInt();

                if (qtdAcidentes < 2000) {
                    somaAcidentes += qtdAcidentes;
                }             

                if (qtdVeiculos < menorIndiceAcidente) {
                    menorIndiceAcidente = qtdAcidentes;
                    menorIndiceAciValue = menorIndiceAcidente * 100 / qtdVeiculos;
                    menorCodigoAci = codigo;
                }

                if (qtdVeiculos > maiorIndiceAcidente) {
                    maiorIndiceAcidente = qtdAcidentes;
                    maiorIndiceAciValue = maiorIndiceAcidente * 100 / qtdVeiculos;
                    maiorCodigoAci = codigo;
                }
                flag++;

            }

            mediaVeiculos = somaVeiculos / 5;
            mediAcidentes = somaAcidentes / 5;

            System.out.println("O maior indice de acidente acontece na cidade de codigo " + maiorCodigoAci + " com " + maiorIndiceAciValue + "% de acidentes");
            System.out.println("O menor indice de acidente acontece na cidade de codigo " + menorCodigoAci + " com " + menorIndiceAciValue + "% de acidentes");    
            System.out.println("A média de veículos nas cinco cidades juntas é de " + mediaVeiculos + " veiculos");
            System.out.println("A média a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio é de " + mediAcidentes + " acidentes");
    }
}
/*40.Foi feita uma estatística em cinco cidades brasileiras para coletar 
dados sobre acidentes de trânsito. Foram obtidos os seguintes dados:
. Código da cidade;
a. Número de veículos de passeio (em 1999);
b. Número de acidentes de trânsito com vítimas (em 
1999). 

Deseja-se saber:
c. Qual o maior e menor índice de acidentes de transito e a que 
cidade pertence;
d. Qual a média de veículos nas cinco cidades juntas;
e. Qual a média de acidentes de trânsito nas cidades com menos 
de 2.000 veículos de passeio */