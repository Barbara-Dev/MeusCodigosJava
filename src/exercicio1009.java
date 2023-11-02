import java.util.Scanner;
import java.util.Locale;

public class exercicio1009 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);


        Scanner input = new Scanner(System.in);

        String nome = input.nextLine();
        double salariofixo = input.nextDouble();
        double totalvendas = input.nextDouble();

        double total = salariofixo+(totalvendas*0.15);
        System.out.printf("TOTAL = R$ %.2f%n" ,+total);

        input.close();
    }
}