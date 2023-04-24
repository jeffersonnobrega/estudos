package exercicio;
import java.util.Scanner;
public class exercicio28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        float salarioAtual;
        float salarioMinimo;
        float salarioTodos = 0;
        float aumento;
        float salarioReajustado;
        float totalAumento = 0;

        //Leia o nome do funcionário, seu salário e o valor do salário mínimo
        System.out.println("Defina antes do início o valor do salário mínimo: ");
        salarioMinimo = scan.nextFloat();

        for (int i=1;i<=4;i++) {
            System.out.println("Informe o nome do funcionário: ");
            nome = scan.next();

            System.out.println("Informe o salário atual do funcionário: ");
            salarioAtual = scan.nextFloat();

            salarioTodos += salarioAtual;

            //50% para aqueles que ganham menos do que três salários mínimos
                if (salarioAtual < (salarioMinimo*3)) {
                    aumento = salarioAtual * 50 / 100;
                    salarioReajustado = salarioAtual + aumento;
                    totalAumento += aumento;

                    //Escrever o nome do funcionário, o reajuste e seu novo salário.

                    System.out.println("Funcionário " + nome + " terá seu ajuste reajustado em 50% que corresponde a R$ " + aumento);
                    System.out.println("Assim seu salário passa a ser R$ " + salarioReajustado);

                    //20% para aqueles que ganham entre três até dez salários mínimos;
                } else if (salarioAtual >= (salarioMinimo*3) && salarioAtual <= (salarioMinimo*10)) {
                    aumento = salarioAtual * 20/ 100;
                    salarioReajustado = salarioAtual + aumento;
                    totalAumento += aumento;

                    System.out.println("Funcionário " + nome + " terá seu ajuste reajustado em 20% que corresponde a R$ " + aumento);
                    System.out.println("Assim seu salário passa a ser R$ " + salarioReajustado);
                    //15% para aqueles que ganham acima de dez até vinte salários mínimos;
                } else if (salarioAtual >(salarioMinimo*10) && salarioAtual <= (salarioMinimo*20) ) {
                    aumento = salarioAtual * 15 / 100;
                    salarioReajustado = salarioAtual + aumento;
                    totalAumento += aumento;
                    System.out.println("Funcionário " + nome + " terá seu ajuste reajustado em 15% que corresponde a R$ " + aumento);
                    System.out.println("Assim seu salário passa a ser R$ " + salarioReajustado);
                }
                // 10% para os demais funcionários
             else {
                aumento = salarioAtual * 10/ 100;
                salarioReajustado = salarioAtual + aumento;
                totalAumento += aumento;

                System.out.println("Funcionário " + nome + " terá seu ajuste reajustado em 10% que corresponde a R$ " + aumento);
                System.out.println("Assim seu salário passa a ser R$ " + salarioReajustado);

            }

        }
        System.out.println(" ");
        System.out.println("Os gastos atuais com salários da empresa são R$ " + salarioTodos);
        System.out.println("com os reajustes os gastos com salários passarão a ser + " + (salarioTodos + totalAumento));
    }
}
/*28. Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo
com os seguintes critérios:
a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos;
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
d. 10% para os demais funcionários

Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário
reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa
vai aumentar sua folha de pagamento;
*/