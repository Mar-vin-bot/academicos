import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i,n;
		double med,tot=0;
		
		System.out.println("Quantos numeros quer  digitar");
		n =  sc.nextInt();
		
		double [] vet = new double[n];
		
		 for (i = 0; i<n;i++) {
		 System.out.println("Digite um numero ");
		 vet[i] = sc.nextDouble();
		 tot = tot + vet[i];
		 }
		 med = tot/n;
		 	System.out.println("A media é "+(String.format("%.2f", +med)));
			System.out.println("A soma dos numeros digitados é "+tot); 
			System.out.println("Os numeros digitados foram ");
			for (i=0;i<n;i++) {
				//sc.nextLine();//----------Limpeza de buffet
				System.out.print(vet[i]+"  ");
			}
			
		 
		 
		
		sc.close();
		
	}

}
