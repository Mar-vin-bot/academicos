import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 
		int n,i,min=6;

		
		System.out.println("Quantos alunos");
		n = sc.nextInt();
		
		String [] nome= new String[n];
		Double[] nota1 = new Double[n];
		Double [] nota2 = new Double[n];
		Double [] med = new Double[n];

		
		for(i=0;i<n;i++) {
			sc.nextLine();//----------Limpeza de buffet
			System.out.println("Qual o nome do aluno");
			nome[i] = sc.nextLine();
			System.out.println("Primeira nota do "+nome[i]);
			nota1[i] = sc.nextDouble();
			System.out.println("Digite a segunda nota do "+nome[i]);
			nota2[i] = sc.nextDouble();
			med[i] = (nota1[i] + nota2[i])/2;
			
			}	
		
		System.out.println("\nAlunos Aprovados\n");
		for (i=0;i<n;i++) {
				if (med[i]>min) {
				System.out.print(nome[i]+", ");
		}
		}
		sc.close();
		
	}

}
