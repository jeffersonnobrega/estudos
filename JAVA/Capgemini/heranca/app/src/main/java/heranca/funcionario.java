
package heranca;

import java.util.Date;

/** 
 nas classes motorista e vededor as informações eram repetidas, então para poupar
 * ao invés de usar duas classes a gente cria a classe funcionário e usa a herança
 * para exemplificr como é mudado eu criarei vendedor2 e motorista2, entao compare 
 * com as antigas classes vendedo e motorista para lembrar o que mudou
 */
public class funcionario {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private float salario;

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
