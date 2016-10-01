package br.com.ecommercex.services;

public class CalculaPrecoPrazoResponse {
	private String valor;
	private String prazo;
	private String erro;
	
	public CalculaPrecoPrazoResponse(){}
	public CalculaPrecoPrazoResponse(String valor, String prazo, String erro){
		this.valor = valor;
		this.prazo = prazo;
		this.erro = erro;
	}
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getPrazo() {
		return prazo;
	}
	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}
	public String getErro() {
		return erro;
	}
	public void setErro(String erro) {
		this.erro = erro;
	}
	

}
