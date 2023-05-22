package l_exercicio_vinte;

import java.util.Scanner;

/**
 * Classe principal que calcula descontos em veículos
 * de acordo com o ano de fabricação.
 */
public class App {

    public static void main(String[] args) {

        // Variáveis de entrada e cálculos
        int anoFabricacaoVeiculo = 0;
        float valorVeiculo = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;

        // Variáveis para contagem
        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;

        // Objeto Scanner para entrada de dados 
        Scanner leitor = new Scanner(System.in);

        char desejaRepetir = 'S';

        while (desejaRepetir == 'S' || desejaRepetir == 's') {

            // Entrada de dados
            System.out.println("Digite o ano de fabricação do veículo: ");
            anoFabricacaoVeiculo = leitor.nextInt();

            System.out.println("Digite o valor do veículo: ");
            valorVeiculo = leitor.nextFloat();

            // Verifica o ano de fabricação para determinar a porcentagem de desconto
            if (anoFabricacaoVeiculo <= 2000) {
                porcentagemDesconto = 0.12f;
            } else {
                porcentagemDesconto = 0.07f;
                totalCarrosSemiNovos++;
            }
            totalCarros++;

            // Cálculo do valor do desconto e valor a ser pago pelo cliente
            valorDesconto = valorVeiculo * porcentagemDesconto;
            valorPagar = valorVeiculo - valorDesconto;

            // Exibição dos resultados
            System.out.println("O valor do desconto foi de: " + valorDesconto);
            System.out.println("O valor que deve ser pago é de: " + valorPagar);

            // Verifica se deseja repetir o cálculo para outro veículo
            System.out.println("Deseja fazer mais cadastros? \n[S] SIM \n[N] NÃO ");
            desejaRepetir = leitor.next().charAt(0);
        }

        // Exibe o total de carros semi novos e total geral
        System.out.println("Total de carros semi novos: " + totalCarrosSemiNovos);
        System.out.println("Total de carros: " + totalCarros);

        // Fecha o objeto Scanner
        leitor.close();
    }
}
