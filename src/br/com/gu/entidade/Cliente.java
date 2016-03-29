package br.com.gu.entidade;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private Long id;
	private String nome;
	private String email;
	private String documentoReceitaFederal;
	private TipoPessoa tipo;
	private List<Endereco> enderecos = new ArrayList<>();

	public Cliente() {
		super();
	}

	public Cliente(String nome, String email, String documentoReceitaFederal, TipoPessoa tipo) {
		super();
		this.nome = nome;
		this.email = email;
		this.documentoReceitaFederal = documentoReceitaFederal;
		this.tipo = tipo;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDocumentoReceitaFederal() {
		return documentoReceitaFederal;
	}

	public void setDocumentoReceitaFederal(String documentoReceitaFederal) {
		this.documentoReceitaFederal = documentoReceitaFederal;
	}

	public TipoPessoa getTipo() {
		return tipo;
	}

	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
	@Override
	public String toString() {
		return ("Pessoa " + tipo + ", " + nome + " Numero de registro: " + documentoReceitaFederal + " Email: " + email);
	}

}
