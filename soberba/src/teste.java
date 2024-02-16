import javax.swing.*;
public class teste {
    public static void main(String[] args) {
        double Nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a primeira nota do aluno?"));
        double Nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a segunda nota do aluno?")); // Importar Nota1, Nota2
        double Media = (Nota1+Nota2)/2;     // Média = (Nota1+Nota2)/2
        JOptionPane.showMessageDialog(null,"A média do aluno foi:"+Media);//Mostra ("A média do aluno é: "+Média)
    }
}
