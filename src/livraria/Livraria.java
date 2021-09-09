package livraria;

import javax.swing.JOptionPane;
public class Livraria {

	private String editora;
	private String autor;
	private String livro;
	private String capadura;
	private String quantidade;
	private String preco;
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setLivro(String livro) {
		this.livro = livro;
	}
	
	public void setCapadura(String capadura) {
		this.capadura = capadura;
	}
	
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getLivro() {
		return livro;
	}
	
	public String getCapadura() {
		return capadura;
	}
	
	public String getQuantidade() {
		return quantidade;
	}
	
	public String getPreco() {
		return preco;
	}
	
}
	
	
	
	/*public void Informa_Livros(int codigo) {
		
		switch(codigo) {
		
		case 1: JOptionPane.showMessageDialog(null, "CATEGORIA ROMANCE \n" +
		"Livro: " + livro +
		"\n Editora: " + editora +
		"\n Autor: " + autor +
		"\n Quantidade: " + quantidade +
		"\n Capa Dura: " + capadura +
		"\n Preco R$ " + preco ,"", JOptionPane.PLAIN_MESSAGE); break;
		
		case 2: JOptionPane.showMessageDialog(null, "CATEGORIA ESPIRITA \n" +
		"Livro: " + livro +
		"\n Editora: " + editora +
		"\n Autor: " + autor +
		"\n Capa Dura: " + capadura +
		"\n Quantidade: " + quantidade +
		"\n Preco R$ " + preco ,"", JOptionPane.PLAIN_MESSAGE); break;
		
		case 3: JOptionPane.showMessageDialog(null, "CATEGORIA INFORMÁTICA \n" +
		"Livro: " + livro +
		"\n Editora: " + editora +
		"\n Autor: " + autor +
		"\n Capa Dura: " + capadura +
		"\n Quantidade: " + quantidade +
		"\n Preco R$ " + preco ,"", JOptionPane.PLAIN_MESSAGE); break;
		
		default: System.out.println("codigo não corresponde a nenhuma categoria de livro!");
		}*/
