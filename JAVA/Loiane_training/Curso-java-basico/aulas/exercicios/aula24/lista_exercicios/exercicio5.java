package lista_exercicios;

public class exercicio5 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.numConta = 1006869415;
        contaCorrente.saldo = 3.50;
        contaCorrente.contaEscpecial = false;
        contaCorrente.limite = 1500;

        System.out.println("Número da conta: " + contaCorrente.numConta);
        System.out.println("Saldo da conta: " + contaCorrente.saldo);
        System.out.println("Limite da conta: " + contaCorrente.limite);

        if (contaCorrente.contaEscpecial){
            System.out.println("É uma conta especial");
        } else {
            System.out.println("Não é uma conta especial");
        }
    }

}
