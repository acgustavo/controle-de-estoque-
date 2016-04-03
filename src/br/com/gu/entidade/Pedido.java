package br.com.gu.entidade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	private Long id;
	private Date dataCriacao;
	private String observacao;
	private Date dataEntrega;
	private Double valorFrete;
	private Double valorDesconto;
	private double valorTotal = new Double (0);
	private StatusPedido status;
	private Usuario vendedor;
	private Cliente cliente;
	private Endereco enderecoEntrega;
	private List<ItemPedido> itens = new ArrayList<>();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Pedido() {
		super();
	}

	public Pedido(Date dataCriacao, String observacao, int dataEntrega, Double valorFrete,
			Double valorDesconto, StatusPedido status, Usuario vendedor, Cliente cliente,
			Endereco enderecoEntrega) {
		super();
		this.dataCriacao = dataCriacao;
		this.observacao = observacao;
		setDataEntrega(dataEntrega);
		this.valorFrete = valorFrete;
		this.valorDesconto = valorDesconto;
		this.status = status;
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.enderecoEntrega = enderecoEntrega;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDataCriacao() {
		return sdf.format(dataCriacao);
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getDataEntrega() {
		return sdf.format(dataEntrega);
	}

	@SuppressWarnings("deprecation")
	public void setDataEntrega(int dataEntrega) {
		Date dE = new Date();
		dE.setDate(dE.getDate() + dataEntrega);
		this.dataEntrega = dE;
	}

	public Double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(Double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public Double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(Double valorDesconto) {
		
		this.valorDesconto = this.valorTotal-valorDesconto;
	}

	public Double getValorTotal() {
		valorTotal = 0;
		for (ItemPedido i: this.getItens())
			valorTotal += (i.getProduto().getValorUnitario()*i.getQuantidade());
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Usuario getVendedor() {
		return vendedor;
	}

	public void setVendedor(Usuario vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

}
