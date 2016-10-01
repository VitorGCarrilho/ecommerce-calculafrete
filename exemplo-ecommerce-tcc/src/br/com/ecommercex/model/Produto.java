package br.com.ecommercex.model;

import java.math.BigDecimal;

public abstract class Produto {
	private String nome;
	private String descricao;
	private String desconto;
	private String valor;
	private String valorDesconto;
	private String parcela;
	private String imagem;
	private BigDecimal comprimento;
	private BigDecimal altura;
	private BigDecimal largura;
	private BigDecimal diametro;
	private String pesoKilogramas;
	
	public Produto(
			String nome,
			String descricao,
			String desconto,
			String valor,
			String valorDesconto,
			String parcela,
			String imagem,
			BigDecimal comprimento,
			BigDecimal altura,
			BigDecimal largura,
			BigDecimal diametro,
			String peso
			){
		this.nome = nome ;
		this.descricao = descricao ;
		this.desconto = desconto ;
		this.valor = valor ;
		this.valorDesconto = valorDesconto ;
		this.parcela = parcela ;
		this.imagem = imagem ;
		this.comprimento = comprimento ;
		this.largura = largura ;
		this.altura = altura ;
		this.diametro = diametro ;
		this.pesoKilogramas = peso;
	}
	
	
	
	public String getPesoKilogramas() {
		return pesoKilogramas;
	}



	public void setPesoKilogramas(String pesoKilogramas) {
		this.pesoKilogramas = pesoKilogramas;
	}



	public BigDecimal getComprimento() {
		return comprimento;
	}


	public void setComprimento(BigDecimal comprimento) {
		this.comprimento = comprimento;
	}


	public BigDecimal getAltura() {
		return altura;
	}


	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}


	public BigDecimal getLargura() {
		return largura;
	}


	public void setLargura(BigDecimal largura) {
		this.largura = largura;
	}


	public BigDecimal getDiametro() {
		return diametro;
	}


	public void setDiametro(BigDecimal diametro) {
		this.diametro = diametro;
	}


	public String getImagem() {
		return imagem;
	}


	public void setImagem(String imagem) {
		this.imagem = imagem;
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
	public String getDesconto() {
		return desconto;
	}
	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getValorDesconto() {
		return valorDesconto;
	}
	public void setValorDesconto(String valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	public String getParcela() {
		return parcela;
	}
	public void setParcela(String parcela) {
		this.parcela = parcela;
	}
}
