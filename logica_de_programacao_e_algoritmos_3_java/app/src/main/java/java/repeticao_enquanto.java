import java.util.Scanner;

public class repeticao_enquanto {
    public static void main(String[] args) {

        int total_alunos = 10;
        Scanner leitorScanner = new Scanner(System.in);

        while (total_alunos > 0) {

            System.out.print("Digite o seu nome: ");
            String nome_aluno = leitorScanner.nextLine();

            System.out.print("Digite a sua idade: ");
            int idade_aluno = leitorScanner.nextInt();
            leitorScanner.nextLine(); // Consumir a nova linha pendente

            System.out.println("O nome do aluno é " + nome_aluno + " e sua idade é de " + idade_aluno + " anos.");

            total_alunos--;
        }

        leitorScanner.close();
    }
}
