package a_exercicio_quatro_poo;

public class App {
    
    public static void main(String[] args) {
        
        // Criação de uma instância da classe Invoice com valores de exemplo
        a_invoice inv = new a_invoice(1, "Mousepad", 20, 50.0f);
        
        // Exibição do valor total da fatura utilizando o método getInvoiceAmount()
        System.out.println("Valor total = " + inv.getInvoiceAmount());
         
    }
}
  