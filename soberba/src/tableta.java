
import  javax.swing.*;


public class tableta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
		int opção = 0;
		while (opção < 5) {
			opção = Integer.parseInt(JOptionPane.showInputDialog(
					"[1] somar" + "\n[2] multiplicar" + "\n[3] maior numero" + "\n[4] novo numero" + "\n[5] sair"));
			
			if (opção == 1) {
				int soma = n1 + n2;
				JOptionPane.showMessageDialog(null, "a soma entre " + n1 + " e " + n2 + " é " + soma);
			} else if (opção == 2) {
				int mult = n1 * n2;
				JOptionPane.showMessageDialog(null, "A multiplicão entre " + n1 + " e " + n2 + " é " + mult);
			} else if (opção == 3) {
				if (n1 > n2) {
					int maior = n1;
					JOptionPane.showMessageDialog(null, "Entre  " +n1+ " e " +n2+ " O maior é  " + maior);
				} else {
					int maior = n2;
					JOptionPane.showMessageDialog(null, "Entre" + n1 + " e " + n2 + " o maior é" + maior);
				}
				if (opção == 4) {
					JOptionPane.showMessageDialog(null, "Informe os numeros novamente");
					n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
					n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
				}
				if (opção == 5) {
					JOptionPane.showMessageDialog(null, "Finalizando...");
				} else {
					JOptionPane.showMessageDialog(null, "Erro, tente novamente");
					
				}
			}

		}JOptionPane.showMessageDialog(null, "fim do programa volte sempre!");

	}
}
