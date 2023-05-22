package k_heranca;

public class k_vendedor extends k_funcionario {
    
    private int total_itens_vendidos;
    private float comissao_por_item;
    
    public k_vendedor(){
        super();
    }
    
    public float calcular_salario(){
        return super.getSalario() + (this.comissao_por_item * total_itens_vendidos);
    }

    public int getTotal_itens_vendidos() {
        return total_itens_vendidos;
    }

    public void setTotal_itens_vendidos(int total_itens_vendidos) {
        this.total_itens_vendidos = total_itens_vendidos;
    }

    public float getComissao_por_item() {
        return comissao_por_item;
    }

    public void setComissao_por_item(float comissao_por_item) {
        this.comissao_por_item = comissao_por_item;
    }
    
    
    
}