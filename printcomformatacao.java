public class printcomformatacao {
    public static void main(String[] args) {
        //Printf = print com formatação
        // metodo de controlar o formato a exibir texto na tela 
        //2 argumentos = formato string + (objeto variavel valor)
        // % o lugar onde vc quer que fique aquele valor
        //seguido pelo tipo de dados que estamos tentando adicionar
        //

        System.out.printf("ola %d tudo bem", 123);

        boolean booleano = true;
        char caractere = '&';
        String nome = "Babi";
        int inteiro = 27;
        double numero = 1.6000000000;
        //depois do % se vc colocar um número vai determinar um tamanho ali exemplo em string ele solta um espaço
        System.out.printf("para booleano use o b = %b",booleano);
        System.out.printf("para caracter use c = %c", caractere);
        System.out.printf("para string use s = %20s", nome);
        System.out.printf("para inteiros use d de decimal= %d", inteiro);
        // depois do % podemos limitar a quantidade de casas decimais que vai aparecer dps do ponto basta usar .e o umero de casas por exemplo .2 duas casas dps do ponto
        System.out.printf("para double use f de float = %.3f", numero);

        //// [flags] // adiciona um efeito à saída com base no sinalizador adicionado ao especificador de formato // - : justificar à esquerda // +: gera um sinal de mais (+) ou menos (-) para um valor numérico // 0: numérico os valores são preenchidos com zeros //, : separador de agrupamento por vírgula se números > 1000
    }
}
