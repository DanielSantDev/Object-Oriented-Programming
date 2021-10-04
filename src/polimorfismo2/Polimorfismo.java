package polimorfismo2;

import javax.swing.*;

public class Polimorfismo {
	
	public static void main(String[] args) {
		/*declaração de objeto do tipo da superclasse
		 * inicialização como "vazio"
		 * */
		Contribuinte pessoa = null;
		//leitura de variavel que definirá como o objeto setá instanciado
		int tipo = Integer.parseInt(JOptionPane.showInputDialog
				("Digitar opção: valor numerico entre 1 e 4"));
		
		//definição de como o objeto será instanciado
		switch(tipo) {
		case 1:
			pessoa = new Contribuinte(); break; //instância pela superclasse
			
		case 2:
			pessoa = new PessoaFisica(); break; //intância pela classe PessoaFisica
		
		case 3:
			pessoa = new PessoaJuridica(); break; //instância pela classe PessoaJuridica
		
		case 4:
			pessoa = new Funcionario(); break; //instância pela classe Funcionario
		
			default: {System.out.println("tipo não pertence à familia");
				System.exit(0);	}
		}//Fim do Switch
	pessoa.mostraClasse();
	}//fim do void main

}
