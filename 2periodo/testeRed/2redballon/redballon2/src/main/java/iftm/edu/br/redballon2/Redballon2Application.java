package iftm.edu.br.redballon2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Redballon2Application implements CommandLineRunner {

	@Autowired
	JdbcTemplate jdbc;

	public static void main(String[] args) {
		SpringApplication.run(Redballon2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		jdbc.execute("CREATE TABLE tableAlunos(nome VARCHAR(255),id SERIAL, PRIMARY KEY (id))");
		jdbc.update("INSERT INTO tableAlunos(nome) VALUES (?)", "Edson Angoti Júnior", "1");
		jdbc.update("INSERT INTO tableAlunos(nome) VALUES (?)", "Clarimundo Machado", "2");
		jdbc.update("INSERT INTO tableAlunos(nome) VALUES (?)", "Rodrigo Cavanha", "3");
		jdbc.update("INSERT INTO tableAlunos(nome) VALUES (?)", "Bruno Queiroz", "4");

	}

}
