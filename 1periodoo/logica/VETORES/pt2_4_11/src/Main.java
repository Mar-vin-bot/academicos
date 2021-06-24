import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double tcompra = 0,tvenda = 0;
		int cont10 = 0,cont20 = 0,cont21 = 0;
		
		System.out.println("Quantos produtos quer digitar ");
		int n = sc.nextInt();
		
		String[] prod = new String[n];
		Double [] compra = new Double [n];
		Double [] venda  = new Double [n];
		Double [] p100  = new Double [n];

		
		for (int i = 0; i<n; i++) {
			sc.nextLine();//--------limpeza de buffer
			System.out.println("Qual produto");
			prod[i] = sc.nextLine();
			System.out.println("Valor de compra "+prod[i]);
			compra [i] = sc.nextDouble();
			System.out.println("Preço de venda "+prod[i]);
			venda[i] = sc.nextDouble();
			p100[i] = (venda [i] / compra [i]-1)*100;
			tcompra = tcompra + compra[i];
			tvenda = tvenda + venda[i];
		}
		for (int i = 0; i<n; i++) {
			if (p100[i]<10){
				cont10++;
			}
			else if (p100[i]>=10 && p100[i]<=20) {
				cont20++;
			}
			else if (p100[i]>20) {
				cont21++;
			}
			
		}//fim do for
		
		System.out.println("\n Resultado\n");
		System.out.println("Lucro até 10%:         "+cont10);
		System.out.println("Entre 10% e 20%:       "+cont20);
		System.out.println("Acima de 20%:          "+cont21);
		System.out.println("Total das compras foi: "+tcompra);
		System.out.println("Total de vendas foi:   "+tvenda);
		
		
		sc.close();
	}

}
