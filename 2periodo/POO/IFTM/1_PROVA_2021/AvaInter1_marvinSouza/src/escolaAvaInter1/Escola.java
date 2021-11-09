package escolaAvaInter1;

public class Escola {

	private int codigo;
	private String nome;
	
	public Escola (String nome, int codigo) {
		this.codigo = codigo;
		this.nome = nome;
	}
public int getCodigo() {
	return codigo;
}
public String getNome() {
	return nome;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public void setNome(String nome) {
	this.nome = nome;
}


public static double calculaDesconto (double v) {
	if (v <= 400.00 ) {
		return v * 0.05;
	}else
		return v*0.10 + calculaDesconto(v/2) ;
}
public static double calcularTotalAPagar(double mensalidade) {
	
	return mensalidade - Escola.calculaDesconto(mensalidade);
}

}
