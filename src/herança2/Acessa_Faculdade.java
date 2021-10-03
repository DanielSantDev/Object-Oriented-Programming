package herança2;

public class Acessa_Faculdade {
	
	public static void main(String[] args) {
		Faculdade_CEETEPs ceetps = new Faculdade_CEETEPs();
		Disciplinas_CEETEPs disciplinas = new Disciplinas_CEETEPs();
		/*a variável de instância tem acesso às classes de relação de
		 * herança de hierarquia superior*/
	
		ceetps.setFatec("Fatec Baixada Santista");
		disciplinas.setDisciplinas("Análise e Desenvolvimento de Sistemas");
		System.out.println("Fatec \t" + ceetps.getFatec());
		//System.out.println("Disciplina \t" + disciplinas.getDisciplina());
	
		ceetps.setFaculdade("Administração e Desenvolvimento de Sistemas");
		System.out.println("Faculdade\t " + ceetps.getFaculdade());
		
		disciplinas.setDisciplinas("Programação Orientada a Objetos");
		System.out.println("disciplina \t" + disciplinas.getDisciplina());
	}

}
