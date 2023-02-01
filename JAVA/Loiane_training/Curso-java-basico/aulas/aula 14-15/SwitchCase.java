import java.util.Scanner;

/**
 * SwitchCase
 */
public class SwitchCase {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um dia da semana: ");
        int diaSemana = scan.nextInt();

        if (diaSemana == 1){
            System.out.println("Domingo");
        } else if (diaSemana == 2){
                System.out.println("Segunda");
        } else if (diaSemana == 3){
            System.out.println("Terça");
        } else if (diaSemana == 4){
            System.out.println("Quarta");
        } else if (diaSemana == 5){
            System.out.println("Quinta");
        } else if (diaSemana == 6){
            System.out.println("Sexta");
        } else if (diaSemana == 7){
            System.out.println("Sábado");
        } else {
            System.out.println("Não é um dia válido");
        }

        //SIMPLIFICANDO O CÓDIGO COM O SWITCH CASE
        // switch (dado um dia da semana)

        switch (diaSemana){
            case 2:
            case 3: 
            case 4: 
            case 5: 
            case 6: System.out.println("Dia útil"); break;
            case 1:  
            case 7: System.out.println("Fim de semana"); break;
            default: System.out.println("Não é um dia válido");
        }

        switch (diaSemana){
            case 1: System.out.println("Domingo"); break;//caso seja 1 
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Não é um dia válido");
        }    
        //sobre o break
        // o break é como fechar uma parêntese, se não colocar o break
        // ele vai executar tudo até achar um break mesmo que a condição seja falsa

        

            //vou usar o break para imprimir várias informações
            // de uma vez abaixo
            // se for entre 2 e 6, dia útil
            switch (diaSemana){
                case 2:
                case 3: 
                case 4: 
                case 5: 
                case 6: System.out.println("Dia útil"); break;
                case 1:  
                case 7: System.out.println("Fim de semana"); break;
                default: System.out.println("Não é um dia válido");
            }   
         
         
        
    }
}