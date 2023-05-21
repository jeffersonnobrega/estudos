package exerciciosaula19;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class frase {



        public static void main(String[] args) {
            String inputPhrase = "A frase contém o padrão 1234 de números.";

            String pattern = "\\b\\d{4}\\b";  // Padrão para encontrar 4 números consecutivos

            Pattern regexPattern = Pattern.compile(pattern);
            Matcher matcher = regexPattern.matcher(inputPhrase);

            String extractedNumbers = "";

            while (matcher.find()) {
                extractedNumbers = matcher.group();
                break;  // Para extrair apenas o primeiro padrão encontrado
            }

            String outputPhrase = "Os números encontrados foram: " + extractedNumbers;

            System.out.println(outputPhrase);
        }
    }


