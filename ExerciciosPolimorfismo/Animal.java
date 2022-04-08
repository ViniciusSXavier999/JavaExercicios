package ExerciciosPolimorfismo;

public abstract class Animal {
	
	private String nome;
	private int idade;
	
	public void som() {
		
		System.out.println("Som Caracteristico...");
		
	}
	
	public void correr() {
		
		System.out.println("Correeeeeeeeeeeeeeeee");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}
