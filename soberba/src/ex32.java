

import javax.swing.JOptionPane;

public class ex32 {

	public static void main(String[] args) {
		// inteiro e fatorial
		float n = Float.parseFloat(JOptionPane.showInputDialog("Digite um numero inteiro:"));
		float fatorial = n;
		for (float i = n-1; i >=1; i--) {
			fatorial = i * fatorial;			
		}
		JOptionPane.showMessageDialog(null, "O resultado sera:" + fatorial);
	}

}
