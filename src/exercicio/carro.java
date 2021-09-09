package exercicio;

public class carro {
	
	private String marca;
	private String modelo;
	private String cor;
	private String preco;
		
	public void setMarca(String marca) {
		this.marca = marca;		
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;	
	}
	
	public void setCor(String cor) {
		this.cor = cor; 	
	}
	
	public void setPreco(String preco) {
		this.preco = preco; 
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public String getPreco() {
		return preco;
	}
}