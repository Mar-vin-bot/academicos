import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n,tot=0,cont=0,i;
		double med =0;
		
		System.out.println("Qantos numeros quer ler ");
		n = sc.nextInt();
		
		int [] vet = new int[n];
		
		for (i = 0;i<n;i++) {
			System.out.println("Digite o numero");
			vet[i] = sc.nextInt();
			if (vet[i] % 2==0) {
				cont++;
				tot = tot+vet[i];
			}

		}
		if (tot <= 0) {
			System.out.println("Sem numero par para calculo");
		}
		else {
		med = tot/cont;
		System.out.println("media "+med);
		}
		sc.close();
	}

}
