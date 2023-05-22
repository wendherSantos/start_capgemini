package k_heranca;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        
        k_vendedor v = new k_vendedor();
        v.setNome("Wendher");
        v.setSalario(1000.0f);
        v.setCpf("48121500869");
        v.setData_nascimento(new Date());
        v.setComissao_por_item(10.0f);
        v.setTotal_itens_vendidos(10);
        
        System.out.print("O salário do vendedor é " + v.calcular_salario());
         
    }
}
 