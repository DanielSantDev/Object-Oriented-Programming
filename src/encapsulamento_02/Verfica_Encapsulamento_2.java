package encapsulamento_02;

import encapsulamento_01.Acesso_Numeros;

public class Verfica_Encapsulamento_2 {

	public static void main(String[] args) {
		
		Acesso_Numeros chave = new Acesso_Numeros();
		
		/*chave.a = 10; ENCAPSULAMENTO PUBLIC N�O EXPLICITO
		 * N�O PERMITE ACESSO FORA DO PACOTE */
		chave.setNumero("a", 10);
		chave.b = 20;
		//chave.c = 30; N�O � POSS�VEL ACESSAR VAI�VEL PRIVATE DIRETAMENTE
		chave.setNumero("c", 30);
		/*chave.d = 40; N�O � POSS�VEL ACESSAR VARI�VEL PROTECTED DIRETAMENTE
		 * FORA DO PACOTE*/
		chave.setNumero("d", 40);
		chave.mostra_numero();
	}

}
