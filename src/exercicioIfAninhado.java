import javax.swing.JOptionPane;

public class exercicioIfAninhado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String aux = JOptionPane.showInputDialog("Forneça o numero do mes:");
		if (aux != null){
			try {
				int mes = Integer.parseInt(aux);
				if (mes == 1){
					JOptionPane.showMessageDialog(null, "Janeiro");
				}else if (mes == 2){
					JOptionPane.showMessageDialog(null, "Fevereiro");
				}else if (mes  == 3){
					JOptionPane.showMessageDialog(null, "Março");
				}else if (mes == 4) {
					JOptionPane.showMessageDialog(null, "Abril");
				}else if (mes == 5) {
					JOptionPane.showMessageDialog(null, "Maio");
				}else if (mes == 6) {
					JOptionPane.showMessageDialog(null, "Junho");
				}else if (mes == 7){
					JOptionPane.showMessageDialog(null, "Julho");
				}else if (mes ==8){
					JOptionPane.showMessageDialog(null, "Agosto");
				}else if (mes == 9){
					JOptionPane.showMessageDialog(null, "Setembro");
				}else if (mes == 10){
					JOptionPane.showMessageDialog(null, "Outubro");
				}else if (mes == 11){
					JOptionPane.showMessageDialog(null, "Novembro");
				}else if (mes == 12){
					JOptionPane.showMessageDialog(null, "Dezembro");
				}else{
					aux = "Mes Desconhecido";
				}
				JOptionPane.showMessageDialog(null, aux);
			} catch (NumberFormatException erro) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "Digite apenas numeros"+erro);
			}
		}
		System.exit(0);		
	}

}
