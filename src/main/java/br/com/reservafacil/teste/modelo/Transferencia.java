package br.com.reservafacil.teste.modelo;

import java.math.BigDecimal;
import java.util.Date;

import br.com.reservafacil.teste.enums.TipoTaxaEnum;

public class Transferencia {

	private String contaOrigem;
	private String contaDestino;
	private BigDecimal valor;
	private BigDecimal taxa;
	private Date dataAgendamento;
	private Date dataCadastro = new Date();
	private TipoTaxaEnum tipoTaxaEnum;

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

	public TipoTaxaEnum getTipoTaxaEnum() {
		return tipoTaxaEnum;
	}

	public void setTipoTaxaEnum(TipoTaxaEnum tipoTaxaEnum) {
		this.tipoTaxaEnum = tipoTaxaEnum;
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
