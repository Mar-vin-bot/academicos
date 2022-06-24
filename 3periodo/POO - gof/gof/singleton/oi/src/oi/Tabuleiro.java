package oi;

public class Tabuleiro {
	
	static private Tabuleiro instancia;

	//Lazy instance somente será carregado quando necessário
	public static Tabuleiro getInstancia() {
		if(instancia == null){
		instancia = new Tabuleiro();
		}
		return instancia;
		}
	
		// Construtor privado! New não é permitido fora da classe
		private Tabuleiro() { 					
		
		}
		

}






	
	
	
	


