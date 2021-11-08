package subtipagem;

public class Aplica_Subtipagem {

	public static void main(String[] args) {
		
		Define_Mamífero df = new Define_Mamífero();
		Mamífero f = null;
		
		//1ª iteração
		f = df.tipo_mamífero("cachorro");
		df.verifica_instância(f);
		
		//2ª iteração
		f = df.tipo_mamífero("puma");
		df.verifica_instância(f);
		
		//3ª iteração
		f = df.tipo_mamífero("onça");
		df.verifica_instância(f);
		
	}
	
}
