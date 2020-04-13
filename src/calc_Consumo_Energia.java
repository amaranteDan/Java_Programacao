import javax.swing.JOptionPane;

public class calc_Consumo_Energia {

	public static void main(String[] args) {
		
		float potencia, tempo, consumo, valor_consumo;
		float tarifa = (float) 0.25;
		String aux, aux1, aparelho;
		
		aparelho = JOptionPane.showInputDialog("Qual aparelho gostaria de calcular o consumo");
		
		aux = JOptionPane.showInputDialog("Qual a potencia");
		potencia = Float.parseFloat(aux);
		
		aux1 = JOptionPane.showInputDialog("Quanto tempo ele fica ligado");
		tempo = Float.parseFloat(aux1);
		
		consumo = (potencia / 1000) * tempo;
		valor_consumo = tarifa * consumo;
		
		JOptionPane.showMessageDialog(null, "O aparelho: " +  aparelho +"  consome "+  consumo + " KWh." + "\t O tempo em uso = "+tempo + " horas"+
		"O valor a pagar R$ " + valor_consumo);
		
				

	}

}
