package ExerciciosPOO;

public class ModeloPaciente {
	
	//ATRIBUTO = CARACTERISTICAS
	
	public String nome;
	public double peso;
	public double altura;
	public int idade;
	public boolean cadastro=true;
	
	//METODO CONSTRUTOR
	
	public ModeloPaciente(String nome, double peso, double altura, int idade) {
		
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
		this.cadastro=true;
	}
	
	//METODO COMPORTAMENTAL 
	
	public void sistema() {
		if(cadastro==true) {
			System.out.println("Paciente Ativo No Sistema!!");
		}else {
			System.out.println("Paciente Não Encontrado No Sistema!!");
			
		}
	}
	
	public void console() {
		
		System.out.println("Nome: "+this.nome);
		System.out.println("Peso: "+this.peso+"kg");
		System.out.println("Altura: "+this.altura);
		System.out.println("Idade: "+this.idade);
		
	}
	
	
	
	
	
	
		
		
		
	}
	
	
	
	
	
	


