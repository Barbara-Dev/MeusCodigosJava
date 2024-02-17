import java.util.Scanner;
public class caso {
    public static void main(String[] args) {
        //switch usado para caso testar a variavel em uma lista de valores.
        //break é para parar default usa para alguma situação fora do caso
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um dia da semana: ");
        String data = input.nextLine();
        switch(data){
            case "Segunda-Feira": System.out.println("Hoje é Segunda-Feira!");
            break;
            case "Terça-Feira": System.out.println("Hoje é Terça-Feira!");
            break;
            case "Quarta-Feira": System.out.println("Hoje é Quarta-Feira!");
            break;
            case "Quinta-Feira": System.out.println("Hoje é Quinta-Feira!");
            break;
            case "Sexta-Feira": System.out.println("Hoje é Sexta-Feira!");
            break;
            case "Sábado": System.out.println("Hoje é Sábado!");
            break;
            case "Domingo": System.out.println("Hoje é Domingo!");
            break;
            default: System.out.println("Você não digitou um dia da semana! ");
        }
        input.close();
    }
}
