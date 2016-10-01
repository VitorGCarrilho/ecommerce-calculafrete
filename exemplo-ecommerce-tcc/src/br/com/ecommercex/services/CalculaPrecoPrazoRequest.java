package br.com.ecommercex.services;

import java.math.BigDecimal;

public class CalculaPrecoPrazoRequest {
	private String nCdEmpresa;
	private String sDsSenha;
	private String nCdServico;
	private String sCepOrigem = "82220000"; //cep curitiba
	private String sCepDestino;
	private String nVlPeso;
	private int nCdFormato;
	private BigDecimal nVlComprimento;
	private BigDecimal nVlAltura;
	private BigDecimal nVlLargura;
	private BigDecimal nVlDiametro;
	private String sCdMaoPropria;
	private BigDecimal nVlValorDeclarado;
	private String sCdAvisoRecebiment;
	
	public CalculaPrecoPrazoRequest(){
		this.nCdEmpresa = "";
		this.sDsSenha = "";
		this.sCepOrigem = "82220000";
	}
	
	public String getnCdEmpresa() {
		return nCdEmpresa;
	}
	public void setnCdEmpresa(String nCdEmpresa) {
		this.nCdEmpresa = nCdEmpresa;
	}
	public String getsDsSenha() {
		return sDsSenha;
	}
	public void setsDsSenha(String sDsSenha) {
		this.sDsSenha = sDsSenha;
	}
	public String getnCdServico() {
		return nCdServico;
	}
	public void setnCdServico(String nCdServico) {
		this.nCdServico = nCdServico;
	}
	public String getsCepOrigem() {
		return sCepOrigem;
	}
	public void setsCepOrigem(String sCepOrigem) {
		this.sCepOrigem = sCepOrigem;
	}
	public String getsCepDestino() {
		return sCepDestino;
	}
	public void setsCepDestino(String sCepDestino) {
		this.sCepDestino = sCepDestino;
	}
	public String getnVlPeso() {
		return nVlPeso;
	}
	public void setnVlPeso(String nVlPeso) {
		this.nVlPeso = nVlPeso;
	}
	public int getnCdFormato() {
		return nCdFormato;
	}
	public void setnCdFormato(int nCdFormato) {
		this.nCdFormato = nCdFormato;
	}
	public BigDecimal getnVlComprimento() {
		return nVlComprimento;
	}
	public void setnVlComprimento(BigDecimal nVlComprimento) {
		this.nVlComprimento = nVlComprimento;
	}
	public BigDecimal getnVlAltura() {
		return nVlAltura;
	}
	public void setnVlAltura(BigDecimal nVlAltura) {
		this.nVlAltura = nVlAltura;
	}
	public BigDecimal getnVlLargura() {
		return nVlLargura;
	}
	public void setnVlLargura(BigDecimal nVlLargura) {
		this.nVlLargura = nVlLargura;
	}
	public BigDecimal getnVlDiametro() {
		return nVlDiametro;
	}
	public void setnVlDiametro(BigDecimal nVlDiametro) {
		this.nVlDiametro = nVlDiametro;
	}
	public String getsCdMaoPropria() {
		return sCdMaoPropria;
	}
	public void setsCdMaoPropria(String sCdMaoPropria) {
		this.sCdMaoPropria = sCdMaoPropria;
	}
	public BigDecimal getnVlValorDeclarado() {
		return nVlValorDeclarado;
	}
	public void setnVlValorDeclarado(BigDecimal nVlValorDeclarado) {
		this.nVlValorDeclarado = nVlValorDeclarado;
	}
	public String getsCdAvisoRecebiment() {
		return sCdAvisoRecebiment;
	}
	public void setsCdAvisoRecebiment(String sCdAvisoRecebiment) {
		this.sCdAvisoRecebiment = sCdAvisoRecebiment;
	}
	
	
}
