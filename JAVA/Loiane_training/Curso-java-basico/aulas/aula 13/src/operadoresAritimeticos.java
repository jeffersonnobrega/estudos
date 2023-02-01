public class operadoresAritimeticos {

    public static void main(String[] args) {
        
        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7; //% é mode, ou seja o resto
        System.out.println(resultado);

        String primeiroNome = "Sem ";
        String segundoNome =  "Anistia! ";
        String terceiroNome = "Bolsonaro na cadeia!";
        String concatenarNomes = primeiroNome + segundoNome + terceiroNome;

        System.out.println(concatenarNomes);

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado);

        
        System.out.println(resultado++);
        //mesma coisa que essas duas linha de código
        //resultado = resultado + 1;
        //resultado +=1;        
        System.out.println(++resultado);
        //mesma coisa que essas duas linhas de código
        //resultado +=1;
        //System.out.println(resutaldo);

        resultado --;
        System.out.println(resultado);
        
        System.out.println(--resultado);
    }
}