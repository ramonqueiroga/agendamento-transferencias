package br.com.reservafacil.teste.transferencia;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import br.com.reservafacil.teste.enums.TipoTransferenciaEnum;
import br.com.reservafacil.teste.modelo.Transferencia;

public class CalculoTipoCTest {

	@Test
	public void TestaSeCalculoTipoCComDiferencaMaiorQueTrintaDiasEstaCorreto() {
		Transferencia transferencia = TransferenciaBuilderParaTeste.buildTransferencia(
				new BigDecimal("1000"), 31, TipoTransferenciaEnum.TIPOC);
		ITipoCalculo tipoCalculo = TipoCalculoFactory
				.getTipoCalculo(transferencia);
		BigDecimal taxaCalculada = tipoCalculo.calculaTaxa(transferencia);
		Assert.assertTrue(taxaCalculada.compareTo(new BigDecimal("12")) == 0);
	}
	
	@Test
	public void TestaSeCalculoTipoCComDiferencaAteTrintaDiasEstaCorreto() {
		Transferencia transferencia = TransferenciaBuilderParaTeste.buildTransferencia(
				new BigDecimal("1000"), 26, TipoTransferenciaEnum.TIPOC);
		
		ITipoCalculo tipoCalculo = TipoCalculoFactory
				.getTipoCalculo(transferencia);
		BigDecimal taxaCalculada = tipoCalculo.calculaTaxa(transferencia);
		Assert.assertTrue(taxaCalculada.compareTo(new BigDecimal("21")) == 0);
		
		Transferencia transferencia2 = TransferenciaBuilderParaTeste.buildTransferencia(
				new BigDecimal("1000"), 30, TipoTransferenciaEnum.TIPOC);
		
		ITipoCalculo tipoCalculo2 = TipoCalculoFactory
				.getTipoCalculo(transferencia2);
		BigDecimal taxaCalculada2 = tipoCalculo2.calculaTaxa(transferencia2);
		Assert.assertTrue(taxaCalculada2.compareTo(new BigDecimal("21")) == 0);		
	}	
	
	@Test
	public void TestaSeCalculoTipoCComDiferencaAteVinteECincoDiasEstaCorreto() {
		Transferencia transferencia = TransferenciaBuilderParaTeste.buildTransferencia(
				new BigDecimal("1000"), 21, TipoTransferenciaEnum.TIPOC);

		ITipoCalculo tipoCalculo = TipoCalculoFactory
				.getTipoCalculo(transferencia);
		BigDecimal taxaCalculada = tipoCalculo.calculaTaxa(transferencia);
		Assert.assertTrue(taxaCalculada.compareTo(new BigDecimal("43")) == 0);
		
		Transferencia transferencia2 = TransferenciaBuilderParaTeste.buildTransferencia(
				new BigDecimal("1000"), 25, TipoTransferenciaEnum.TIPOC);

		ITipoCalculo tipoCalculo2 = TipoCalculoFactory
				.getTipoCalculo(transferencia2);
		BigDecimal taxaCalculada2 = tipoCalculo2.calculaTaxa(transferencia2);
		Assert.assertTrue(taxaCalculada2.compareTo(new BigDecimal("43")) == 0);		
	}
	
