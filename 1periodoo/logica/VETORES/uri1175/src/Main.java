import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[20];
		int inv;
		for (int i = 0;i<20;i++) {
			System.out.println("Entre com os numeros ");
			n[i] = sc.nextInt();
			}
		for (int i = 0; i<(20/2) ;i++) {
			inv = n[i];
			n[i] = n[20-1 -i];
			n[20 -1 -i] = inv;
		}
		for (int i=0;i<20;i++) {
            System.out.println("N["+ i +"] = " + n[i]);

		}
		
        /*int aux;
        int[] N = new int[20];
        for (int i=0; i < N.length; i++) {
            N[i] = sc.nextInt();
        }
        for (int i=0; i < (N.length / 2); i++) {
        	aux = N[i];
        	N[i] = N[N.length - 1- i];
        	N[N.length - 1 -i] = aux;
        }
        for (int i=0; i < N.length; i++) {
            System.out.println("N["+ i +"] = " + N[i]);
        }*/
		
		
		sc.close();
	}

}
