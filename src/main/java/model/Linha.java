package model;

public enum Linha {

	CRONOS("Cronos"),
	ARES("Ares");
	
	private String linha;
	
	Linha(String linha) {
		this.linha = linha;
	}
	
	public String getLinha() {
		return linha;
	}
	
}
