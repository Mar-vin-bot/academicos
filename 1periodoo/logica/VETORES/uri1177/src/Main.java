import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n,k=0,i;
		
		int[] t =new int[1000];
		 System.out.println("digite um numero ");
		 n = sc.nextInt();
		 
		 for (i = 0;i<n;i++) {
			 if (k>999) break;
			 t[k]  = i;
					 i++;
		 }
		
	        for ( i = 0; i < 999; i++) {
	        	System.out.println("N[" + i + "] = " + t[i]);
	        }
		sc.close();
	}

}
