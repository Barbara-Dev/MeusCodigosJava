import java.util.Scanner;
import java.util.Locale;

public class exercicio1010 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int codpeca1 = input.nextInt();
        int numpeca1 = input.nextInt();
        double valorpeca1 = input.nextDouble();

        int codpeca2 = input.nextInt();
        int numpeca2 = input.nextInt();
        double valorpeca2 = input.nextDouble();

        double valortotal = (numpeca1*valorpeca1)+(numpeca2*valorpeca2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f%n" ,+valortotal);

        input.close();
    }
}