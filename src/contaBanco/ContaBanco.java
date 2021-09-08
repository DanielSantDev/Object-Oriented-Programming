package contaBanco;

public class ContaBanco {
	
	//atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	//Métodos Personalizados
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.saldo = 50;
			this.setSaldo(50);
		} else if(t == "CP"){
			this.saldo = 150;
		}
	}
	
	public void fecharConta() {
		
	}
	
	public void depositar() {
		
	}
	
	public void sacar() {
		
	}
	
	public void pagarMensal() {
		
	}
	
	//Métodos Especiais
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}
	
	
	
	public int getNumConta() {
		return this.numConta;
	}
	
	public void setNumConta(int n) {
		this.numConta = n;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String setTipo(String Tipo) {
		return this.tipo = tipo;
	}
	
	public String getDono() {
		return dono;
	}
	
	public String setDono(String Dono) {
		return this.dono = dono;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public float setSaldo(float n) {
		return this.saldo = n;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	public boolean setStatus(boolean ) {
		
	}
	
	
	
	
	
	