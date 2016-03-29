package br.com.gu.entidade;

public class Endereco {

	private Long id;
	private String logradouro;
	private String numero;
	private String complemento;
	private String cidade;
	private String uf;
	private String cep;
	private Cliente cliente;

	public Endereco() {
		super();
	}

	public Endereco(String logradouro, String numero, String complemento, String cidade, String uf, String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return ("Logradouro: " + logradouro + " Numero: " + numero + " Complemento: " + complemento + " Cidade: "
				+ cidade + " uf: " + uf + " CEP: " + cep);
	}

}
