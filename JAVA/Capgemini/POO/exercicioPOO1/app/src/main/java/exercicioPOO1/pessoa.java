
package exercicioPOO1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class pessoa {
    
    private String nome;
    private String dataNascimento;
    private LocalDate dtNasc = LocalDate.parse(dataNascimento);
    private float altura;  
    private Calendar cal = GregorianCalendar.getInstance();
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

       
    public void imprimirDados(){
      System.out.println("nome: "+ nome);
        
    }
    
    public int calcularData() {
      
    Period periodo = Period.between(dtNasc, LocalDate.now());
    int idade = periodo.getYears();
    return idade;
        
    }
}
