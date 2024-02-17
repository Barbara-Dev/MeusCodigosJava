public class metodossobrecarregados {
    public static void main(String[] args) {
       //overload methods = metodos que compartilham o mesmo nome mas parametros diferentes...
       // nome do metodo + parametro = para ter uma asinatura unica de metodo pode ter o mesmo nome mas parametros diferentes
        int x = numero(0, 1);

        System.out.println(x);

        double y = numero(1.5, 1.6);
        System.out.println(y);


    }

    static int numero(int a){
        System.out.println("este é o #0");
        return a;
    }

    static int numero(int a, int b){
        System.out.println("este é o #1");
        return a + b;
    }

    static int numero(int a, int b, int c){
        System.out.println("este é o #2");
        return a + b + c;
    }
    
    static int numero(int a, int b, int c, int d){
        System.out.println("este é o #3");
        return a + b + c + d;
    }
        
    static double numero(double a, double b){
        System.out.println("este é o #4");
        return a + b;
    }

}
