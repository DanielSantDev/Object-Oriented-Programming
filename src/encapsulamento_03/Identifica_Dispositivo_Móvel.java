package encapsulamento_03;

public class Identifica_Dispositivo_M�vel {
	
	public static void main(String args[]) {
		
		Dispositivo_M�vel a = new Dispositivo_M�vel();
		a.identifica_n�mero("13 99655 8666");
		a.identifica_usu�rio("Carla");
		
		Dispositivo_M�vel b = new Dispositivo_M�vel();
		b.identifica_n�mero("13 99777 6688");
		b.identifica_usu�rio("Giovana");
		
		System.out.println("n�mero do telefone " + a.n�mero);
		System.out.println("usu�rio do telefone " + a.usu�rio);
		
		System.out.println("n�mero do telefone " + b.n�mero);
		System.out.println("usu�rio do telefone " + b.usu�rio);
		
		b.DDD = 17;
		a.DDD = 16;
		
		System.out.println("DDD do telefone " + b.DDD);
		System.out.println("DDD do telefone " + a.DDD);
		
	}

}
