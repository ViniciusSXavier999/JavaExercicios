package ExerciciosPolimorfismo;

public class Polimorfismo {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		Cavalo c2 = new Cavalo();
		Preguica p = new Preguica();
	
		System.out.println("Som Do Cachorrinho");
		c.som();
		c.correr();
		System.out.println("");
		System.out.println("Som Do Cavalo");
		c2.som();
		c2.correr();
		System.out.println("");
		System.out.println("Som Do Preguiça");
		p.som();
		p.subir();
		
		
		
		
		
		
	}

}
