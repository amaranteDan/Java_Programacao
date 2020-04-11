import javax.swing.JOptionPane;

public class calculo_Ohms {
	public static void main(String []args) {
		
	String aux;
	float tensao, resistencia, corrente;
	
	try{
		aux = JOptionPane.showInputDialog("Informe a tensão: U");
		tensao = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Informe a resistencia: R");
		resistencia = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Informe a corrente: (i)");
		corrente = Float.parseFloat(aux);
		
		float rtensao = resistencia * corrente;
		float rcorrente = resistencia / tensao ;
		float r_resistencia = tensao / corrente;
		
		JOptionPane.showMessageDialog(null, "A tensão ="+rtensao+"V"+"\nA corrente ="+rcorrente+"mah"+"\nA resistencia ="+r_resistencia+"Ohms");
		
	}catch(NumberFormatException erro){
		JOptionPane.showMessageDialog(null, "Houve um erro na conversao" +erro.toString());
		
	}
	System.exit(0);

}
}