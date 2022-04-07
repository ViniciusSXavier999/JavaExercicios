package ExerciciosPOO;

public class ModeloProdutoEletronico {
	
	//ATRIBUTO -> CARACTERISTICAS
	
	public int quantArmazenamento;
	public int ram;
	public String tela;
	public String marca;
	
	//METODO CONSTRUTOR 
	
	public ModeloProdutoEletronico(int q, int r, String t, String m) {
		
		this.quantArmazenamento=q;
		this.ram=r;
		this.tela=t;
		this.marca=m;	
	}
	
	//METODO -> COMPORTAMENTO 
	
	public void armazenamento() {
		if(quantArmazenamento>=200) 
			System.out.println("Excelente Armazenamento!!"+" Otima Escolha!! ");
		
		else
			System.out.println("É recomendado um Upgrade de Armazenamento!! ");
		
	}
	
	public void exibir() {
		System.out.println("Quantidade De Armazenamento: "+this.quantArmazenamento);
		System.out.println("Quantidade De Memoria Ram Do Seu Dispositivo: "+this.ram);
		System.out.println("Resolução De Tela: "+this.tela);
		System.out.println("Marca Do Produto: "+this.marca);
		
	}
	

}
