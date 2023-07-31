
package CalculadoraDieta;

/**
 *
 * @author Administrador
 */
public class pessoa {
    
    private float peso;
    private float altura;
    private int idade;
    private String sexo;
    
    
    public double calcularTmb() {
        double tmb = (10 * peso) + (6 * altura)- (5* idade) + 5;
        tmb = tmb * 1.375;
        tmb = tmb - 200;
        return tmb;
    }
    
    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
