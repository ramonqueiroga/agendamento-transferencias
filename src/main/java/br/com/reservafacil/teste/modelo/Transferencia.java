package br.com.reservafacil.teste.modelo;

import java.math.BigDecimal;
import java.util.Date;

import br.com.reservafacil.teste.enums.TipoTransferenciaEnum;

public class Transferencia {

	private String contaOrigem;
	private String contaDestino;
	private BigDecimal valor;
	private BigDecimal taxa;
	private Date dataAgendamento;
	private Date dataCadastro = new Date();
	private TipoTransferenciaEnum tipoTransferenciaEnum;

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

	public Date getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

}
