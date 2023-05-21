
package heranca;

import java.util.Date;

public class vendedor2 extends funcionario {
// com o extends funcionario puxa as informações definidas na classe funcionario
    int totalVendido;
    float comissao;
    
    public vendedor2() {
        super(); 
        //aqui o super já diz que o vendedor tem tudo que um funcionário tem
    }
    
    public float calcSalario(){
        return super.getSalario() + (comissao * totalVendido);
        // a herança segue uma hierarquia, para acessar uma hierarquia
        //superior usamos o super, no caso salario é superir a vendendor2
    }

    public int getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(int totalVendido) {
        this.totalVendido = totalVendido;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    
    
}
