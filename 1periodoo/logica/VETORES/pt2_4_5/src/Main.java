import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n,i=0, cont = 0;
		
		/*System.out.println("Quantos numeros quer digirar");
		n = sc.nextInt();
		
		int [] veta = new int[n];
		int [] vetb = new int[n];
		int [] soma = new int[n];
		
		
		for (i=0;i<n;i++) {
		System.out.println("Entre com a primeira parte");
		veta[i] = sc.nextInt();
		System.out.println("Entra com a segunda parte");
		vetb[i] = sc.nextInt();
		soma[i] = veta[i] + vetb[i];
		}
		
		for (i=0;i<n;i++) {
		System.out.print(soma[i]+" - ");	
		}*/
		
		System.out.println("Quantos numeros quer digirar");
		n = sc.nextInt();
		
		int [] veta = new int[n];
		int [] vetb = new int[n];
		int [] soma = new int[n];
		
		for (i=0;i<n;i++) {
			System.out.println("Entre com a primeira parte");
			veta[i] = sc.nextInt();
		}
		for (i=0;i<n;i++) {
			System.out.println("Entre com a segunda parte");
			vetb[i] = sc.nextInt();
		}
		for (i=0;i<n;i++) {
		soma[i] = veta[i]+ vetb[i];
		cont++;

		}
		for (i=0;i<n;i++) {
			System.out.print(soma[i]+" -  ");
		}
		
		
		
		
		
		sc.close();
	}

}
