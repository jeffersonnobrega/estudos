import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class repostas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char opcao;
        String resposta;

        System.out.println("Digite a opção desejada: ");
        System.out.println("A - Troca de chave do dispensador");
        opcao = scan.next().charAt(0);

        switch (opcao) {
            case 'A':
                resposta = "Foi realizada a troca da chave de criptografia do dispensador de cédulas normalizando assim os saques no ATM.\n\natt,\nNUBAM - ATM";
                break;

            default:
                resposta = "Opção inválida";
                break;
        }

        // Imprime a resposta
        System.out.println(resposta);

        // Copia a resposta para a área de transferência
        copyToClipboard(resposta);

        scan.close();
    }

    private static void copyToClipboard(String text) {
        StringSelection selection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);
    }
}
