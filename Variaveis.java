public class Variaveis {
    public static void main(String[] args) {
        System.out.println("Minhas variáveis.");
        String x = "Água";
        String y = "Suco";
        String temp;
        //temp = temporária

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
    
}
