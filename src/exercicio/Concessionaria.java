package exercicio;

import javax.swing.JOptionPane;

public class Concessionaria {
	
	public static void main(String[] args) {
		
		carro e = new carro();
		
		e.setMarca(JOptionPane.showInputDialog("Digite a Marca: "));
		e.setCor(JOptionPane.showInputDialog("Digite a Cor: "));
		e.setModelo(JOptionPane.showInputDialog("Digite o Modelo: "));
		e.setPreco(JOptionPane.showInputDialog("Digite o Preco: "));
		
		System.out.println("Marca do carro " + e.getMarca());
		System.out.println("Modelo do carro " + e.getModelo());
		System.out.println("Cor do carro " + e.getCor());
		System.out.println("Preço do carro " + e.getPreco());
		
	}

}