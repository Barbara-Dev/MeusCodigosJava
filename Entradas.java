import java.util.Scanner;

public class Entradas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        input.nextLine();
        System.out.println("Qual a sua cidade? ");
        String cidade = input.nextLine();
        System.out.println("Digite seu ano de nascimento: ");
        int ano = input.nextInt();
        System.out.println("Olá "+nome+" seja bem-vindo (a)!");
        System.out.println("Você nasceu no ano de: "+ano);
        System.out.println("Sua idade éB: "+idade+" anos.");
        System.out.println("Sua cidade é: "+cidade);

        input.close();
    }
}
