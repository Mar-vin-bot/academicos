import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*int i,n,cont =0;
		
		System.out.println("Quantos numeros quer  digitar");
		n =  sc.nextInt();
		
		int [] num = new int[n];
		int [] vet = new int[n];
		
		for(i=0;i<n;i++) {
			System.out.println("Digite os numeros");
			num[i] = sc.nextInt();
			if (num[i] % 2 == 0) {
				cont++;
			vet[i] = num[i];
			}
		}
		System.out.println("total de par é "+cont);
		for(i=0;i<n;i++) {
		System.out.print(vet[i]+" - ");
		}*/
		
		int n,x,cont=0,i;
		
		
		System.out.println("QUANTOS numeros quer digitar");
		n = sc.nextInt();
		
		int [] num = new int[n];
		//int [] x = new int[n];
		
		for (i = 0;i<n;i++) {
			System.out.println("Entre com os numeros ");
			num[i] = sc.nextInt();

				//num[i] = x;
		}
	System.out.println("\n Resultado \n");
		for (i = 0;i<n;i++) {
			if (num[i]%2 ==0) {
				cont++;
		System.out.println(num[i]+" - ");
		}
		}
		System.out.println("total "+ cont+ "");
		sc.close();
		
	}

}
