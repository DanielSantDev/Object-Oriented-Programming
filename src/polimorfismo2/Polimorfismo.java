package polimorfismo2;

import javax.swing.*;

public class Polimorfismo {
	
	public static void main(String[] args) {
		/*declara��o de objeto do tipo da superclasse
		 * inicializa��o como "vazio"
		 * */
		Contribuinte pessoa = null;
		//leitura de variavel que definir� como o objeto set� instanciado
		int tipo = Integer.parseInt(JOptionPane.showInputDialog
				("Digitar op��o: valor numerico entre 1 e 4"));
		
		//defini��o de como o objeto ser� instanciado
		switch(tipo) {
		case 1:
			pessoa = new Contribuinte(); break; //inst�ncia pela superclasse
			
		case 2:
			pessoa = new PessoaFisica(); break; //int�ncia pela classe PessoaFisica
		
		case 3:
			pessoa = new PessoaJuridica(); break; //inst�ncia pela classe PessoaJuridica
		
		case 4:
			pessoa = new Funcionario(); break; //inst�ncia pela classe Funcionario
		
			default: {System.out.println("tipo n�o pertence � familia");
				System.exit(0);	}
		}//Fim do Switch
	pessoa.mostraClasse();
	}//fim do void main

}
