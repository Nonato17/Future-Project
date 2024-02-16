
import javax.swing.*;
public class notas {

	public static void main(String[] args) {
        String[] notas = {"A", "B", "C", "D", "E", "F"};
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno:"));
        if (num >= 8) {
            JOptionPane.showMessageDialog(null,"O aluno tirou nota "+notas[0]);
            
        }

    }
    
}