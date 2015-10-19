package br.com.reservafacil.teste.modelo;

import java.math.BigDecimal;
import java.util.Calendar;
import br.com.reservafacil.teste.enums.TipoTransferenciaEnum;

public class Transferencia {

	private String contaOrigem;
	private String contaDestino;
	private BigDecimal valor;
	private BigDecimal taxa;
	private Calendar dataAgendamento;
	private Calendar dataCadastro;
	private TipoTransferenciaEnum tipoTransferenciaEnum;

	public Transferencia(){
		this.dataCadastro = Calendar.getInstance();
		this.dataCadastro.set(Calendar.HOUR_OF_DAY, 0);
		this.dataCadastro.set(Calendar.MINUTE, 0);
		this.dataCadastro.set(Calendar.SECOND, 0);
		this.dataCadastro.set(Calendar.MILLISECOND, 0);
	}
	
	public String getContaOrigem() {
		return contaOrigem;
	}

	public void setContaOrigem(String contaOrigem) {
		this.contaOrigem = contaOrigem;
	}

	public String getContaDestino() {
		return contaDestino;
	}

	public void setContaDestino(String contaDestino) {
		this.contaDestino = contaDestino;
	}

	public TipoTransferenciaEnum getTipoTransferenciaEnum() {
		return tipoTransferenciaEnum;
	}

	public void setTipoTransferenciaEnum(TipoTransferenciaEnum tipoTransferenciaEnum) {
		this.tipoTransferenciaEnum = tipoTransferenciaEnum;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getTaxa() {
		return taxa;
	}

	public void setTaxa(BigDecimal taxa) {
		this.taxa = taxa;
	}

	public Calendar getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(Calendar dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

}
