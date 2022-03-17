package heranca2;

public class Faculdade_CEETEPs extends Centro_Paula_Souza{
	private String faculdade;
	
	public Faculdade_CEETEPs() {
		super("Santos");
		/*o m�todo super() acessa o m�todo da classe
		 * com hierarquia imediatamente superior na rela��o de heran�a*/
	}

	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}
	
	
	public String getFaculdade() {
		return faculdade;
	}

}