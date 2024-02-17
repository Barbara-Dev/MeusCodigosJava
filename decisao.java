import java.util.Scanner;
public class decisao {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade = input.nextInt();
        
        if (idade>=65){
            System.out.println("Você ja pode se aposentar tem "+idade+" maior ou igual a 65 anos.");
        }   
        else if (idade>=18) {
            System.out.println("Você é maior de idade tem "+idade+" anos.");
        }     
        else if (idade>=15) {
            System.out.println("Você é adolecente tem "+idade+" anos.");
        }     
        else{
            System.out.println("Acesso negado você é criança e tem "+idade+" anos.");
        }

        input.close();

    }
}
