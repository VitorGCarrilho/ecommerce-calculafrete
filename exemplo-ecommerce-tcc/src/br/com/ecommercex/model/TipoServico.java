package br.com.ecommercex.model;

public enum TipoServico {
	SEDEX_VAREJO("40010", "SEDEX varejo"),
	SEDEX_10("40215", "SEDEX 10 Varejo"),
	SEDEX_HOJE("40290", "SEDEX hoje Varejo"),
	PAC_VAREJO("41106", "PAC Varejo");

	private String codigo;
	private String servico;
	
	TipoServico(String codigo, String servico){
		this.codigo = codigo;
		this.servico = servico;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

}
