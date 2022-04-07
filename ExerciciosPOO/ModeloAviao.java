package ExerciciosPOO;

public class ModeloAviao {
	
	//ATRIBUTOS -> CARACTERISTICAS
	
	public String compAerea;
	public String cor;
	public int quantTurbina;
	
	// METODO CONSTRUTOR 
	
	public ModeloAviao(String c, String u, int q) {
		
		this.compAerea=c;
		this.cor=u;
		this.quantTurbina=q;	
	}
	
	//METODO -> COMPORTAMENTAIS
	
	public void decolando() {
		
		System.out.println("Estamos Prestes a Decolar");
	}
	
	public void pousar() {
		
		System.out.println("Estamos Prestes a Efetuar Um Pouso De Emergência... Calculando Rota De Pouso ");
		
	}
	public void estado() {
		
		System.out.println("Informe a Companhia Aérea: "+this.compAerea);
		System.out.println("Informe a cor da Aéronave: "+this.cor);
		System.out.println("Quantidade de turbinas: "+this.quantTurbina);
		
	}

}
