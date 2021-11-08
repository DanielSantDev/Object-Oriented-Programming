package subtipagem;

public class Define_Mamífero {
	
	Mamífero m = null;
	String animal;
	
public Mamífero tipo_mamífero(String animal) {

	this.animal = animal;
	
	if(animal == "cachorro")
		return m = new Mamífero();
	
	else if(animal == "puma")
		return m = new Mamifero_America();
	
	else return null;
	
}

	int g = 0;

public void verifica_instância(Mamífero f) {
	
	g = g + 1;
	
	if(f instanceof Mamífero)
		System.out.println("animal: cachorro " + g + "ª iteração");
	
	if(f instanceof Mamifero_America)
		System.out.println("animal: puma " + g + "ª iteração");
	
	if(f instanceof Mamífero_America_Sul)
		System.out.println("animal: onça " + g + "ª iteração");
	
}
	
}


