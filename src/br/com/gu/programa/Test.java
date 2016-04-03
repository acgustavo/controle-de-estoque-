package br.com.gu.programa;

import java.util.Date;

import br.com.gu.entidade.Categoria;
import br.com.gu.entidade.Cliente;
import br.com.gu.entidade.Endereco;
import br.com.gu.entidade.Grupo;
import br.com.gu.entidade.ItemPedido;
import br.com.gu.entidade.Pedido;
import br.com.gu.entidade.Produto;
import br.com.gu.entidade.StatusPedido;
import br.com.gu.entidade.TipoPessoa;
import br.com.gu.entidade.Usuario;

public class Test {
	public static void main(String[] args) {

		//cadastro de vendedor e grupo
		Grupo vendas = new Grupo("vendas", "vendas produtos");
		Usuario gustavo = new Usuario("Gustavo", "dj_gustavo_@hotmail.com", "12345678");
		vendas.getUsuarios().add(gustavo);
		gustavo.getGrupos().add(vendas);

		//cadastro de produtos
		Categoria duraveis = new Categoria("Duraveis");
		Produto tv = new Produto("TV", "XXXXXXXXXX", 979.99, 50, duraveis);
		duraveis.getProdutos().add(tv);
		Produto dvd = new Produto("DVD", "XXXXXXXX", 109.99, 20, duraveis);
		duraveis.getProdutos().add(dvd);
		Produto celular = new Produto("celular", "XXXXXXXXX", 2009.99, 30, duraveis);
		duraveis.getProdutos().add(celular);
		
		//cadastro de endereco
		Endereco rua = new Endereco("logRADourO", "60", "COMpleMENto", "vitoria da conquista", "BA", "45000.000");
		
		
		//cadastro de cliente 
		Cliente loja = new Cliente("loja", "loja@loja.com", "XXXXXXXXXX/XXXX", TipoPessoa.Juridica);
		loja.getEnderecos().add(rua);
		rua.setCliente(loja);
		
		Pedido p1 = new Pedido(new Date(), "obs", 15, 100.00, 50.00, StatusPedido.EMITIDO, gustavo , loja, rua);
		
		
		ItemPedido ip1 = new ItemPedido(10, tv, p1);
		p1.getItens().add(ip1);
		ItemPedido ip2 = new ItemPedido(5, dvd, p1);
		p1.getItens().add(ip2);
		ItemPedido ip3 = new ItemPedido(15, celular, p1);
		p1.getItens().add(ip3);
		
		System.out.println(loja.getEnderecos());
		System.out.printf("\n\n");
		System.out.println(loja);
		System.out.printf("\n\n");
		System.out.println(p1.getItens());
		System.out.printf("\n\n");
		System.out.println(p1.getValorTotal());
		
	}
}
