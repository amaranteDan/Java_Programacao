import javax.swing.JOptionPane;

public class loginSenha {
	
	public static void main (String args []){
		int cont = 0;
		
		final String loginOriginal = "java8";
		final String senhaOriginal = "java8";
		
		while( cont < 3){
			String login = JOptionPane.showInputDialog("Forneça um login:");
			String senha = JOptionPane.showInputDialog("senha:");
			
			if(login.equals(loginOriginal) && senha.equals(senhaOriginal)){
				JOptionPane.showMessageDialog(null, "Login e senhas aceitos!");
				break;
			}else{
				cont++;
			}	if(cont == 3){
				JOptionPane.showMessageDialog(null, "Numero de tentativas esgotadas!");
			}else{
				JOptionPane.showMessageDialog(null, "Falha, verifique seu usuario e senha!\n"
						+ "Você tem mais "+ (3 - cont)+ "tentativa(s)");
			}
		}
		System.exit(0);
		
	}
	
}
