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
	char[] saida = new char[4];       
    char[] cod = new char[nome.length()];
    
    for (int i=0;i<3; i++){
        cod[i] = nome.charAt(i);
        saida[i] = (char) (cod[i] + 2);             
    }
    
    String pt1 = new String (saida);                 			  //3 primeiras letras
    String pt2 = new String (String.valueOf(nome.length()));     //length do nome, passado para string
    this.codigo = pt1+pt2;
    //System.out.println(codigo);
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
	
	
	
	return "Aluno "+nome.toUpperCase()+" - "+ lastName+" "+nome.toUpperCase().charAt(0)+".";
}

public double calcularMedia() {
	
	return Auxiliar.somaValores(notas, notas.length-1) / 5; 
}


}
