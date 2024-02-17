public class metodosclassestring {
    public static void main(String[] args) {
        
        //metodos uteis para classe de string 
        //String é um tipo de dado de referência que pode ser usado para armazenar um ou mais caracteres e tipos de dados de referência tem acesso a alguns metodos úteis.

        String nome = "Babi";
        //equals compara 2 strings retornando um valor booleano declarando da forma abaixo sera feito diferença entre maiúsculas e minusculas para eliminar essa regra basta adicionar apos equals IgnoreCase
        boolean resultado = nome.equals("Babi");
        System.out.println(resultado);

        //lenght = vai retornar a quantidade de caracter que tem naquela string

        String palavra = "Otorrinolaringologista";
        int tamanho  = palavra.length();
        System.out.println(tamanho);

        //Char = retorna um unico caracter então se deseja percorrer essa string caracter por caracter charat index é a posião do caracter lembrando que a contagem é feita a partir da posição 0 1 2 3....

        String texto = "texto";
        char unico = texto.charAt(2);
        System.out.println(unico);

        //IndexOf = encontrara o caracter dentro daquela String, assim ele me retorna qual a posição daquele caracter dentro da string 
        
        String encontrar = "aranha";
        int localizar = encontrar.indexOf("r");
        System.out.println(localizar);

        //isEmpty = verificar se está vazio retornando um resultado booleano

        String vazio = "";
        boolean estado = vazio.isEmpty();
        System.out.println("Esta string está vazia? "+estado);

        //toUpperCase = transformando todas as letras da string em maiúsculas.
        //toLowerCase = transforma as letras maiusculas em minusculas 
        String maiusculas = "babi";
        String aumentar = maiusculas.toUpperCase();
        System.out.println(aumentar);
        String diminuir = aumentar.toLowerCase();
        System.out.println(diminuir);

        //trim = remove espaços vazios no inicio e no final apenas na string
        String espaco = " O espaço é o vazio no universo. ";
        String eliminar = espaco.trim();
        System.out.println(eliminar);    

        //replace = substituirá um  caractere dentro da string
        String substituto = "caso";
        String trocando = substituto.replace("c","r");
        System.out.println(trocando);

    }
}
