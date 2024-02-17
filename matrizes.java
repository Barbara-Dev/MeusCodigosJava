public class matrizes {
    public static void main(String[] args) {
        //arrays usados para armazenar varios valores em uma única variável.
        //os elementos da array tem que ser do mesmo tipo sendo assim n tem como adicionar numeros em uma string e vice e versa.

        String [] carro = {"Fusca", "Polo", "Fox","Punto"};
        carro[0] = "Gol Quadrado";
        System.out.println(carro[0]);

        //essa forma serve para limitar a quantidade de elementos no array
        String [] frutas = new String[4];
        frutas[0] = "banana";
        frutas[1] = "maçã";
        frutas[2] = "uva";
        frutas[3] = "abacate";
        //length = comprimento
        for(int i=0; i < frutas.length; i++){
            System.out.println(frutas[i]);
        }
    }
}
