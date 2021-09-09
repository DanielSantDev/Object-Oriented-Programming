package encapsulamento_03;

public class Identifica_Dispositivo_Móvel {
	
	public static void main(String args[]) {
		
		Dispositivo_Móvel a = new Dispositivo_Móvel();
		a.identifica_número("13 99655 8666");
		a.identifica_usuário("Carla");
		
		Dispositivo_Móvel b = new Dispositivo_Móvel();
		b.identifica_número("13 99777 6688");
		b.identifica_usuário("Giovana");
		
		System.out.println("número do telefone " + a.número);
		System.out.println("usuário do telefone " + a.usuário);
		
		System.out.println("número do telefone " + b.número);
		System.out.println("usuário do telefone " + b.usuário);
		
		b.DDD = 17;
		a.DDD = 16;
		
		System.out.println("DDD do telefone " + b.DDD);
		System.out.println("DDD do telefone " + a.DDD);
		
	}

}
