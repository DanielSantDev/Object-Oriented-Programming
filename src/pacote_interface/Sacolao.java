package pacote_interface;

public class Sacolao {
	
	public static void main(String[] args) {
		
		Implementa_Interface a = new Implementa_Interface();
		a.fruta_citrica = "laranja";
		a.fruta_vermelha = "ma�a";
		
		System.out.println("Fruta C�trica: " + a.identifica_fruta(a.fruta_citrica));
		System.out.println("Fruta Vermelha: " + a.identifica_fruta(a.fruta_vermelha));
		System.out.println("Quantidade de frutas>: " + a.quantidade_frutas(12));
		System.out.println("Preco kilo fruta: R$ " + a.preco_kilo(5.66));
	}

}