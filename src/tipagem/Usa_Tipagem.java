package tipagem;

public class Usa_Tipagem {
	
	public static void main(String[] args) {
		
		//construção do objeto que represetará a interface tipagem
		Interface_Tipagem IT = new Interface_Tipagem();
		
		//objeto da superclasse Cidade
		Cidade CD;
		
		//uso do método locais_cidade da interface através do objeto da superclasse
		CD = IT.locais_cidade();
		
		//no método da ninterface locais_cidade é definido de que classe é o objeto
		
		IT.tipo_local(CD);
		/*O identificador de objeto pode receber enderecos de instâncias de sua classe
		 * ou de qualque classe descendente.
		 * O objeto ou identificador CD recebe o endereço de intância das Classes Cidade,
		 * Bairo e Distrito. Esse identificador passa a identificar (conter o endereço,
		 * referencia) de uma instância de subclasse de Cidade.
		 * A COMPATIBILIDADE DE ENDEREÇOS DE IDENTIFICADORES DE UMA CLASSE COM INSTÂNCIAS
		 * DE SUBCLASSES É DENOMINADA DE SUBTIPAGEM (Boratti, 2007). */
		
	}

}
