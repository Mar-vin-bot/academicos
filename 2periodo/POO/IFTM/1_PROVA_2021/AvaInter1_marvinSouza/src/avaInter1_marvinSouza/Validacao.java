package avaInter1_marvinSouza;

public class Validacao {
	
public static boolean validaNome (String nome) {
	/* joga a var nome.split(" ") dentro de um vetor chamado x. depois faz a validaçao com if.
	 * nome = Marvin de souza silva // 
	 * (vetor)String x[] = Marvin,de,souza,silva
	 */
	String x [] = nome.split(" ");
	if (	x[0].length() >=3 && x.length>=3	) {
		return true;
	}else {
		return false;
	}
}

}
