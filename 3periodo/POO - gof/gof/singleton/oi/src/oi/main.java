package oi;

public class main {

	public static void main(String[] args) {
		
		Tabuleiro jogo = Tabuleiro.getInstancia();
		
		
		Tabuleiro jogo1 = Tabuleiro.getInstancia();

		//Tabuleiro jogo7 = new Tabuleiro();	//não é possivel usar o new

		System.out.println("Objetos iguais: "+(jogo == jogo1));
		System.out.println("Mesmo endereço de memoria");
		System.out.println(jogo1);
		System.out.println(jogo);

	}
	

	
	
	
}
