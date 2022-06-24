package oi;

public class Configuracao {

	private static Configuracao instancia;
	private String nome;
	
	
	public static Configuracao getInstancia() {
	if(instancia == null)
	instancia = new Configuracao();
	return instancia;
	}
	// Construtor privado!
	private Configuracao() { 					
	//lê as configurações
	}
	



	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}




	
	
	
	
}
