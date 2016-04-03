package br.com.gu.entidade;

public class ItemPedido {
	private Long id;
	private Integer quantidade;
	private Double valorUnitario;
	private Produto produto;
	private Pedido pedido;

	public ItemPedido() {
		super();
	}

	public ItemPedido(Integer quantidade, Produto produto, Pedido pedido) {
		super();
		this.quantidade = quantidade;
		this.produto = produto;
		this.pedido = pedido;
		this.valorUnitario = this.getProduto().getValorUnitario();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		valorUnitario=this.getProduto().getValorUnitario();
		this.valorUnitario = valorUnitario;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	@Override
	public String toString() {
		return (produto + " Quantidade: " + quantidade + " Valor: " + valorUnitario + "\n" );
	}
}
