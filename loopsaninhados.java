import java.util.Scanner;

public class loopsaninhados {
    public static void main(String[] args) {
        //nested loops = um loop dentro do loop

        Scanner scanner = new Scanner(System.in);
        int linha;
        int coluna;
        String simbolo = "";

        System.out.println("Digite # de linhas: ");
        linha = scanner.nextInt();
        System.out.println("Digite # de colunas: ");
        coluna = scanner.nextInt();
        System.out.println("Digite o simbolo que deseja usar: ");
        simbolo = scanner.next();
        //for (1 um contador um indice; 2 equanto essa condição for verdadeira; 3 incemento )
        for(int l=1; l<=linha; l++){
            System.out.println();
            for(int c=1; c<=coluna; c++){
                System.out.print(simbolo);
            }
        }

        scanner.close();
    }
}
