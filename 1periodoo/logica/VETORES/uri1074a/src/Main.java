import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] A = new int[100];
		int i,k = 0;
			
		for (i = 0;i<100;i++) {
			System.out.println("Entre com 100 numeros ");
		A[i] = sc.nextInt();
		}
		for (i = 0;i<100;i++) {
			if (A[i]<=10) {
				System.out.print(A[i]+ " ; ");
				}
		}
			k = A[10];
			System.out.println(k+ " POSIÇÃO A[10]");	
sc.close();
	}
}
