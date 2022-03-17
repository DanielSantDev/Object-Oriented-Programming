package subtipagem;

public class Aplica_Subtipagem {

	public static void main(String[] args) {
		
		Define_Mamifero df = new Define_Mamifero();
		Mamifero f = null;
		
		//1� itera��o
		f = df.tipo_Mamifero("cachorro");
		df.verifica_instancia(f);
		
		//2� itera��o
		f = df.tipo_mamifero("puma");
		df.verifica_instancia(f);
		
		//3� itera��o
		f = df.tipo_mamifero("on�a");
		df.verifica_instancia(f);
		
	}
	
}
