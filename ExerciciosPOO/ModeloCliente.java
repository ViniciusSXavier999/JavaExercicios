package ExerciciosPOO;

public class ModeloCliente {
	
    //ATRIBUTOS -> CARACTERISTICAS 
	
	public String nome;
	public String email;
	public String telefone;
	public int idade;
	
	// METODO CONSTRUTOR 
	public ModeloCliente(String n, String email, String tel, int i) {
		
		this.nome=n;
		this.email=email;
		this.telefone=tel;
		this.idade=i;
				
	}
    
	//METODO -> COMPORTAMENTO
	
	public void maior()
	{
		
		if(idade>18) 
			System.out.println("Você está adepto ");
			
			else
			    System.out.println("Você é menor de idade!!");
		}
	public void estado() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Email: "+this.email);
		System.out.println("Telefone: "+this.telefone);
		System.out.println("Idade: "+this.idade);
	}
	}
	


