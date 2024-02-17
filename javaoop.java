public class javaoop {
    //objeto = uma instância de uma classe que pode conter atributos e métodos 
    // exemplo: (telefone, mesa, computador, xícara de café)
    public static void main(String[] args) {
        
    }

    public class carro{
        //aqui temos os atributos e caracteristicas do carro.

        String marca = "VW";
        String modelo = "Fox";
        int ano = 2013;
        String cor = "cinza";
        double fipe = 41000.00;

        //métodos são as ações que o objeto pode executar.
        
        void dirigir(){
            System.out.println("Você está dirigindo o carro");
        }
        void parado(){
            System.out.println("Seu carro etá parado");
        }
    }
}

