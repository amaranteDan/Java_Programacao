import javax.swing.JOptionPane;

public class exercicioSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mes = JOptionPane.showInputDialog("Forneça o numero do mes: ");
		
		if(mes != null){
			switch(mes){
				case "1":
					mes = "Janeiro";
					break;
				case "2":
					mes = "Fevereiro";
					break;
				case "3":
					mes = "Março";
					break;
				case "4":
					mes = "Abril";
					break;
				case "5":
					mes = "Maio";
					break;
				case "6":
					mes = "Junho";
					break;
				case "7":
					mes = "Julho";
					break;
				case "8":
					mes = "Agosto";
					break;
				case "9":
					mes = "Setembro";
					break;
				case "10":
					mes = "Outubro";
					break;
				case "11":
					mes = "Novembro";
					break;
				case "12":
					mes = "Dezembro";
					break;
				default:
					mes = "Desconhecido!";
			}
			JOptionPane.showMessageDialog(null, mes);
		}
		System.exit(0);
	}

}
