
import javax.swing.*;
public class excel {

	public static void main(String[] args) {
        int[] max = {1302, 2607, 3911, 7613};
        Double[] aliquota = {0.075, 0.08, 0.12, 0.14};
        Double ferias = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da ferias: "));
        if (ferias <= max[0]) {
            Double mult = ferias * aliquota[0];
            JOptionPane.showMessageDialog(null, mult);
            
        } else if (ferias <= max[1]) {
            Double mult = ferias * aliquota[1];
            JOptionPane.showMessageDialog(null, mult); 
            
        } else if (ferias <= max[2]) {
            Double mult = ferias * aliquota[2];
            JOptionPane.showMessageDialog(null, mult);
            
        } else{
            Double mult = ferias * aliquota[3];
            JOptionPane.showMessageDialog(null, mult);
        }

    }

}
