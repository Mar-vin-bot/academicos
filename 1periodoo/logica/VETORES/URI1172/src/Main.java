import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int [] num = new int[10];
	
		
		for (int i=0;i<10;i++) {
			System.out.println("Digite 10 numeros inteiros");
			num[i] = sc.nextInt();
			if (num[i] <= 0) {
				num[i] = 1;

			}
			}
		

		for (int i=0;i<10;i++) {

			System.out.print(num[i]+" - ");
		}
		
		
		sc.close();
	}

}
