package oi;

public class main {

	public static void main(String[] args) {


		Configuracao conf = Configuracao.getInstancia();
		Configuracao conf1 = Configuracao.getInstancia();

		Configuracao c = Configuracao.getInstancia();

		conf.setNome("carlos");
		conf1.setNome("julia");

		c.setNome("mike");


		
		System.out.println(conf.getNome());
		System.out.println(conf1.getNome());

		System.out.println(c.getNome());

	}
	

	
	
	
}
