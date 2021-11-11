package tipagem;

import javax.swing.*;

public class Interface_Tipagem {

	String p;
	int q;
	Cidade r = null;
	
	/*M�todo do tipo da superclasse*/
	public Cidade locais_cidade() {
		
		p = JOptionPane.showInputDialog("Digite nome do local");
		q = Integer.parseInt(JOptionPane.showInputDialog("DIGITAR A QUANTIDADE DE HABITANTES"));
		String local = JOptionPane.showInputDialog("cidade = c n/ bairro = b n/ distrito = d /n \\");		
		char tipo = local.charAt(0);
		
		if(tipo == 'c')
			return new Cidade(p,q);
		
		if(tipo == 'b')
			return r = new Bairro(p,q);
		
		else if(tipo == 'd')
			return r = new Distrito(p,q);
		
		else
			return null;
	}
	
	public void tipo_local(Cidade f) {
		
		//o operador instanceof permite definir se uma inst�ncia � ou n�o de determinada classe
		if(f instanceof Bairro) {
			((Bairro)f).setNomeBairro(p);((Bairro)f).setHabitantesBairro(q);
			System.out.println("local � bairro" + "\n nome do bairro = " + ((Bairro)f).getNomeBairro()+
					"\n n�mero de habitantes = " + ((Bairro)f).getHabitantesBairro());
		}
		else if (f instanceof Distrito) {
			((Distrito)f).setNomeDistrito(p);((Distrito)f).setHabitantesDistrito(q);
			System.out.println("local � distrito" + "zn nome do distrito = " + ((Distrito)f).getNomeDistrito()+
					"\n n�mero de habitantes = " + ((Distrito)f).getHabitantesDistrito());
		}
		else {
			f.setNome(p);f.setHabitantes(q);
			System.out.println("local � cidade" + "\n nome da cidade = " + ((Cidade)f).getNome()+
					"\n n�mero de habitantes = " + ((Cidade)f).getHabitantes());
		}
		//System.out.println("Localidade indefinida");
	}
	
}
