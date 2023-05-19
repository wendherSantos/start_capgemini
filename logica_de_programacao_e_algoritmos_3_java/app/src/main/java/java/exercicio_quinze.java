import java.util.Scanner;

public class exercicio_quinze {
    public static void main(String[] args)
    {
        int numero;

        Scanner leitorScanner = new Scanner(System.in);

        numero = leitorScanner.nextInt();

        if(numero >= 100 && numero <= 200){
            System.out.println("O número está no intervalo!");
        } else {
            System.out.println("O número não está no intervalo!");
        }
    }
}
