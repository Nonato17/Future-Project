import javax.swing.JOptionPane;

public class code {
    public static void main(String[] args) {
    
        JOptionPane.showMessageDialog(null,"Seja Bem Vindo");
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome Por favor");
        int code = 31032005;
        int senha = 0;
          while (code != senha){
           senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua senha:"));
            if (senha != code){
                JOptionPane.showMessageDialog(null,"Acesso negado,Tente novamente");
            }else{
                JOptionPane.showMessageDialog(null,"Bem vindo de volta"+ nome);
                
            }
            
        }
        
    }
}
