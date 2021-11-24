package com.lauracristina.redballoon.model;

public class Aluno {

	private Integer id;
	private String nome;
	private String dataNascimento;
	private String anoEscola;
	private String escola;

	public Aluno() {
		super();
	}

	public Aluno(Integer id, String nome, String dataNascimento, String anoEscola, String escola) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.anoEscola = anoEscola;
		this.escola = escola;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getAnoEscola() {
		return anoEscola;
	}

	public void setAnoEscola(String anoEscola) {
		this.anoEscola = anoEscola;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
