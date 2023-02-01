import java.util.Scanner;

//o que eu fiz está certo, mas a lógica da professora deixa mais simples
// achei que era mais simples, mas prefiro minha logica

public class exercicio21resposta {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Bom dia. Álcool ou Gasolina? A-álcool, G-gasolina");
        String tipo = scan.next();

        System.out.println("Vai querer quantos litros? ");
        double qtdLitro = scan.nextDouble();

        double precoGas = 2.5;
        double precoAlc = 1.9;
        int percDesconto = 0;
        double total = 0;
        double totalDesc = 0;

        if (tipo.equalsIgnoreCase("a")) {

            if (qtdLitro <= 20){
                percDesconto = 3;
            } else {
                percDesconto = 5;
            }
            total = qtdLitro * precoAlc;
        } else if (tipo.equalsIgnoreCase("g")) {

            if (qtdLitro <= 20){
                percDesconto = 4;
            } else {
                percDesconto = 6;
            }    
            
            total = qtdLitro * precoGas;
        }
        
        totalDesc = (total / 100) * percDesconto;

        double  precoAPagar = total - totalDesc;

        System.out.println("O valor a ser pago R$ " + precoAPagar);
        
    }
    
}
