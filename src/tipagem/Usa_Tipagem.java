package tipagem;

public class Usa_Tipagem {
	
	public static void main(String[] args) {
		
		//constru��o do objeto que represetar� a interface tipagem
		Interface_Tipagem IT = new Interface_Tipagem();
		
		//objeto da superclasse Cidade
		Cidade CD;
		
		//uso do m�todo locais_cidade da interface atrav�s do objeto da superclasse
		CD = IT.locais_cidade();
		
		//no m�todo da ninterface locais_cidade � definido de que classe � o objeto
		
		IT.tipo_local(CD);
		/*O identificador de objeto pode receber enderecos de inst�ncias de sua classe
		 * ou de qualque classe descendente.
		 * O objeto ou identificador CD recebe o endere�o de int�ncia das Classes Cidade,
		 * Bairo e Distrito. Esse identificador passa a identificar (conter o endere�o,
		 * referencia) de uma inst�ncia de subclasse de Cidade.
		 * A COMPATIBILIDADE DE ENDERE�OS DE IDENTIFICADORES DE UMA CLASSE COM INST�NCIAS
		 * DE SUBCLASSES � DENOMINADA DE SUBTIPAGEM (Boratti, 2007). */
		
	}

}
