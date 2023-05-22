package j_classes;

import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {
        
        // Referência da classe com a criação de um objeto
        j_pessoa objeto_pessoa = new j_pessoa(70f, 1.50f); 
        Scanner leitor = new Scanner(System.in);
        
        // Código 
        System.out.print("Digite o peso da pessoa: ");
        objeto_pessoa.set_peso(leitor.nextFloat()); // Define o peso da pessoa através do método set_peso()
        
        System.out.print("Digite a altura da pessoa: ");
        objeto_pessoa.set_altura(leitor.nextFloat()); // Define a altura da pessoa através do método set_altura()
        
        objeto_pessoa.get_peso(); // Chama o método get_peso(), mas não armazena o valor retornado
        
        System.out.print("IMC = " + objeto_pessoa.calcular_imc()); // Imprime o valor do IMC retornado pelo método calcular_imc()
    }
}
