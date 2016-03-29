package br.com.gu.entidade;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

	private Long id;
	private String nome;
	private String descricao;
	private List<Usuario> usuarios = new ArrayList<>();

	public Grupo() {
		super();
	}

	public Grupo(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public String toString() {
		return ("Grupo: " + nome + " Descricao: " + descricao + " ");
	}

}
