package br.com.ecommercex.model;

import java.math.BigDecimal;

public class Livro extends Produto {
	private String autor;
	private String titulo;
	private String subtitulo;
	private String isbn;
	private String paginas;
	private String edicao;
	private String tipoCapa;
	private String editora;
	private int ano;
	private String assunto;
	private String idioma;
	private String codigoBarras;
	
	
	public Livro(String nome, String descricao, String desconto, String valor, String valorDesconto, String parcela,
			String imagem, BigDecimal comprimento, BigDecimal altura, BigDecimal largura, BigDecimal diametro, String peso) {
		super(nome, descricao, desconto, valor, valorDesconto, parcela, imagem, comprimento, altura, largura, diametro, peso);
		
	}
	
	//Gambiarra para já pegar o dados do livro.
	public Livro (){
		super( "Livro - Java Para Iniciantes: Crie, Compile e Execute Programas Java Rapidamente"
				, "Aprenda rapidamente os fundamentos da programação Java com Herbert Schildt, autor best-seller de publicações sobre programação. Totalmente atualizado para Java Platform, Standard Edition 7 (Java SE 7), Java para iniciantes, 5ª edição apresenta os aspectos básicos e discute as palavras-chave, a sintaxe e as estruturas que formam a base da linguagem"
				, "(desconto de 32%)"
				, "R$ 80,80"
				, "R$ 54,45"
				, "5x	de R$ 11,64	sem juros"
				, "/imagens/livro.jpg"
				, new BigDecimal(20)
				, new BigDecimal(5)
				, new BigDecimal(30)
				, new BigDecimal(32)
				, "10");
		this.autor = "Herbert Schildt";
		this.titulo = "Java Para Iniciantes";
		this.subtitulo = "Crie, Compile e Execute Programas Java Rapidamente";
		this.isbn = "9788565837835";
		this.paginas = "632";
		this.edicao = "5ª";
		this.tipoCapa = "Brochura";
		this.editora = "Bookman";
		this.ano = 2013;
		this.assunto = "Informatica-Programaçao";
		this.idioma = "Português";
		this.codigoBarras = "9788565837835";
		
	}
	

	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getSubtitulo() {
		return subtitulo;
	}


	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getPaginas() {
		return paginas;
	}


	public void setPaginas(String paginas) {
		this.paginas = paginas;
	}


	public String getEdicao() {
		return edicao;
	}


	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}


	public String getTipoCapa() {
		return tipoCapa;
	}


	public void setTipoCapa(String tipoCapa) {
		this.tipoCapa = tipoCapa;
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public String getAssunto() {
		return assunto;
	}


	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}


	public String getIdioma() {
		return idioma;
	}


	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}


	public String getCodigoBarras() {
		return codigoBarras;
	}


	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}


	

}
