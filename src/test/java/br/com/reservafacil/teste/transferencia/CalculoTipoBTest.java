package br.com.reservafacil.teste.transferencia;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import br.com.reservafacil.teste.enums.TipoTransferenciaEnum;
import br.com.reservafacil.teste.modelo.Transferencia;

public class CalculoTipoBTest {

	@Test
	public void TestaSeCalculoTipoBComDiferencaMaiorQueTrintaEstaCorreto() {
		Transferencia transferencia = TransferenciaBuilderParaTeste.buildTransferencia(
				new BigDecimal("100"), 31, TipoTransferenciaEnum.TIPOB);

		ITipoCalculo tipoCalculo = TipoCalculoFactory
				.getTipoCalculo(transferencia);
		BigDecimal taxaCalculada = tipoCalculo.calculaTaxa(transferencia);
		Assert.assertTrue(taxaCalculada.compareTo(new BigDecimal("8")) == 0);
	}
	
	@Test
	public void TestaSeCalculoTipoBComDiferencaIgualATrintaEstaCorreto() {
		Transferencia transferencia = TransferenciaBuilderParaTeste.buildTransferencia(
				new BigDecimal("100"), 30, TipoTransferenciaEnum.TIPOB);		

		ITipoCalculo tipoCalculo = TipoCalculoFactory
				.getTipoCalculo(transferencia);
		BigDecimal taxaCalculada = tipoCalculo.calculaTaxa(transferencia);
		Assert.assertTrue(taxaCalculada.compareTo(new BigDecimal("10")) == 0);
	}
	
	@Test
	public void TestaSeCalculoTipoBComDiferencaMenorQueTrintaEstaCorreto() {
		Transferencia transferencia = TransferenciaBuilderParaTeste.buildTransferencia(
				new BigDecimal("100"), 15, TipoTransferenciaEnum.TIPOB);		

		ITipoCalculo tipoCalculo = TipoCalculoFactory
				.getTipoCalculo(transferencia);
		BigDecimal taxaCalculada = tipoCalculo.calculaTaxa(transferencia);
		Assert.assertTrue(taxaCalculada.compareTo(new BigDecimal("10")) == 0);
	}		

}
