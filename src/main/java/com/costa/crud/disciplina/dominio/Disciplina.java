package com.costa.crud.disciplina.dominio;

public class Disciplina {
	private String professor, nome, codigo_sala_classroom;
	private int periodo, id;
	
	public Disciplina(int id, String nome, String professor, int periodo, String codigo_sala_classroom) {
		super();
		this.professor = professor;
		this.nome = nome;
		this.codigo_sala_classroom = codigo_sala_classroom;
		this.periodo = periodo;
		this.id = id;
	}
	
	public Disciplina() {
		super();
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo_sala_classroom() {
		return codigo_sala_classroom;
	}

	public void setCodigo_sala_classroom(String codigo_sala_classroom) {
		this.codigo_sala_classroom = codigo_sala_classroom;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}