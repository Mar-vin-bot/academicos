package avaInter1_marvinSouza;

public class Validacao {
	
public static boolean validaNome (String nome) {
	String x [] = new String [nome.length()];
	x = nome.split(" ");
	if (	(x[0].length() >=3) && (x.length>=3)	) {
		return true;
	}else {
		return false;
	}
}
}
