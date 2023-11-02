import java.util.Scanner;
import java.util.Locale;

public class exercicio1011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double pi = 3.14159;
        int  R = input.nextInt();
        double raio = Math.pow(R, 3);
        double volume = (4.0/3) * pi * raio;

        System.out.printf("VOLUME = 3%.3f%n",volume);
        
        input.close();
    }
}
