package polimorfismo2;

public class PessoaJuridica extends Contribuinte {
	public String cnpj;

	public String getCnpj() {
		return (cnpj);
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void mostraClasse() {
		System.out.println("CLASSE PessoaJuridica");
	}

}
