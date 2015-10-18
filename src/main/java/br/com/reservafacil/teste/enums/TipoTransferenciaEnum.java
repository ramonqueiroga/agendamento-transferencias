package br.com.reservafacil.teste.enums;

public enum TipoTransferenciaEnum {

	TIPOA("A"),
	TIPOB("B"),
	TIPOC("C"),
	TIPOD("D");
	
	private String tipo;
	
	private TipoTransferenciaEnum(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return this.tipo;
	}
	
}
