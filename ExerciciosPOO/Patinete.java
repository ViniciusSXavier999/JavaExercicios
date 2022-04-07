package ExerciciosPOO;

public class Patinete {

	public static void main(String[] args) {
		ModeloPatinete p = new ModeloPatinete("Preto", "Infantil", 3);
		ModeloPatinete p2 = new ModeloPatinete("Azul", "Infantil", 2);
		
		p.console();
		p.idade();
		System.out.println("\n");
		p2.console();
		p2.idade();

	}

}
