import javax.swing.JOptionPane;

public class calc_Consumo_Energia {

	public static void main(String[] args) {
		
		float potencia, tempo, consumo, valor_consumo;
		double tarifa = (double) 0.25;
		String aux, aux1, aparelho;
		
		aparelho = JOptionPane.showInputDialog("Qual aparelho gostaria de calcular o consumo");
		
		aux = JOptionPane.showInputDialog("Qual a potencia");
		potencia = (float) Double.parseDouble(aux);
		
		aux1 = JOptionPane.showInputDialog("Quanto tempo ele fica ligado");
		tempo = Float.parseFloat(aux1);
		
		consumo = (potencia / 1000) * tempo;
		valor_consumo = (float) (tarifa * consumo);
				
		System.out.printf("Aparelho verificado: %s %n", aparelho);
		System.out.printf("Consumo %.2f W%n", consumo);
		System.out.printf("Tempo %.2f%n", tempo);
		JOptionPane.showMessageDialog(null, "Valor do consumo: R$ " + valor_consumo);

	}

}
