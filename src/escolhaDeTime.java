import javax.swing.JOptionPane;

public class escolhaDeTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] op = {"São Paulo", "Corinthians", "Palmeiras", "Santos"};
		String resp = (String) JOptionPane.showInputDialog(null, "Selecione seu time favorito\n", "Pesquisa",
				JOptionPane.PLAIN_MESSAGE, null, op, "Corinthinas");
		if (resp == null){
			JOptionPane.showMessageDialog(null, "Voce pressionou Cancelar");
		}if (resp == "São Paulo"){
			JOptionPane.showMessageDialog(null, "Você é  Bambi !!!");
		}if (resp == "Corinthians"){
			JOptionPane.showMessageDialog(null, "Você é GAMBA !!!");
		}if (resp == "Pameiras"){
			JOptionPane.showMessageDialog(null, "Você é porco !!!");
		}if (resp == "Santos"){
			JOptionPane.showMessageDialog(null, "Você so gosta do Pele !!!");
		}
		System.exit(0);
	}

}
