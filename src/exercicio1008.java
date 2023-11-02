import java.util.Scanner;
import java.util.Locale;

public class exercicio1008 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);


        Scanner input = new Scanner(System.in);

        int funcionario = input.nextInt();
        int horas = input.nextInt();
        double salariohora = input.nextDouble();

        double salario = horas*salariohora;
        System.out.println("NUMBER = "+funcionario);
        System.out.printf("SALARY = U$ %.2f%n" ,+salario);

        input.close();
    }
}