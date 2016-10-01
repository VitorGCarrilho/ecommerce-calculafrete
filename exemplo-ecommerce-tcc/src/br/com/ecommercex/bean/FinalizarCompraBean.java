package br.com.ecommercex.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

import org.tempuri.CResultado;

import br.com.ecommercex.model.Livro;
import br.com.ecommercex.model.Produto;
import br.com.ecommercex.model.TipoServico;
import br.com.ecommercex.services.CalculaPrecoPrazoRequest;
import br.com.ecommercex.services.CalculaPrecoPrazoResponse;
import br.com.ecommercex.services.ConsumeFreteWS;

@ManagedBean
@SessionScoped
public class FinalizarCompraBean {

	private ConsumeFreteWS wsFrete;

	private String cep;
	private Produto produto;
	private TipoServico tipoServico;
	private List<TipoServico> tiposServicos;
	private String valorFrete;
	private String prazoFrete;
	private String mensgemErroFrete;
	
	
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}	

	public TipoServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public FinalizarCompraBean() {
		produto = new Livro();
		tiposServicos = getAllServicos();
	}
	
	public void calcularFrete() {
		
		CalculaPrecoPrazoRequest request = new CalculaPrecoPrazoRequest();
		request.setnCdServico(tipoServico.getCodigo());
		request.setsCepDestino(cep);
		request.setnCdFormato(1);
		request.setnVlAltura(produto.getAltura());
		request.setnVlComprimento(produto.getComprimento());
		request.setnVlDiametro(produto.getDiametro());
		request.setnVlLargura(produto.getLargura());
		request.setnVlPeso(produto.getPesoKilogramas());
		request.setnVlValorDeclarado(new BigDecimal(0));
		request.setsCdMaoPropria("");
		request.setsCdMaoPropria("");
		request.setsCdAvisoRecebiment("");
		wsFrete = new ConsumeFreteWS();
		CalculaPrecoPrazoResponse response = wsFrete.CalculaPrecoPrazo(request);
		valorFrete = response.getValor();
		prazoFrete = response.getPrazo();
		mensgemErroFrete = response.getErro();
		
		System.out.println(valorFrete);
		System.out.println(prazoFrete);
		
		//System.out.println("clicou em Calcular");
		//Thread.sleep(10000);
		//System.out.println("calculado");

	}	
	
	public String getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(String valorFrete) {
		this.valorFrete = valorFrete;
	}

	public String getPrazo() {
		return prazoFrete;
	}

	public void setPrazo(String prazo) {
		this.prazoFrete = prazo;
	}

	public boolean isLivro() {
		boolean isLivro = false;
		if (this.produto instanceof Livro) {
			isLivro = true;
		}
		return isLivro;
	}
	private List<TipoServico> getAllServicos() {
		List items = new ArrayList<TipoServico>();
		for (TipoServico g : tipoServico.values()) {
			items.add(g);
		}
		return items;
	}

	public List<TipoServico> getTiposServicos() {
		return tiposServicos;
	}

	public void setTiposServicos(List<TipoServico> tiposServicos) {
		this.tiposServicos = tiposServicos;
	}

	public String getPrazoFrete() {
		return prazoFrete;
	}

	public void setPrazoFrete(String prazoFrete) {
		this.prazoFrete = prazoFrete;
	}

	public String getMensgemErroFrete() {
		return mensgemErroFrete;
	}

	public void setMensgemErroFrete(String mensgemErroFrete) {
		this.mensgemErroFrete = mensgemErroFrete;
	}
	
	

}
