import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n,j,velho=0;
		String pessoa = null;
		
		
		System.out.println("Quantos pessoas quer digitar");
		n = sc.nextInt();
		
		String[] nome = new String [n];
		int [] idade = new int[n];
		
		
		for (int i=0; i<n; i++) {
			sc.nextLine();//----------Limpeza de buffet
            System.out.println ("Insira o nome da pessoa: ");
            nome[i] = sc.nextLine();
            System.out.println ("Insira a idade do(a) " +nome[i]);
            idade[i] = sc.nextInt();
            if (idade[i]> velho) {
				velho=idade[i];
				pessoa=nome[i];
			}
     }

System.out.println ("Maior idade: "+velho );
System.out.println ("Nome: " +pessoa );

		sc.close();
	}

}
