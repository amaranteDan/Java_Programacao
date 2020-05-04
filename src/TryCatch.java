import javax.swing.JOptionPane;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String aux1 = JOptionPane.showInputDialog("Forneça o primeiro valor");
			int num1 = Integer.parseInt(aux1);
			String aux2 = JOptionPane.showInputDialog("Forneça o segundo numero:");
			int num2 = Integer.parseInt(aux2);
			
			JOptionPane.showMessageDialog(null, "Soma =" + (num1 + num2));
			JOptionPane.showMessageDialog(null, "Subtracao =" + (num1 - num2));
			JOptionPane.showMessageDialog(null, "Multiplicacao =" + (num1 * num2));
			JOptionPane.showMessageDialog(null, "Divisao =" + (num1 / num2));
			JOptionPane.showMessageDialog(null, "Resto da Divisão =" + (num1 % num2));
					
		} catch (ArithmeticException erro) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Erro divisão por zero!\n" + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
		}catch(NumberFormatException erro){
			JOptionPane.showMessageDialog(null, "Erro de conversao!\n" + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
		}catch(NullPointerException erro){
			JOptionPane.showMessageDialog(null, "Tecla cancel pressionada!\n" + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
		System.exit(0);
	}

}
