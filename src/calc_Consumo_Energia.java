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
		
		System.out.printf("O %s consome %f. O %f horas. O Valor a pagar e R$ %f ",aparelho, consumo, tempo, valor_consumo);
		
				

	}

}
