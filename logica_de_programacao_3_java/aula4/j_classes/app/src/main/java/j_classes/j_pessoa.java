package j_classes;

public class j_pessoa {
    
    // Atributos
    private float peso; // Armazena o peso da pessoa
    private float altura; // Armazena a altura da pessoa
    
    // Método construtor (opcional) / utilizado para valores default
    public j_pessoa(float peso, float altura){
        this.peso = peso; // O "This" serve para acessar o atributo privado 'peso'
        this.altura = altura; // O "This" serve para acessar o atributo privado 'altura'
    }
    
    // Modificador de acesso
    public float calcular_imc(){
        float imc = peso / (altura * altura); // Calcula o índice de massa corporal (IMC)
        return imc; // Retorna o valor do IMC
    }
    
    // Métodos acessores
    public void set_peso(float peso){
        this.peso = peso; // Define o valor do peso da pessoa
    }
    
    public float get_peso(){
        return peso; // Retorna o valor do peso da pessoa
    }
    
    public void set_altura(float altura){
        this.altura = altura; // Define o valor da altura da pessoa
    }
    
    public float get_altura(){
        return altura;  // Retorna o valor da altura da pessoa
    }
}
