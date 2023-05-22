import java.util.Scanner;

public class comando_entrada_saida {
    public static void main(String[] args) 
    {
    
        Scanner leitor = new Scanner(System.in);

        int idade = leitor.nextInt();
        float cotacao_dolar = leitor.nextFloat();
        double cotacao_euro = leitor.nextDouble();
        String codigo_rua = leitor.next();
        String nome = leitor.nextLine();

        char c = leitor.next().charAt(0);

        String texto = "Esse texto vai ser impresso";
        String outro_texto = "Esse texto também vai ser impresso";
        System.out.println(texto);
        System.out.print(outro_texto);
    }
    
}



