import javax.swing.JOptionPane;

public class escolhaDeTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] op = {"S�o Paulo", "Corinthians", "Palmeiras", "Santos"};
		String resp = (String) JOptionPane.showInputDialog(null, "Selecione seu time favorito\n", "Pesquisa",
				JOptionPane.PLAIN_MESSAGE, null, op, "Corinthinas");
		if (resp == null){
			JOptionPane.showMessageDialog(null, "Voce pressionou Cancelar");
		}if (resp == "S�o Paulo"){
			JOptionPane.showMessageDialog(null, "Voc� �  Bambi !!!");
		}if (resp == "Corinthians"){
			JOptionPane.showMessageDialog(null, "Voc� � GAMBA !!!");
		}if (resp == "Pameiras"){
			JOptionPane.showMessageDialog(null, "Voc� � porco !!!");
		}if (resp == "Santos"){
			JOptionPane.showMessageDialog(null, "Voc� so gosta do Pele !!!");
		}
		System.exit(0);
	}

}
