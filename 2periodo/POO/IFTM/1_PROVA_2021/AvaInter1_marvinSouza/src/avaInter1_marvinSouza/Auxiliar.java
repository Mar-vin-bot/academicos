package avaInter1_marvinSouza;
						//soma dos valores das notas

public class Auxiliar {
	public static double somaValores (double valores [], int pos) {
		 if (pos == 0)   {
             return valores [pos];
         }else {
             return valores [pos] +somaValores(valores, pos-1);
         }
	}
}
