package subtipagem;

public class Define_Mam�fero {
	
	Mam�fero m = null;
	String animal;
	
public Mam�fero tipo_mam�fero(String animal) {

	this.animal = animal;
	
	if(animal == "cachorro")
		return m = new Mam�fero();
	
	else if(animal == "puma")
		return m = new Mamifero_America();
	
	else return null;
	
}

	int g = 0;

public void verifica_inst�ncia(Mam�fero f) {
	
	g = g + 1;
	
	if(f instanceof Mam�fero)
		System.out.println("animal: cachorro " + g + "� itera��o");
	
	if(f instanceof Mamifero_America)
		System.out.println("animal: puma " + g + "� itera��o");
	
	if(f instanceof Mam�fero_America_Sul)
		System.out.println("animal: on�a " + g + "� itera��o");
	
}
	
}


