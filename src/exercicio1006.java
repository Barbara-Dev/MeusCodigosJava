import java.util.Scanner;
import java.util.Locale;

public class exercicio1006 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);


        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double media = ((A*2)+(B*3)+(C*5))/10;
        System.out.printf("MEDIA = %.1f%n",+media);

        input.close();
    }
}