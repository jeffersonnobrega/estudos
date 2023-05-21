package classes;

public class pessoa {
    
    //atributos da classe
    //os atributos da classe normalmente precisam ser privados, pois o princípio
    // encapsulamento diz que só a entidade pode alterar seus dados
    private float peso;
    private float altura;
    
    public float calcularIMC(){
       float imc = peso / (altura*altura);
       return imc;
    }
    
    // mas como então esses dados privados serão manipulados pelo main?
    // através de métodos acessores com Set's e Get's. Eles serão públicos
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    // se tivesse que usar um if seria dentro do set
    // o get não precisa nesse app, mas ele seria se a pessoa fosse me dá o peso
    // ao invés de acessar o peso definido na entidade. assim eu colocaria no main
    // obejetoPessoa.getPeso();
    public float getPeso() {
        return peso;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public float getAltura(){
        return altura;
    }

    
}

/* Aqui eu deixo tudo definido a entidade pessoa, inclusive o cálculo*/