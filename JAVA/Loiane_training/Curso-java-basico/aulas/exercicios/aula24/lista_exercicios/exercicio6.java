package lista_exercicios;

public class exercicio6 {
    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.nome = "Raiane";
        contato.numFone = 95933641;
        contato.email = "raianenobrega@gmail.com";

        contato.grupo= new String[2];

        contato.grupo[0] = "Família";
        contato.grupo[1] = "Pessoal";

        System.out.println("Agenda: ");
        System.out.println("Nome: " + contato.nome);
        System.out.println("Telefone: " + contato.numFone);
        System.out.println("Email: " + contato.email);
        System.out.println("Grupo: " + contato.grupo[1]);
    }

}
