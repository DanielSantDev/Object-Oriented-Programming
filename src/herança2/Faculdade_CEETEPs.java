package herança2;

public class Faculdade_CEETEPs extends Centro_Paula_Souza{
	private String faculdade;
	
	public Faculdade_CEETEPs() {
		super("Santos");
		/*o método super() acessa o método da classe
		 * com hierarquia imediatamente superior na relação de herança*/
	}

	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}
	
	
	public String getFaculdade() {
		return faculdade;
	}

}