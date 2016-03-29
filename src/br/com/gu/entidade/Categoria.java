package br.com.gu.entidade;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	private Long id;
	private String descricao;
	private List<Produto> produtos = new ArrayList<>();

	public Categoria() {
		super();
	}

	public Categoria(String descricao) {
		super();
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	@Override
	public String toString() {
		return (" Categoria: " + descricao);
	}

}
