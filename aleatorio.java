import java.util.Random;

public class aleatorio {
    public static void main(String[] args) {
        Random qualquer = new Random();
        //dentro do parentese vc pode limitar a quantidade de números 
        int a = qualquer.nextInt(6)+1;
        System.out.println("Número aleatório Inteiro: "+a);
        double b = qualquer.nextDouble();
        System.out.println("Numero aleatório Duble decimal: "+b);
        boolean c = qualquer.nextBoolean();
        System.out.println("Valor aleatório Booleano verdadeiro/falso: "+c);
    }
}
