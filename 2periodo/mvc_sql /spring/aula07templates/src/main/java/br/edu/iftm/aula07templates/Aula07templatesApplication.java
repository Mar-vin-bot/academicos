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
	}

}
