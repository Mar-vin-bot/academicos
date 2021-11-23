package alunoAvaInter1;

import avaInter1_marvinSouza.Auxiliar;

public class Aluno {
	
private String codigo, nome, telefone;
private double notas [] = new double [5];
private double mensalidade;

public Aluno (String codigo, String nome, String telefone, double notas[], double mensalidade) {
	this.codigo = codigo;
	this.nome = nome;
	this.telefone = telefone;
	this.notas = notas;
	this.mensalidade = mensalidade;
}

public String getCodigo() {
	return codigo;
}

public String getNome() {
	return nome;
}

public String getTelefone() {
	return telefone;
}

public double[] getNotas() {
	return notas;
}

public double getMensalidade() {
	return mensalidade;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
}

public void setNome(String nome) {
	this.nome = nome;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}
public void setNotas(double [] notas) {
	this.notas = notas;
}
public void setMensalidade(double mensalidade) {
	this.mensalidade = mensalidade;
}

public void geraCodigo() {
	codigo = "";  					//iniciar variavel
	for (int i=0; i<3; i++) {
		char temp = nome.charAt(i);
		temp = (char) (temp + 2);  // (cast). temp = temp+2;
		codigo  = codigo + temp;
	}
	codigo = codigo+nome.length();
	
}

public String imprimeNome() {
	
	String x [] = new String [nome.length()];
	x= nome.split(" ");
	String y = x[x.length-1];
	char [] last = new char[y.length()];
	
	for (int i=0; i<y.length();i++) {
		if (i<1) {
			last[0] = y.toUpperCase().charAt(0);	//para somente a pos[0] receber o upperCase
		}else {
		last[i] = y.charAt(i);
		}
	}
	String lastName = new String (last);			//New String gerada depois do vetor last
	
	
	
	return "Aluno "+nome.toUpperCase()+" - "+ lastName+" "+nome.toUpperCase().charAt(0)+"."+
			" Seu codigo é "+codigo+" Telefone: "+getTelefone()+" Mensalidade "+getMensalidade();
}

public double calcularMedia() {
	
	return Auxiliar.somaValores(notas, notas.length-1) / 5; 
}


}
