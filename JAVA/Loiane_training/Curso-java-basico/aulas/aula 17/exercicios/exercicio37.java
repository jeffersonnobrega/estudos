import java.util.Scanner;

public class exercicio37 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int codigo = 0;
        double altura = 0;
        double peso = 0;
        double maisAlto = 0;
        int maisAltoCodigo = 0;
        double maisBaixo = 0;
        int maisBaixoCodigo = 0;
        double maisGordo = 0;
        int maisGordoCodigo = 0;
        double maisMagro = 0;
        int maisMagroCodigo = 0;
        boolean encerrar = false;

        do {
            System.out.println("Bem vindo. Programa iniciado, caso queira encerrar digite a qualquer momento zero no campo código");
            
            System.out.println("Favor informar o código:");
            codigo = scan.nextInt();

                if (codigo == 0) {
                    encerrar = true;
                    break;
                }

            System.out.println("Favor informar o a altura:");
            altura = scan.nextInt();

                if (maisBaixo <= altura) {
                    maisBaixo = altura;
                    maisAltoCodigo = codigo;
                } else if (altura > maisAlto) {
                    maisAlto = altura;
                    maisBaixoCodigo = codigo;

                }

            System.out.println("Favor informar o peso:");
            peso = scan.nextInt();

            if (maisMagro <= peso) {
                maisMagro = peso;
                maisMagroCodigo = codigo;
            } else if (peso > maisGordo) {
                maisGordo = peso;
                maisGordoCodigo = codigo;
            }

        } while (encerrar == false);
        
        System.out.println("O cliente de código " + maisAltoCodigo + " é o mais alto tendo " + maisAlto + " de altura");
        System.out.println("O cliente de código " + maisBaixoCodigo + " é o mais baixo tendo " + maisBaixo+ " de altura");
        System.out.println("O cliente de código " + maisGordoCodigo + " é o mais gordo tendo " + maisGordo + " kg");
        System.out.println("O cliente de código " + maisMagroCodigo + " é o mais magro tendo " + maisMagro + " kg");


    }
}
/*37.Uma academia deseja fazer um senso entre seus clientes para 
descobrir o mais alto, o mais baixo, a mais gordo e o mais magro, para 
isto você deve fazer um programa que pergunte a cada um dos 
clientes da academia seu código, sua altura e seu peso. O final da 
digitação de dados deve ser dada quando o usuário digitar 0 (zero) no 
campo código. Ao encerrar o programa também deve ser informados 
os códigos e valores do clente mais alto, do mais baixo, do mais gordo 
e do mais magro, além da média das alturas e dos pesos dos clientes */
