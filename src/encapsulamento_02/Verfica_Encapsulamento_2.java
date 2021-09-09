package encapsulamento_02;

import encapsulamento_01.Acesso_Numeros;

public class Verfica_Encapsulamento_2 {

	public static void main(String[] args) {
		
		Acesso_Numeros chave = new Acesso_Numeros();
		
		/*chave.a = 10; ENCAPSULAMENTO PUBLIC NÃO EXPLICITO
		 * NÃO PERMITE ACESSO FORA DO PACOTE */
		chave.setNumero("a", 10);
		chave.b = 20;
		//chave.c = 30; NÃO É POSSÍVEL ACESSAR VAIÁVEL PRIVATE DIRETAMENTE
		chave.setNumero("c", 30);
		/*chave.d = 40; NÃO É POSSÍVEL ACESSAR VARIÁVEL PROTECTED DIRETAMENTE
		 * FORA DO PACOTE*/
		chave.setNumero("d", 40);
		chave.mostra_numero();
	}

}
