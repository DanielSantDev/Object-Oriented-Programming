package tipagem;

public class Distrito extends Cidade{
	
	//m�todo construtor de Distrito
	Distrito(String nome_local, int habitantes){
		
		//ativa��o do m�todo construtor da superclasse
		super(nome_local, habitantes);
	}
	
	public void setNomeDistrito(String nome_local) {
		this.nome_local = nome_local +"_district";
	}
	
	public String getNomeDistrito() {
		return nome_local;
	}
	
	public void setHabitantesDistrito(int habitantes) {
		this.habitantes = habitantes*300;
	}
	
	public int getHabitantesDistrito() {
		return habitantes;
	}

}
