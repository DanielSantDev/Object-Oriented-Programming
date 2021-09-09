package livraria;

import javax.swing.JOptionPane;
public class Atendente_Livraria {

	public static void main(String[] args) {
		
		Livraria cultura = new Livraria();
		
		cultura.setEditora(JOptionPane.showInputDialog("Digite o nome da editora: "));
		cultura.setAutor(JOptionPane.showInputDialog("Digite o nome da Autor: "));
		cultura.setLivro(JOptionPane.showInputDialog("Digite o nome da Livro: "));
		cultura.setCapadura(JOptionPane.showInputDialog("Tem capa dura? s/n?: "));
		cultura.setQuantidade(JOptionPane.showInputDialog("Digite a Quantidade: "));
		cultura.setPreco(JOptionPane.showInputDialog("Digite o preco do livro unitário: "));
		
		System.out.println("EDITORA: " + cultura.getEditora());
		System.out.println("AUTOR: " + cultura.getAutor());
		System.out.println("LIVRO: " + cultura.getLivro());
		System.out.println("CAPADURA? " + cultura.getCapadura());
		System.out.println("QUANTIDADE: " + cultura.getQuantidade());
		System.out.println("PREÇO: " + cultura.getPreco());
		
	}
}	
		
		/*a = JOptionPane.showInputDialog(null, "Código");
		b = JOptionPane.showInputDialog(null, "Editora");
		c = JOptionPane.showInputDialog(null, "Autor");
		d = JOptionPane.showInputDialog(null, "Livro");
		e = JOptionPane.showInputDialog(null, "Quantidade");
		i = JOptionPane.showInputDialog(null, "Preço");
		j = JOptionPane.showInputDialog(null, "Capa Dura");
		
		f = Integer.parseInt(a);
		g = Integer.parseInt(e);
		h = Double.parseDouble(i);
		
		cultura.editora = b;
		cultura.autor = c;
		cultura.livro = d;
		cultura.quantidade = g;
		cultura.preco = h;
		cultura.capadura = j;
		
		cultura.Informa_Livros(f);*/
