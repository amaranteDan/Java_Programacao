package pontoFlutuante;

import javax.swing.JOptionPane;

public class rodizioSaoPaulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Criar um programa para avaliar custo X beneficio sobre uso do Uber para atendimentos.
		
		//Distância: 10 Km
		//Tempo: 18 minutos
		//2 + (18 x 0,26) + (10 x 1,4) x 0,75 = R$ 15,51 Calculo Real Uber.
		
		// Meu exemplo - Estimativa 30 km em 1hora
		
		String rodizio, aux1, mesagem, placa;
		
		double uber = 1.7;//dia de semana com baixa demanda.
		double km = 0.87;
		double distancia, calc_ncr, calc_uber;
		double km_ncr = 0.87;
		
		int[] impar_rodizio = {1,3,5,7,9};
		int [] par_rodizio = {2,4,6,8,0};
		
		placa = JOptionPane.showInputDialog("Informe o final da sua placa: ");
		
		
		if(placa != null ){
			switch(placa){
			case "1":
				placa = "Placa de dia impar";
				break;
			case "2":
				placa = "Placa de dia par!";
				break;
			case "3":
				placa = "Placa de dia impar";
				break;
			case "4":
				placa = "Placa de dia par";
				break;
			case "5":
				placa = "Placa de dia impar";
				break;
			case "6":
				placa = "Placa de dia par";
				break;
			case "7":
				placa = "Placa de dia impar";
				break;
			case "8":
				placa = "Placa de dia par";
				break;
			case "9":
				placa = "Placa de dia impar";
				break;
			case "0":
				placa = "Placa de dia impar";
				break;
			default: 
				placa = "Desconhecido!";
				
			}
			
				 
		}
		
		
		String aux2 = JOptionPane.showInputDialog("Informe a distancia percorrida: ");
		distancia = Double.parseDouble(aux2);
		calc_ncr = distancia * km_ncr;
		//2 + (18 x 0,26) + (10 x 1,4) x 0,75 = R$ 15,51 Calculo Real Uber.
		//calc_uber = distancia * uber;
		calc_uber = 2 +((18 * 0.26) + (distancia * 1.4)) * 0.75;
		JOptionPane.showMessageDialog(null, placa);
		JOptionPane.showMessageDialog(null, "O valor do km da NCR e R$: " + calc_ncr);
		JOptionPane.showMessageDialog(null, "O valor do km da UBER e R$ : " + calc_uber);
		
		}
		
					

	}


