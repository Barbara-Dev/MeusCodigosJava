import java.util.Scanner;
public class operadoreslogicos {

    public static void main(String[] args) {
        //operadores logicos = usafos para conectar duas ou mais expressoes 
        // && = (e/AND) ambas as condições devem ser verdadeiras
        // || = (ou/OR) qualquer uma das condições deve ser verdadeira 
        // ! = (não/NOT) reverte valores booleanos da condição (true/false)
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma temperatura: ");
        int tempo = input.nextInt();
            if (tempo>30){
                System.out.println("Está very hot la fora!");
            }
            else if(tempo >=20 && tempo <=30){
                System.out.println("Está com clima euroupeu rsrs");
            }
            else{
                System.out.println("Esta lerigou la fora!");
            }

        input.close();
        // não vai funcionar mas é apenas exemplo de ||
        Scanner resposta = new Scanner(System.in);
        System.out.println("Para sair do jogo pressione s ou S.");
        String opcao = resposta.next();
            if(opcao.equals("s") || opcao.equals("S")){
                System.out.println("Você saiu do jogo");
            }
            else{
                System.out.println("Você ainda está no jogo.");
            }
        resposta.close();
    }
    
}
