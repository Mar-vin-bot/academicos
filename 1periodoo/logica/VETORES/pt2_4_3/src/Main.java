import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i,n,k = 0;
		double r,maior=0;
		
		System.out.println("Quantos numeros quer  digitar");
		n =  sc.nextInt();
		
		double [] vet = new double[n];
		//int [] k = new int[1];
		
		for(i=0;i<n;i++) {
			System.out.println("Digite um numero ");
			vet[i] = sc.nextDouble();	
			if (vet[i] > maior) {
			maior = vet[i];
			k  = i;
			}
			
		}
			System.out.println("O maior numero é "+ maior);
			System.out.println("A posiçao do maior numero digitado " +k);
			sc.close();
		}
	}