	@Test
	public void TestaSeCalculoTipoCComDiferencaAteVinteDiasEstaCorreto() {
		Transferencia transferencia = TransferenciaBuilderParaTeste.buildTransferencia(
				new BigDecimal("1000"), 16, TipoTransferenciaEnum.TIPOC);

		ITipoCalculo tipoCalculo = TipoCalculoFactory
				.getTipoCalculo(transferencia);
		BigDecimal taxaCalculada = tipoCalculo.calculaTaxa(transferencia);
		Assert.assertTrue(taxaCalculada.compareTo(new BigDecimal("54")) == 0);
		
		Transferencia transferencia2 = TransferenciaBuilderParaTeste.buildTransferencia(
				new BigDecimal("1000"), 20, TipoTransferenciaEnum.TIPOC);

		ITipoCalculo tipoCalculo2 = TipoCalculoFactory
				.getTipoCalculo(transferencia2);
		BigDecimal taxaCalculada2 = tipoCalculo2.calculaTaxa(transferencia2);
		Assert.assertTrue(taxaCalculada2.compareTo(new BigDecimal("54")) == 0);		
	}		
		
	
	@Test
	public void TestaSeCalculoTipoCComDiferencaAteQuinzeDiasEstaCorreto() {
		Transferencia transferencia = TransferenciaBuilderParaTeste.buildTransferencia(
				new BigDecimal("1000"), 11, TipoTransferenciaEnum.TIPOC);		

		ITipoCalculo tipoCalculo = TipoCalculoFactory
				.getTipoCalculo(transferencia);
		BigDecimal taxaCalculada = tipoCalculo.calculaTaxa(transferencia);
		Assert.assertTrue(taxaCalculada.compareTo(new BigDecimal("67")) == 0);
		
		Transferencia transferencia2 = TransferenciaBuilderParaTeste.buildTransferencia(
				new BigDecimal("1000"), 15, TipoTransferenciaEnum.TIPOC);

		ITipoCalculo tipoCalculo2 = TipoCalculoFactory
				.getTipoCalculo(transferencia2);
		BigDecimal taxaCalculada2 = tipoCalculo2.calculaTaxa(transferencia2);
		Assert.assertTrue(taxaCalculada2.compareTo(new BigDecimal("67")) == 0);		
	}	
	
	@Test
	public void TestaSeCalculoTipoCComDiferencaAteDezDiasEstaCorreto() {
		Transferencia transferencia = TransferenciaBuilderParaTeste.buildTransferencia(
				new BigDecimal("1000"), 6, TipoTransferenciaEnum.TIPOC);

		ITipoCalculo tipoCalculo = TipoCalculoFactory
				.getTipoCalculo(transferencia);
		BigDecimal taxaCalculada = tipoCalculo.calculaTaxa(transferencia);
		Assert.assertTrue(taxaCalculada.compareTo(new BigDecimal("74")) == 0);
		
		Transferencia transferencia2 = TransferenciaBuilderParaTeste.buildTransferencia(
				new BigDecimal("1000"), 10, TipoTransferenciaEnum.TIPOC);

		ITipoCalculo tipoCalculo2 = TipoCalculoFactory
				.getTipoCalculo(transferencia2);
		BigDecimal taxaCalculada2 = tipoCalculo2.calculaTaxa(transferencia2);
		Assert.assertTrue(taxaCalculada2.compareTo(new BigDecimal("74")) == 0);		
	}
	
	@Test
	public void TestaSeCalculoTipoCComDiferencaAteCincoDiasEstaCorreto() {
		Transferencia transferencia = TransferenciaBuilderParaTeste.buildTransferencia(
				new BigDecimal("1000"), 1, TipoTransferenciaEnum.TIPOC);

		ITipoCalculo tipoCalculo = TipoCalculoFactory
				.getTipoCalculo(transferencia);
		BigDecimal taxaCalculada = tipoCalculo.calculaTaxa(transferencia);
		Assert.assertTrue(taxaCalculada.compareTo(new BigDecimal("83")) == 0);
		
		Transferencia transferencia2 = TransferenciaBuilderParaTeste.buildTransferencia(
				new BigDecimal("1000"), 5, TipoTransferenciaEnum.TIPOC);

		ITipoCalculo tipoCalculo2 = TipoCalculoFactory
				.getTipoCalculo(transferencia2);
		BigDecimal taxaCalculada2 = tipoCalculo2.calculaTaxa(transferencia2);
		Assert.assertTrue(taxaCalculada2.compareTo(new BigDecimal("83")) == 0);		
	}	
	
}
