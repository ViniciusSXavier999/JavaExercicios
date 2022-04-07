package ExerciciosPOO;

public class ModeloContaBancaria {
	
	//ATRIBUTOS -> CARACTERISTICAS
	
	public String titular;
	public double agencia;
	public double cpf;
	public double saldo;
	
	//METODO CONSTRUTOR 
	
	public ModeloContaBancaria(String titular, double agencia, double cpf, double saldo) {
		
		this.titular = titular;
		this.agencia = agencia;
		this.cpf = cpf;
		this.saldo= saldo;
	}
	
	//METODO COMPORTAMENTAL 
	
	public void sacar() {
		if(saldo>0){
			System.out.println("Você Pode Sacar a Qualquer Momento!!");
		} else if(saldo<0) {
			System.out.println("Você Não Tem Saldo!!!");
		}
	}
	
	public void console() {
		
		System.out.println("Titular Da Conta: "+this.titular);
		System.out.println("Agência: "+this.agencia);
		System.out.println("CPF: "+this.cpf);
		System.out.println("Saldo: "+this.saldo);
	}
		
}
