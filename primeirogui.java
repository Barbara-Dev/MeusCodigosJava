import javax.swing.JOptionPane;

public class primeirogui {
    public static void main(String[] args) {
        //gui - graphic user interface - interface grafica do usuário.
        // para strings usar o JOptionPane sozinho
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        JOptionPane.showMessageDialog(null, "Olá "+nome);
        //Para números inteiros atribuir dentro do INTeger passando para inteiro parseINT
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        JOptionPane.showMessageDialog(null, "Sua idade é "+idade+" anos");
        //Para números decimais atribuir dentro de double passar para parceDouble que é para ter separação de milhar
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
        JOptionPane.showMessageDialog(null,"Sua altura é de: "+altura+ "cm");
    }
}
