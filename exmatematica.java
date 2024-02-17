import javax.swing.JOptionPane;

public class exmatematica {
    public static void main(String[] args) {
        
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para X: "));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para Y: "));
        //Math.max vai comparar os dois valores e retornar o valor maior

        double z = Math.max(x,y);

        JOptionPane.showMessageDialog(null, "O número maior é: "+z);

        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para A: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para B: "));
        //Math.min vai comparar os dois valores e retornar o valor menor

        double c = Math.min(a,b);

        JOptionPane.showMessageDialog(null, "O número menor é: "+c);

        //Math.abs retorna o valor absoluto ou seja aquele que não é negativo
        //.sqrt é a de raiz quadrada
        //.round arredonda os valores de acordo com o que se aproxima
        //.ceil arrendonda sempre para cima ex 3.33 vira 4.0 .floor é o oposto arredonda sempre para baixo
    }
     
}



