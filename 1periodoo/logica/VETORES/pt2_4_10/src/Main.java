import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n,cont=0,contF = 0;
		char m;
		double maior=0,menor=0,mediaF=0,totf = 0,pq=0;
		n = sc.nextInt();

		
		Double [] alt = new Double[n];
		char[] sexo =new char[n];
		
		// Arrays.sort(alt); //isso ordena do menor para o maior
		
		for (int i =0;i<n;i++) {
			System.out.println("Qual altura?");
			alt[i] = sc.nextDouble();
			System.out.println("Qual o sexo (m) masc e (f) fem ");
			sexo[i] = sc.next().charAt(0);
		
			if (sexo[i] == 'f') {
				totf = totf + alt[i];	
				contF++;
			}
			else {
				cont++;
			}
			pq = alt[0];
			if (alt[i]<=pq) {
				menor = alt[i];
			}
			
			else if (alt[i] > maior) {
				maior = alt[i];
			}

		}// fim do for
		
		
		
			
		mediaF = totf/contF;
		
		System.out.println("Menor "+pq+"-----"+menor);
		System.out.println("Maior "+maior);
		System.out.println("Media F "+mediaF);
		System.out.println("MASC "+cont);
		
		
sc.close();		
	}
}
		


