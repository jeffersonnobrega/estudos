package lista_exercicios;

public class exercicio1 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.marca = "Philco";
        lampada.tipo = "LED";
        lampada.cor = "Braca";
        lampada.voltagem = 220;
        lampada.potencia = 80;

        System.out.println("Lampada características:");
        System.out.println("Marca: " + lampada.marca);
        System.out.println("Modelo: " + lampada.tipo);
        System.out.println("Cor: " + lampada.cor);
        System.out.println("Voltagem: " + lampada.voltagem + " volts");
        System.out.println("Potência: " + lampada.potencia + " hz");

    }
}
