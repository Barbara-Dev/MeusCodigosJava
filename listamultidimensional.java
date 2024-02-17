import java.util.*;

public class listamultidimensional {
    public static void main(String[] args) {

        //2D array = é uma lista dinâmica de listas 
        //você pode alterar o tamanho dessas listas durante o tempo de execução.

        ArrayList<ArrayList<String>> supermercado = new ArrayList();
        
        ArrayList<String> acougue = new ArrayList();
        acougue.add("picanha");
        acougue.add("chã de dentro");
        acougue.add("acém");

        ArrayList<String> sacolao = new ArrayList();
        sacolao.add("banana");
        sacolao.add("laranja");
        sacolao.add("cebola");

        ArrayList<String> bomboniere = new ArrayList();
        bomboniere.add("chocolate");
        bomboniere.add("doces");

        supermercado.add(0, acougue);
        supermercado.add(0, sacolao);
        supermercado.add(0, bomboniere);

        System.out.println(supermercado);
        System.out.println(supermercado.get(1).get(0));//metodo get para exibir aquela posição em específico


    }
}
