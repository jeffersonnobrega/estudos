package classes;

public class pessoa {
    
    //atributos da classe
    float peso;
    float altura;
    
    public float calcularIMC(){
       float imc = peso / (altura*altura);
       return imc;
    }
}
