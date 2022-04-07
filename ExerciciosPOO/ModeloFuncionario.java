package ExerciciosPOO;

public class ModeloFuncionario {
	
	//ATRIBUTOS -> CARACTERISTICAS 
	
	public String cargo;
	public String funcao;
	public int horasTrab;
	public int diasTrab;
	public boolean funcativo;
	
	//METODO CONSTRUTOR
	
	public ModeloFuncionario(String cargo, String funcao, int horasTrab, int diasTrab) {
		
		this.cargo = cargo;
		this.funcao = funcao;
		this.horasTrab = horasTrab;
		this.diasTrab = diasTrab;
		this.funcativo=true;
		
		}
	
	//METODO -> COMPORTAMENTAL 
	
	public void escrever() {
		if(funcativo==true)
			System.out.println("Funcion�rio Ativo No Sistema");
		
		else
			System.out.println("Funcion�rio N�o Encontrado No Sistema!!");
		
	} 
	public void ativar(){
		
		this.funcativo=true;

	}
	 public void desativado() {
		 
		this.funcativo=false;
	 }
	public void console() {
		
		System.out.println("Cargo: "+this.cargo);
		System.out.println("Fun��o: "+this.funcao);
		System.out.println("Horas trabalhadas por dia: "+this.horasTrab);
		System.out.println("Dias Trabalhados Por Semana: "+this.diasTrab);
		System.out.println("O Funcion�rio Est� Ativo? "+this.funcativo);
	}
	
	
	
	
	

}
