package metodos_set_get;

import javax.swing.JOptionPane;

public class Informa_dados {
	
	public static void main(String[] args) {
		
		Dados_Contribuinte a = new Dados_Contribuinte();
		
		/*a.setNome("Daniela Bento");
		a.setCPF("065.887.443-54");
		a.setCNPJ("776 998 /0001");
		a.setCartao("9776-J");*/
		
		a.setNome(JOptionPane.showInputDialog("Digite o nome: "));
		a.setCPF(JOptionPane.showInputDialog("Digite o CPF: "));
		a.setCNPJ(JOptionPane.showInputDialog("Digite o CNPJ: "));
		a.setCartao(JOptionPane.showInputDialog("Digite o Cart�o: "));
		
		System.out.println("nome do contribuinte " + a.getNome());
		System.out.println("CPF do contribuinte " + a.getCPF());
		System.out.println("CNPJ do contribuinte "+ a.getCNPJ());
		System.out.println("cartao do contribuinte " + a.getCartao());
		
	}

}
