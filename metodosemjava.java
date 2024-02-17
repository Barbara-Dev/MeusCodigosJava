public class metodosemjava {
    public static void main(String[] args) {
       //method = é um bloco de código que é executado sempre que for chamado.

       String nome = "Bárbara.";
       int idade = 27;
       String carro = "Fox";
       double fracao =  1.6;
       ola(nome,idade,carro,fracao);


       int x = 3;
       int y = 4;
       int resultado = soma(x,y); //conseguimos declarar o mesmo nome de váriavel dentro de metodos diferentes pq são conjuntos isolados vira variavel local
        System.out.println(resultado);
       
    }
    //dentro do parenteses deve se listar o tipo das váriaveis que estão sendo usadas os parametros 
    static void ola(String nome, int idade, String carro, double fracao){
        //qualquer coisa dentro de chaves pertence ao metodo ola e se chamar esse método ele vai executar qualquer código que esteja aqui dentro 
        System.out.println("Olá "+nome);
        System.out.println("Sua idade é "+idade+" anos");
        System.out.println("Você tem um "+carro+" com motor "+fracao);
    }

    static int soma (int x, int y){
        int resultado = x + y;
        return resultado;

    }
}
