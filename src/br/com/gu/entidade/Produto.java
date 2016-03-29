package br.com.gu.entidade;

public class Produto {
	private Long id;
	private String nome;
	private String sku;
	private Double valorUnitario;
	private Integer quantidadeEstoque;
	private Categoria categoria;

	public Produto() {
		super();
	}

	public Produto(String nome, String sku, Double valorUnitario, Integer quantidadeEstoque, Categoria categoria) {
		super();
		this.nome = nome;
		this.sku = sku;
		this.valorUnitario = valorUnitario;
		this.quantidadeEstoque = quantidadeEstoque;
		this.categoria = categoria;
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

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return ("Produto: " + nome + " " + sku + " Valor unitario: " + valorUnitario /*+ " Quantidade em estoque: "
				+ quantidadeEstoque + categoria*/);
	}

}
