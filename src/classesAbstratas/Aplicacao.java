package classesAbstratas;

public class Aplicacao {

	public static void main(String[] args) {
		
		ClasseAbstrata a = new ClasseFilha();
		a.set_mensagem("Demostrando Classe Abstrata");
		a.mostra_mensagem();
		
	}
	
}
