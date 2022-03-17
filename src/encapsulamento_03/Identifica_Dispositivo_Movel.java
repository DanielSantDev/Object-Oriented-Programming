package encapsulamento_03;

public class Identifica_Dispositivo_Movel {
	
	public static void main(String args[]) {
		
		Dispositivo_Movel a = new Dispositivo_Movel();
		a.identifica_numero("13 99655 8666");
		a.identifica_usuario("Carla");
		
		Dispositivo_Movel b = new Dispositivo_Movel();
		b.identifica_numero("13 99777 6688");
		b.identifica_usuario("Giovana");
		
		System.out.println("n�mero do telefone " + a.numero);
		System.out.println("usu�rio do telefone " + a.usuario);
		
		System.out.println("n�mero do telefone " + b.numero);
		System.out.println("usu�rio do telefone " + b.usuario);
		
		b.DDD = 17;
		a.DDD = 16;
		
		System.out.println("DDD do telefone " + b.DDD);
		System.out.println("DDD do telefone " + a.DDD);
		
	}

}
