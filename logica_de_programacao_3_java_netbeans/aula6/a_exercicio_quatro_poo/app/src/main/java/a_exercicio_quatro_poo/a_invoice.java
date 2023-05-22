package a_exercicio_quatro_poo;

/**
 * Classe Invoice representa uma fatura de um item vendido em uma loja de suprimentos de informática.
 */
public class a_invoice {

    private int codigoItem; // Número do item faturado
    private String descricao; // Descrição do item
    private int quantidade; // Quantidade comprada do item
    private float precoUnitario; // Preço unitário do item

    /**
     * Construtor da classe Invoice.
     * Inicializa os atributos da classe.
     * Se a quantidade for negativa, é configurada como 0.
     * Se o preço unitário for negativo, é configurado como 0.0.
     * @param codigoItem Número do item faturado.
     * @param descricao Descrição do item.
     * @param quantidade Quantidade comprada do item.
     * @param precoUnitario Preço unitário do item.
     */
    public a_invoice(int codigoItem, String descricao, int quantidade, float precoUnitario) {
        this.setCodigoItem(codigoItem);
        this.setDescricao(descricao);
        this.setQuantidade(quantidade);
        this.setPrecoUnitario(precoUnitario);
    }

    /**
     * Método para calcular o valor total da fatura.
     * Multiplica a quantidade pelo preço unitário e retorna o valor como um double.
     * @return O valor total da fatura.
     */
    public double getInvoiceAmount() {
        return quantidade * precoUnitario;
    }

    /**
     * Obtém o número do item faturado.
     * @return O número do item faturado.
     */
    public int getCodigoItem() {
        return codigoItem;
    }

    /**
     * Define o número do item faturado.
     * @param codigoItem O número do item faturado.
     */
    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    /**
     * Obtém a descrição do item.
     * @return A descrição do item.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do item.
     * @param descricao A descrição do item.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém a quantidade comprada do item.
     * @return A quantidade comprada do item.
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Define a quantidade comprada do item.
     * Se a quantidade for negativa, é configurada como 0.
     * @param quantidade A quantidade comprada do item.
     */
    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
    }

    /**
     * Obtém o preço unitário do item.
     * @return O preço unitário do item.
     */
    public float getPrecoUnitario() {
        return precoUnitario;
    }

    /**
     * Define o preço unitário do item.
     * Se o preço unitário for negativo, é configurado como 0.0.
     * @param precoUnitario O preço unitário do item.
     */
    public void setPrecoUnitario(float precoUnitario) {
        if (precoUnitario < 0) {
            this.precoUnitario = 0;
        } else {
            this.precoUnitario = precoUnitario;
        }
    }
}
