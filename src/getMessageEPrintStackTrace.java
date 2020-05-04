import javax.swing.JOptionPane;

public class getMessageEPrintStackTrace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = Integer.parseInt(JOptionPane.showInputDialog("Forneca um numero"));
		
		try {
			int y = x / 0;
		} catch (Exception erro) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, erro.getMessage() );
			erro.printStackTrace();
		}

	}

}
