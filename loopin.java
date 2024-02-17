import java.util.Scanner;
public class loopin {
    public static void main(String[] args) {
        // While loop = execute enquanto a condição for verdadeira faça.

        Scanner input = new Scanner(System.in);
        String nome = "";

        while(nome.isBlank()){
            System.out.print("Digite seu nome: ");
            nome = input.nextLine();
        }

        System.out.println("Olá seja bem-vindo(a): "+nome+" !");

        input.close();
    }
}
