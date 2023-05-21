
package aulaArrays;
// armazene em uma variável a temperatura de todos os dias do ano usando um
// array

public class arrayss {
    
    public static void main(String[] args) {
        
              
        double[] temperatura = new double[5];
        
        // o array salva em índices abaixo alimento o array, mas podia ser
        // solicitado ao usuário
        
        temperatura[0] = 30;
        temperatura[1] = 31;
        temperatura[2] = 32;
        temperatura[3] = 33;
        temperatura[4] = 34;
        
        // chamando um index
        // não se esqueça que o indíce começa a contar do 0
        
        System.out.println("A temperatura no dia 1 era " + temperatura[0]+ " já no dia 3 era " + temperatura[2]);
        
        // agora vou mostrar o tamanho do array
        
        System.out.println("A quantidade de index é "+ temperatura.length);
        
        // imprimir todas as posições do index
        
       for(int i=0; i <=temperatura.length;i++) {
            System.out.println("O valor da temperatura do dia " + i + " é igual a " + temperatura[i]);
        }
        
        // no código acima ele vai imprimir o dia 1 como sendo dia 0, como resolver? Assim:
        
        
        for(int i=0; i <=temperatura.length;i++) {
            System.out.println("O valor da temperatura do dia " + (i+1) + " é igual a " + temperatura[i]);
        }
        
        // agora fazendo um for melhorado para arrays
    // porém aqui só tem acesso ao valor do index
        
        for(double temp : temperatura){
        System.out.println(temp);
        
    }
    
}
