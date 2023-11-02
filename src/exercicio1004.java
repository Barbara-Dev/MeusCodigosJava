import java.util.Scanner;
public class exercicio1004 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int v01 = input.nextInt();
        int v02 = input.nextInt();
        int PROD = v01 * v02;

        System.out.println("PROD = "+PROD);
        
        input.close();
    }
}
