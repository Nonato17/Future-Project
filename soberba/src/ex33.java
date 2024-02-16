
import javax.swing.*;

public class ex33 {

	public static void main(String[] args) {
		//tabuada
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		for (int i= 0; i<=10; i = i+1 ) {
			JOptionPane.showMessageDialog(null,"O resultado da tabuada do " +n+" será: "+ n*i);
			}
		
	}

}
