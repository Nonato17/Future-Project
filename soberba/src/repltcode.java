
import javax.swing.*;
public class repltcode {

	public static void main(String[] args) {

		double salario = Double.parseDouble(JOptionPane.showInputDialog("Quanto é o salario"));
		if (salario <= 280) {
			double novo = salario + (0.20 * salario);
			double valor = novo - salario;
			JOptionPane.showMessageDialog(null, "O valor do salario antes " + salario + "\nO novo valor do salario "
					+ novo + "\nO salario aumentou 20%" + "\nO valor de aumento foi " + valor);
		} else if (salario > 280 && salario <= 700) {
			double novo = salario + (0.15 * salario);
			double valor = novo - salario;
			JOptionPane.showMessageDialog(null, "O valor do salario antes " + salario + "\nO novo valor do salario "
					+ novo + "\nO salario aumentou 15%" + "\nO valor de aumento foi " + valor);
		} else if (salario > 700 && salario >= 1500) {
			double novo = salario + (0.10 * salario);
			double valor = novo - salario;
			JOptionPane.showMessageDialog(null, "O valor do salario antes " + salario + "\nO novo valor do salario "
					+ novo + "\nO salario aumentou 10%" + "\nO valor de aumento foi " + valor);
		} else {
			double novo = salario + (0.5 * salario);
			double valor = novo - salario;
			JOptionPane.showMessageDialog(null, "O valor do salario antes " + salario + "\nO novo valor do salario "
					+ novo + "\nO salario aumentou 5%" + "\nO valor de aumento foi " + valor);
		}

	}

}
