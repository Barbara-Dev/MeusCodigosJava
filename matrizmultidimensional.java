public class matrizmultidimensional {
    public static void main(String[] args) {
        //array 2 D = uma matriz de matriz

        String[][] carro = new String[2][2];
        carro[0][0] = "supra";
        carro[0][1] = "camaro";
        carro[1][0] = "golzin";
        carro[1][1] = "polonha";
        //l representa linha e c coluna 
        for(int l=0; l<carro.length; l++){
            System.out.println();
            for(int c=0; c<carro[l].length; c++){
                System.out.print(carro[l][c]+" ");

            }
        }
        //outra forma de declarar arrays em uma unica linha
        String[][] frutas = {{"banana","maçã"},{"pêra","uva"}};
        
        for(int i=0; i<frutas.length; i++){
            System.out.println();
            for(int j=0; j<frutas[i].length; j++){
                System.out.print(frutas[i][j]+" ");

            }
        }
    }
}
