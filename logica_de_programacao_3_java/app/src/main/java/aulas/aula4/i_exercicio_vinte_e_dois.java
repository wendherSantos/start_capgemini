import java.util.Scanner;

public class exercicio_vinte_e_dois {
    public static void main(String[] args) {

        final int NUM_PRODUTOS = 3; // Número de produtos a serem cadastrados
        String nome_produto;
        float preco_venda;
        float preco_custo;
        float total_custo = 0.0f;
        float total_venda = 0.0f;

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < NUM_PRODUTOS; i++) {
            System.out.print("Digite o nome do produto: ");
            nome_produto = leitor.nextLine();

            System.out.print("Digite o preço de custo do produto: ");
            preco_custo = leitor.nextFloat();
            leitor.nextLine(); // Consumir a nova linha pendente

            System.out.print("Digite o preço de venda do produto: ");
            preco_venda = leitor.nextFloat();
            leitor.nextLine(); // Consumir a nova linha pendente

            total_custo += preco_custo;
            total_venda += preco_venda;

            if (preco_custo == preco_venda) {
                System.out.println("\nHouve empate entre o preço de custo e o preço de venda.");
            } else {
                if (preco_custo > preco_venda) {
                    float prejuizo = preco_custo - preco_venda;
                    System.out.println("\nHouve prejuízo de " + prejuizo + " na venda do(a) " + nome_produto + ".");
                } else {
                    float lucro = preco_venda - preco_custo;
                    System.out.println("\nHouve lucro de " + lucro + " na venda do(a) " + nome_produto + ".");
                }
            }

            System.out.println("\nA venda do(a) " + nome_produto + " teve um preço de custo = " + preco_custo + " e um preço de venda = " + preco_venda + ".");
        }

        System.out.println("A média do preço de custo é de: " + (total_custo / NUM_PRODUTOS));
        System.out.println("A média do preço de venda é de: " + (total_venda / NUM_PRODUTOS));

        leitor.close();
    }
}
