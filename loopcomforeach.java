import java.util.ArrayList;

public class loopcomforeach {
    public static void main(String[] args) {
       //for-each= loop aprimorado é uma técnica de travessia para iterar através dos elementos em um array/coleção tem menos etapas, mais legível menos flexível.

       String [] animal = {"gato","cachorro","elefante","passáro"};

       for(String i : animal){
            System.out.println(i);
       }
       ArrayList<String> doces = new ArrayList<String>();
       doces.add("bombom");
       doces.add("bala");
       doces.add("bolo");
       
       for(String d : doces){
        System.out.println(d);
       }

    }
}
