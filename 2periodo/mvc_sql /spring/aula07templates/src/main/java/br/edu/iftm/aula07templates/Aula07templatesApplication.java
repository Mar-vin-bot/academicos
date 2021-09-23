package br.edu.iftm.aula07templates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Aula07templatesApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(Aula07templatesApplication.class, args);
	}

	@Autowired
	public JdbcTemplate JdbcTemplate;

	@Override
	public void run(String... args) throws Exception {

		JdbcTemplate.execute("DROP TABLE contatos IF EXISTS");
		JdbcTemplate.execute("CREATE TABLE contatos(id SERIAL, nome VARCHAR(255), telefone VARCHAR(255) )");
		JdbcTemplate.update("INSERT INTO contatos(nome,telefone) VALUES (?,?)", "Marvin", "3321");
		JdbcTemplate.update("INSERT INTO contatos(nome,telefone) VALUES (?,?)", "Julia Maria", "8996");
		JdbcTemplate.update("INSERT INTO contatos(nome,telefone) VALUES (?,?)", "Daniela dos santos", "3009");

		List<Contato> contatos = JdbcTemplate.query("SELECT id, nome, telefone FROM contatos", (rs, rowNum) -> {
			return new Contato(rs.getString("telefone"), rs.getString("nome"), rs.getLong("id"));});

			
			System.out.println("Listando contatos");
			for (Contato contato : contatos) {
				System.out.println(contato.getNome() + " - " + contato.getTelefone());
			}

			int rowCount = this.JdbcTemplate.queryForObject("select count(*) from contatos", Integer.class); 		/* linhas que pede a impressão do numero de linhas da tabela variavel rowCont de tipo int*/

			System.out.println("Numero de linhas da agenda contatos");
			System.out.println(rowCount); 
			/*impressão da linha solicitado anteriormente como rowCont*/

			/*String telefone = this.JdbcTemplate.queryForObject("select telefone from contatos where nome = ?", String.class, "Julia Maria");
			solicitação de pesquisa por String Marvin na linha abeixo será impresso o nome correspondente a essa String*/

		/*System.out.println("Imprimir o telefone de marvin");*/
		/*System.out.println(telefone);*/

		String nome = this.JdbcTemplate.queryForObject("select nome from contatos where nome = ?", String.class, "Edson Angoti"); 
		/*aqui é inserido o nome do contato a ser buscado no banco de dados acondicionado na var nome*/

		String telefone = this.JdbcTemplate.queryForObject("select telefone from contatos where nome = ?", String.class, nome);
			/* aqui é feita a solicitacao do telefone de acordo com a var nome e num telefone e enviado para var telefone*/
			
		System.out.println("Resultado da consulta: "+nome+", "+telefone);
	}

}
