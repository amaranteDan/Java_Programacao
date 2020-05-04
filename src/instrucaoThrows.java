import javax.swing.JOptionPane;

public class instrucaoThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Forneca sua idade"));
			if (idade < 18){
				throw new Exception("Entrada não permitida");
			}else{
				JOptionPane.showMessageDialog(null, "Entrada permitida, Bem vindo :)");
			}
		} catch (Exception erro) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, erro.toString());
		}

	}

}
