import java.util.ArrayList;

public class listadematrizes {
    public static void main(String[] args) {
        //array tem que importar a biblioteca util de array
        //ArrayList = uma matriz redimensionável.
        //Os elementos podem ser adicionados e removidos após a fase de compilação para armazenar tipos de dados de referência.

        //para armazenar outros tipos de dados primitivos no array temos que usar a wrapper class 
        //tipos wrapper se escreve com a primeira letra maiuscula - Bollean - Character - Integer - Double
        
        ArrayList<String> comida = new ArrayList<String>();
        comida.add("pizza"); //posição - 0
        comida.add("pastel"); //posição - 1
        comida.add("coxinha"); //posição - 2

        //comida.set(0,"lasanha"); substitui a posição 0 por lasanha
        //comida.remove(2); remove o que esta na posição 2 "coxinha"
        //comida.clear(); limpa toda a lista.

        for(int i=0; i<comida.size() ;i++){//size para percorrer o tamanho da array
            System.out.println(comida.get(i)); //get ér para exibir
        }

    }
}
