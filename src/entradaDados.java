import javax.swing.JOptionPane;
public class entradaDados {

	public static void main(String[] args) {
		float largura, comprimento, area, perimetro;
		try {
			String aux =  JOptionPane.showInputDialog("Entre com o comprimento");
			comprimento = Float.parseFloat(aux);
			String aux1 =  JOptionPane.showInputDialog("Entre a largura");
			largura = Float.parseFloat(aux1);
			
			area = comprimento * largura;
			perimetro = comprimento * 2 + largura *2;
			
			JOptionPane.showMessageDialog(null, "Area: " + area + ", Perimetro: " +perimetro);
		} catch (NumberFormatException erro) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null,  "Houve erro na conversao "+erro.toString());
		}

	}

}
