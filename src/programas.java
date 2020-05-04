import javax.swing.JOptionPane;

public class programas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String programa = JOptionPane.showInputDialog("Escolha o programa a ser executado:" );
		
		if(programa != null){
			switch(programa){
				case "calc_Consumo_Energia":
					programa = "calc_Consumo_Energia";
					break;
				case "2":
					programa = "calc_Resistor";
					break;
				default:
				programa = "Programa desconhecido";
			}
			JOptionPane.showMessageDialog(null, programa);	
		}
		System.exit(0);		

	}

}
