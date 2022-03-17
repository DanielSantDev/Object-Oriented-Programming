package subtipagem;

public class Define_Mamifero {
	
	Mamifero m = null;
	String animal;
	
public Mamifero tipo_mamifero(String animal) {

	this.animal = animal;
	
	if(animal == "cachorro")
		return m = new Mamifero();
	
	else if(animal == "puma")
		return m = new Mamifero_America();
	
	else return null;
	
}

	int g = 0;

public void verifica_instancia(Mamifero f) {
	
	g = g + 1;
	
	if(f instanceof Mamifero)
		System.out.println("animal: cachorro " + g + "� itera��o");
	
	if(f instanceof Mamifero_America)
		System.out.println("animal: puma " + g + "� itera��o");
	
	if(f instanceof Mamifero_America_Sul)
		System.out.println("animal: on�a " + g + "� itera��o");
	
}

	public Mamifero tipo_Mamifero(String cachorro) {

	}
}


