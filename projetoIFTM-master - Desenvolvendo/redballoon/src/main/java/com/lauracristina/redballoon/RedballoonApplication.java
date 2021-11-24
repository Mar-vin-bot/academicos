package com.lauracristina.redballoon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class RedballoonApplication implements CommandLineRunner {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(RedballoonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		jdbcTemplate.execute("CREATE TABLE aluno(id SERIAL, nome VARCHAR(255), dataNascimento VARCHAR(255), anoEscola VARCHAR(255), escola VARCHAR(255), PRIMARY KEY (id))");

		jdbcTemplate.update("INSERT INTO aluno(nome) VALUES (?)", "Marcos Paulo");
		/*
		jdbcTemplate.update("INSERT INTO aluno(nome) VALUES (?)", "Laura Cristina");
		jdbcTemplate.update("INSERT INTO aluno(nome) VALUES (?)", "Latifa");
		jdbcTemplate.update("INSERT INTO aluno(nome) VALUES (?)", "Scott");
		jdbcTemplate.update("INSERT INTO aluno(nome) VALUES (?)", "Ágata");
		*/
	}

}
