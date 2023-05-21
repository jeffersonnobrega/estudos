
package heranca;

import java.util.Date;


public class vendedor {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private float salario;
   
    // mtedod construtor
   public vendedor() {
    
   }
    // metodos auxiliares, atalho para fazer para todos alt + insert

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
   
   
}
