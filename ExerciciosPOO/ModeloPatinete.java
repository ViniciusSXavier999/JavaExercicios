package ExerciciosPOO;

public class ModeloPatinete {
	
	//ATRIBUTOS -> CARACTERISTICAS
	
	public String cor;
	public String modelo;
	public int quantRodas;
	
	//METODO CONSTRUTOR 
	
	public ModeloPatinete(String cor, String modelo, int quantRodas) {
		
		this.cor = cor;
		this.modelo = modelo;
		this.quantRodas = quantRodas;
	}
	
	//METODO -> COMPORTAMENTOS
	public void idade() {
		if(quantRodas==4) {
			System.out.println("Ideal Para Crianças Que Acabaram De Aprender a Andar ");
			}else if (quantRodas==3) {
					System.out.println("O Tipo Mais Popular Para Crianças Entre 3-5 Anos De Idade");
			}else if(quantRodas==2) {
					System.out.println("Feito Para Crianças De 5 Anos Ou Mais!");
			}
				
			}
		
	
	public void console() {
		System.out.println("Cor Do Patinete: "+this.cor);
		System.out.println("Modelo Do Patinete: "+this.modelo);
		System.out.println("Quantas Rodas: "+this.quantRodas);
		
	}

}
