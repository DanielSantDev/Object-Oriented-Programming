package polimorfismo;

import javax.swing.*;

public class Empresa_de_Constru��o {
	
	public static void main(String[] args) {
		
		Construcao pedreiro = null;
		
		int tipo_construcao = Integer.parseInt(JOptionPane.showInputDialog("Digitar o tipo "
				+ "de constru��o: " + "\n" + "1 - CASA e 2 - APARTAMENTO ou 3 - TUDO" ));
		
		switch(tipo_construcao) {
		case 1:
			pedreiro = new Casa(); break;
			
		case 2:
			pedreiro = new Apartamento(); break;
			
		case 3:
			pedreiro = new Construcao(); break;
			
			default:
				System.out.println("CONSTRU��O INDEFINITIVA");
				System.exit(0);	}//fim do switch case
		
			pedreiro.constroi();
		}//fim do void main

}
