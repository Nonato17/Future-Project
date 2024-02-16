
import javax.swing.*;


public class vitima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primeira = Integer.parseInt(JOptionPane.showInputDialog("\"Telefonou para a vitima? \n1- Para Sim \n2- Para Não")); 
		
		int segunda = Integer.parseInt(JOptionPane.showInputDialog("Esteve no local do crime? \n1- Para Sim \n2 - Para Não"));
		
		int terceira = Integer.parseInt(JOptionPane.showInputDialog("Mora perto da vítima? \n1- Para Sim \n2- Para Não"));
		
		int quarta = Integer.parseInt(JOptionPane.showInputDialog("Devia para a vítima? \n1- Para Sim \n2- Para Não"));
	
		int quinta = Integer.parseInt(JOptionPane.showInputDialog("Já trabalhou com a vítima? \n1 Para Sim \n2- Para Não"));
		int respostas = primeira + segunda + terceira + quarta + quinta;
		if (respostas == 7 || respostas == 6) {
			JOptionPane.showMessageDialog(null, "Cumplice");
		} else if (respostas == 5) {
			JOptionPane.showMessageDialog(null,"Assassino");
		} else if (respostas == 8) {
			JOptionPane.showMessageDialog(null,"Suspeita");
		} else if (respostas == 10 && respostas == 9) {
			JOptionPane.showMessageDialog(null,"Inocente");
		}

	}

}
