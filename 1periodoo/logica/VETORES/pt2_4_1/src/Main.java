import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ler n numeros e mostra somente os negativos

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i,n;
		
		System.out.println("Quantos numeros quer  digitar");
		n =  sc.nextInt();
		
		int [] num = new int[n];
		
		
		for (i=0;i<n;i++) {
			System.out.println("Digite um numero");
		num[i] =  sc.nextInt();
		}
		
		System.out.println("Valores negativos ");
		for (i=0;i<n;i++) {
			if (num[i]<0) {
			System.out.print(num[i]+"   ");
		} //não é necessario 2 vetores
		
		}
		
		sc.close();
	}

}
