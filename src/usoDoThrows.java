
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class usoDoThrows {

	public static void main(String args[]) throws IOException {
		// TODO Auto-generated method stub
		String frase = JOptionPane.showInputDialog("Escreva sua frase:");
		try {
			
			
			FileWriter file = new FileWriter ("C:/Users/danz8/Desktop/Folder_Java/frases.txt",true);
			PrintWriter out = new PrintWriter(file);
			out.println(frase.toUpperCase());
			file.close();
			out.close();
			
			JOptionPane.showMessageDialog(null, "Frase armazenda no arquivo");
		} catch (FileNotFoundException erro) {
			// TODO: handle exception
		}		JOptionPane.showMessageDialog(null, "Erro, verifiquei se a pasta existe");

	}

}
