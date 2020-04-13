import javax.swing.JOptionPane;

public class calc_Resistor_Serie {

	public static void main(String[] args) {
		float r1, r2, r3, r4;
		
		try {
			
			String aux = JOptionPane.showInputDialog("Valor do primeiro Resistor:");
			r1 = Float.parseFloat(aux);
			
			String aux1 = JOptionPane.showInputDialog("Valor do segundo Resistor:");
			r2 = Float.parseFloat(aux1);
			
			String aux2 = JOptionPane.showInputDialog("Valor do terceiro Resistor:");
			r3 = Float.parseFloat(aux2);
			
			String aux3 = JOptionPane.showInputDialog("Valor do quarto Resistor:");
			r4 = Float.parseFloat(aux3);
			
			float req = r1 + r2 + r3 + r4;
			
			JOptionPane.showMessageDialog(null, "O valor de resistencia em serie= "+req+" ohms");
			
		} catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Erro ao inserir valores" +erro.toString());
		}
		
		System.exit(0);
	}

}
