public class classe {
    public static void main(String[] args) {
        //classe de wrapper = fornece uma maneira de usar tipos de dados primitivos como tipos de dados de referência.
        //tipos de dados de referência contêm métodos úteis que podem ser usados ​​com coleções (ex.ArrayList)

        //tipos de dados primitivos
        //bolean - char - int - double
        //tipos wrapper se escreve com a primeira letra maiuscula - Bollean - Character - Integer - Double

        //autoboxing = é uma conversao automatica que o compilador do java faz entre dados primitivos e sua classe wrapper de objeto correspondente.
        //unboxing = e o reveso do autoboxing ele converte uma wrapper clas para primitivo

        Boolean a = true;
        Character b = '%';
        Integer c = 123;
        Double d = 2.0;
        String e = "Babi";

        if(e=="Babi"){
            System.out.println("Isto é verdade");
        }


    }
}
