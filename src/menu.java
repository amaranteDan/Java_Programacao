import java.io.IOException;

import javax.swing.JOptionPane;

public class menu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String operacao = JOptionPane.showInputDialog("Digite uma opção: \n 1) Calculo Resistor \n 2) Escolha de Time \n 3) Entrada de Dados"
				+ "\n 4) Rodizio  \n 5) Tabuada");
		switch(operacao){
		case "1":
			calc_Resistor_Serie.main(null);
			break;
		case "2":
			escolhaDeTime.main(null);
			break;
		case "3":
			entradaDados.main(null);
			break;
		case "4":
			rodizio.main(null);
		case "5":
			Exemplo.main(null);
			break;
		default:
			System.out.println("Opção nao valida");
		}
		System.exit(0);
	}

}
