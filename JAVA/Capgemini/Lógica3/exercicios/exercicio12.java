import java.util.Scanner;
public class exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double custoFabrica;
        double precoProvisorio;
        double percentoDistribuidor;
        double impostos;
        double precoCarroNovo;


        System.out.println("Informe o custo de fábrica do veículo: ");
        custoFabrica = scan.nextDouble();

        impostos = (custoFabrica * 45) / 100;
        precoProvisorio = custoFabrica + impostos;
        percentoDistribuidor = (precoProvisorio * 28) / 100;

        precoCarroNovo = (custoFabrica + percentoDistribuidor + impostos);

        System.out.println("O custo de fábrica é R$ " + custoFabrica);
        System.out.println("Há R$ " + impostos + " de impostos");
        System.out.println("Há também R$ " + percentoDistribuidor + " de porcetagem do distruibuidor");
        System.out.println("Assim o carro sairá por R$" + precoCarroNovo);


    }
}
/** 12. O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
 dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
 do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
 45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
 mesmo;*/