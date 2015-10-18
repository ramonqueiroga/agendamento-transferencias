package br.com.reservafacil.teste.transferencia;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import br.com.reservafacil.teste.enums.TipoTransferenciaEnum;
import br.com.reservafacil.teste.modelo.Transferencia;
import br.com.reservafacil.teste.utils.DataUtil;

public class CalculoTipoBTest {

	@Test
	public void TestaSeCalculoTipoBComDiferencaMaiorQueTrintaEstaCorreto() {
		Transferencia transferencia = new Transferencia();
		transferencia.setContaOrigem("65432-1");
		transferencia.setContaDestino("12345-6");
		transferencia.setValor(new BigDecimal("100"));
		transferencia.setDataAgendamento(DataUtil.criaDataComSomatorioDeDias(transferencia.getDataCadastro(), 31));
		transferencia.setTipoTransferenciaEnum(TipoTransferenciaEnum.TIPOB);

		ITipoCalculo tipoCalculo = TipoCalculoFactory
				.getTipoCalculo(transferencia);
		BigDecimal taxaCalculada = tipoCalculo.calculaTaxa(transferencia);
		Assert.assertTrue(taxaCalculada.compareTo(new BigDecimal("8")) == 0);
	}
	
	@Test
	public void TestaSeCalculoTipoBComDiferencaIgualATrintaEstaCorreto() {
		Transferencia transferencia = new Transferencia();
		transferencia.setContaOrigem("65432-1");
		transferencia.setContaDestino("12345-6");
		transferencia.setValor(new BigDecimal("100"));
		transferencia.setDataAgendamento(DataUtil.criaDataComSomatorioDeDias(transferencia.getDataCadastro(), 30));
		transferencia.setTipoTransferenciaEnum(TipoTransferenciaEnum.TIPOB);

		ITipoCalculo tipoCalculo = TipoCalculoFactory
				.getTipoCalculo(transferencia);
		BigDecimal taxaCalculada = tipoCalculo.calculaTaxa(transferencia);
		Assert.assertTrue(taxaCalculada.compareTo(new BigDecimal("10")) == 0);
	}
	
	@Test
	public void TestaSeCalculoTipoBComDiferencaMenorQueTrintaEstaCorreto() {
		Transferencia transferencia = new Transferencia();
		transferencia.setContaOrigem("65432-1");
		transferencia.setContaDestino("12345-6");
		transferencia.setValor(new BigDecimal("100"));
		transferencia.setDataAgendamento(DataUtil.criaDataComSomatorioDeDias(transferencia.getDataCadastro(), 15));
		transferencia.setTipoTransferenciaEnum(TipoTransferenciaEnum.TIPOB);

		ITipoCalculo tipoCalculo = TipoCalculoFactory
				.getTipoCalculo(transferencia);
		BigDecimal taxaCalculada = tipoCalculo.calculaTaxa(transferencia);
		Assert.assertTrue(taxaCalculada.compareTo(new BigDecimal("10")) == 0);
	}		

}
