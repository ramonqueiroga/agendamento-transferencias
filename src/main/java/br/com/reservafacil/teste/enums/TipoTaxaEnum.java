package br.com.reservafacil.teste.enums;

public enum TipoTaxaEnum {

	TIPOA("A"),
	TIPOB("B"),
	TIPOC("C"),
	TIPOD("D");
	
	private String tipo;
	
	private TipoTaxaEnum(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return this.tipo;
	}
	
}
