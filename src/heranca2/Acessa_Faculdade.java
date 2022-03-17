package heranca2;

public class Acessa_Faculdade {
	
	public static void main(String[] args) {
		Faculdade_CEETEPs ceetps = new Faculdade_CEETEPs();
		Disciplinas_CEETEPs disciplinas = new Disciplinas_CEETEPs();
		/*a vari�vel de inst�ncia tem acesso �s classes de rela��o de
		 * heran�a de hierarquia superior*/
	
		ceetps.setFatec("Fatec Baixada Santista");
		disciplinas.setDisciplinas("An�lise e Desenvolvimento de Sistemas");
		System.out.println("Fatec \t" + ceetps.getFatec());
		//System.out.println("Disciplina \t" + disciplinas.getDisciplina());
	
		ceetps.setFaculdade("Administra��o e Desenvolvimento de Sistemas");
		System.out.println("Faculdade\t " + ceetps.getFaculdade());
		
		disciplinas.setDisciplinas("Programa��o Orientada a Objetos");
		System.out.println("disciplina \t" + disciplinas.getDisciplina());
	}

}
