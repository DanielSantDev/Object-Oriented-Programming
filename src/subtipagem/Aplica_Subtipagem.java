package subtipagem;

public class Aplica_Subtipagem {

	public static void main(String[] args) {
		
		Define_Mam�fero df = new Define_Mam�fero();
		Mam�fero f = null;
		
		//1� itera��o
		f = df.tipo_mam�fero("cachorro");
		df.verifica_inst�ncia(f);
		
		//2� itera��o
		f = df.tipo_mam�fero("puma");
		df.verifica_inst�ncia(f);
		
		//3� itera��o
		f = df.tipo_mam�fero("on�a");
		df.verifica_inst�ncia(f);
		
	}
	
}
