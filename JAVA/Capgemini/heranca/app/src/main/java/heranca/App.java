/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package heranca;

import java.util.Date;

public class App {
   public static void main(String[] args) {
        
       vendedor2 v = new vendedor2();
       v.setNome("Jefferson");
       v.setSalario(1000);
       v.setCpf("011675588");
       v.setDataNascimento(new Date());// new date é a data de hoje
       v.setComissao(10);
       
      System.out.println("O salário do vendedo é " + v.calcSalario());
       //motorista m = new motorista();
    }
}