package avaInter1_marvinSouza;


import java.util.Locale;
import java.util.Scanner;

import alunoAvaInter1.Aluno;
import escolaAvaInter1.Escola;


public class AppAvaInter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner s = new Scanner(System.in);
			Locale.setDefault(Locale.US);		//double ta funcionando com (,). não sei pq.
			
			
			double mensalidade;
			double notas [] = new double [5];
			String telefone;
			String nome = null;
			
			nome = s.nextLine();

			
			do {
				if (Validacao.validaNome(nome) == false) {
				System.out.println("Nome invalido. Digite nome valido");
				nome = s.nextLine();
				}
			}while (	Validacao.validaNome(nome) == false	);
			
			System.out.println("Digite as notas");
			
			for (int i=0;i<notas.length;i++){
			notas[i] = s.nextDouble();
			}
			System.out.println("Digite a mensalidade");
			
			mensalidade = s.nextDouble();
			System.out.println("Digite a telefone");

			telefone = s.nextLine();
			s.nextLine(); 					//buffer
			

			
			String codigo = null;
			Aluno aluno1 = new Aluno (codigo , nome, telefone, notas, mensalidade);
			aluno1.geraCodigo();
			int dados;
			int op=0;
			do {
				
				System.out.println("-------------MENU-----------------");
				System.out.println("OP 1 - Dados do aluno");
				System.out.println("OP 2 - Imprimir Média do Aluno");
				System.out.println("OP 3 - Imprimir Total a Pagar");
				System.out.println("OP 4 - Alterar Dados do Aluno");
				System.out.println("OP 5 - Sair");
				System.out.println("-----------------------------------");
		
				System.out.println("Qual opção deseja?");
				op = s.nextInt();
				
				if (op == 1) {
					System.out.println(aluno1.imprimeNome());	
					//System.out.println("O codigo do aluno é "+aluno1.getCodigo());
					//System.out.println("A média do aluno é "+aluno1.calcularMedia());

				}else if (op == 2) {
					System.out.println(aluno1.calcularMedia());
				}else if (op == 3) {
					System.out.println("R$ "+Escola.calcularTotalAPagar(mensalidade));
				}else if (op == 4) {
					
			do {
					System.out.println("-------------MENU DADOS------------------");
					System.out.println("OP 1 - Alterar telefone");
					System.out.println("OP 2 - Alterar nota");
					System.out.println("OP 3 - Alterar mensalidade");
					System.out.println("OP 5 - SAIR");
					System.out.println("-----------------------------------------");
					System.out.println("Escolha o dado que deseja alterar");
					 dados = s.nextInt();
				if (dados == 1) {
					//aluno1.setTelefone(telefone);
					telefone = s.nextLine();
				}else if (dados == 2) {
					//aluno1.setNotas(notas);
					System.out.println("Use os numeros de 1 a 5 para indicar a nota a ser alterada");
					int alt = s.nextInt();
					notas[alt-1] = s.nextDouble();
				}else if (dados == 3) {
					//aluno1.setMensalidade(mensalidade);
					mensalidade = s.nextDouble();

				}
			
					
				
				}  // fim do SubMenu while
				while (dados != 5);
				}
				
				
			} //fim do menuPrincipal
			while (op != 5);
			System.out.println("Obrigado!!");
			
s.close();			
	}
}
		
	






