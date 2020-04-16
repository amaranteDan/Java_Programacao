import javax.swing.JOptionPane;


public class exercicioIf_1 {
	public static void main (String[] args){
		Object[] op = {"Masculino", "Feminino"};
		String resp = (String) JOptionPane.showInputDialog(null, 
				"Selecione o sexo:\n", "Pesquisa", JOptionPane.PLAIN_MESSAGE, null, op, "Masculino");
		if (resp == null){
			JOptionPane.showMessageDialog(null,  "Voce pressionou Cancel");
		}if (resp == "Masculino"){
			JOptionPane.showMessageDialog(null, "Voce é homem!!!");
		}if (resp == "Feminino"){
			JOptionPane.showMessageDialog(null, "Voce é mulher!!!");
		}
		System.exit(0);
	}   
		
	

}
