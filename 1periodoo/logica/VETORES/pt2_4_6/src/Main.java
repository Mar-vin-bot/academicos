import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n,i;
		double med,tot=0;
		
		System.out.println("Quantos numeros quer digitar ");
		n = sc.nextInt();
		
		double [] vet = new double[n];
		
		
		for (i = 0;i<n;i++) {
			System.out.println("Entre com os numeros ");
			vet[i] = sc.nextDouble();
			tot = tot + vet[i];
		}
		
		med = tot/n;
		System.out.println("A media é "+med);
		
		double [] saida = new double [n];
		
		for (i = 0;i<n;i++) {
			if (vet[i]<med) {
				saida[i] = vet[i];
				System.out.print(saida[i]+" - ");
			}
		}
		
		sc.close();
	}

}
