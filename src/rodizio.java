import javax.swing.JOptionPane;

public class rodizio {

	public static void main(String[] args) {
		Object[] op = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
		String resp = (String) JOptionPane.showInputDialog(null, "Selecione o final da sua placa\n", "Pesquisa",
				JOptionPane.PLAIN_MESSAGE, null, op, "1");
		if(resp == null){
			JOptionPane.showMessageDialog(null, "Voce pressionou Cancelar");
		}else if(resp == "1"){
			JOptionPane.showMessageDialog(null, "Placa nao pode circular nos dias impares");
		}else if(resp == "2"){
			JOptionPane.showMessageDialog(null, "Placa nao pode circular nos dias pares");
		}else if (resp == "3"){
			JOptionPane.showMessageDialog(null, "Placa nao pode circular nos dias impares");
		}else if (resp == "4"){
			JOptionPane.showMessageDialog(null, "Placa nao pode circular nos dias pares");
		}else if (resp == "5"){
			JOptionPane.showMessageDialog(null, "Placa nao pode circular nos dias impares");
		}else if (resp == "6"){
			JOptionPane.showMessageDialog(null, "Placa nao pode circular nos dias pares");
		}else if (resp == "7"){
			JOptionPane.showMessageDialog(null, "Placa nao pode circular nos dias impares");
		}else if (resp == "8"){
			JOptionPane.showMessageDialog(null, "Placa nao pode circular nos dias pares");
		}else if (resp == "9"){
			JOptionPane.showMessageDialog(null, "Placa nao pode circular nos dias impares");
		}else if (resp == "0"){
			JOptionPane.showMessageDialog(null, "Placa nao pode circular nos dias pares");
		}else{
			resp = "Placa desconhecida";
			
		}
				
		
	}

}
