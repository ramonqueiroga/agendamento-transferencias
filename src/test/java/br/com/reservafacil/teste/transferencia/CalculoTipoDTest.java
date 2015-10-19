package br.com.reservafacil.teste.transferencia;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import br.com.reservafacil.teste.enums.TipoTransferenciaEnum;
import br.com.reservafacil.teste.modelo.Transferencia;

public class CalculoTipoDTest {

	@Test
	public void TestaSeCalculoDCOmValorAteVinteECincoMilEstaCorreto() {
		Transferencia transferencia = TransferenciaBuilder.buildTransferencia(
				new BigDecimal("23500"), 10,
				TipoTransferenciaEnum.TIPOD);

		ITipoCalculo tipoCalculo = TipoCalculoFactory
				.getTipoCalculo(transferencia);
		BigDecimal taxaCalculada = tipoCalculo.calculaTaxa(transferencia);
		Assert.assertTrue(taxaCalculada.compareTo(new BigDecimal("707")) == 0);
	}

	@Test
	public void TestaSeCalculoDCOmValorAteCentoEVinteMilEstaCorreto() {
		Transferencia transferencia = TransferenciaBuilder.buildTransferencia(
				new BigDecimal("25001"), 10,
				TipoTransferenciaEnum.TIPOD);		

		ITipoCalculo tipoCalculo = TipoCalculoFactory
				.getTipoCalculo(transferencia);
		BigDecimal taxaCalculada = tipoCalculo.calculaTaxa(transferencia);
		Assert.assertTrue(taxaCalculada.compareTo(new BigDecimal("10")) == 0);

		Transferencia transferencia2 = TransferenciaBuilder.buildTransferencia(
				new BigDecimal("120000"), 31,
				TipoTransferenciaEnum.TIPOD);		

		ITipoCalculo tipoCalculo2 = TipoCalculoFactory
				.getTipoCalculo(transferencia2);
		BigDecimal taxaCalculada2 = tipoCalculo2.calculaTaxa(transferencia2);
		Assert.assertTrue(taxaCalculada2.compareTo(new BigDecimal("8")) == 0);
	}
	
	
	@Test
	public void TestaSeCalculoDCOmValorMaiorQueCentoEVinteMilEstaCorreto() {
		//TIPO D COM REFERENCIA DO TIPO C - Maior que 30 dias (1.2%)
		Transferencia transferencia = TransferenciaBuilder.buildTransferencia(
				new BigDecimal("150000"), 31, TipoTransferenciaEnum.TIPOD);		
		ITipoCalculo tipoCalculo = TipoCalculoFactory
				.getTipoCalculo(transferencia);
		BigDecimal taxaCalculada = tipoCalculo.calculaTaxa(transferencia);
		Assert.assertTrue(taxaCalculada.compareTo(new BigDecimal("1800")) == 0);
		
		//TIPO D COM REFERENCIA DO TIPO C - Até 30 dias (2.1%)
		Transferencia transferencia2 = TransferenciaBuilder.buildTransferencia(
				new BigDecimal("150000"), 30, TipoTransferenciaEnum.TIPOD);			
		ITipoCalculo tipoCalculo2 = TipoCalculoFactory
				.getTipoCalculo(transferencia2);
		BigDecimal taxaCalculada2 = tipoCalculo2.calculaTaxa(transferencia2);
		Assert.assertTrue(taxaCalculada2.compareTo(new BigDecimal("3150")) == 0);

		//TIPO D COM REFERENCIA DO TIPO C - Até 25 dias (4.3%)
		Transferencia transferencia3 = TransferenciaBuilder.buildTransferencia(
				new BigDecimal("150000"), 25, TipoTransferenciaEnum.TIPOD);			
		ITipoCalculo tipoCalculo3 = TipoCalculoFactory
				.getTipoCalculo(transferencia2);
		BigDecimal taxaCalculada3 = tipoCalculo3.calculaTaxa(transferencia3);
		Assert.assertTrue(taxaCalculada3.compareTo(new BigDecimal("6450")) == 0);
		
		//TIPO D COM REFERENCIA DO TIPO C - Até 20 dias (5.4%)	
		Transferencia transferencia4 = TransferenciaBuilder.buildTransferencia(
				new BigDecimal("150000"), 20, TipoTransferenciaEnum.TIPOD);			
		ITipoCalculo tipoCalculo4 = TipoCalculoFactory
				.getTipoCalculo(transferencia4);
		BigDecimal taxaCalculada4 = tipoCalculo4.calculaTaxa(transferencia4);
		Assert.assertTrue(taxaCalculada4.compareTo(new BigDecimal("8100")) == 0);

		//TIPO D COM REFERENCIA DO TIPO C - Até 15 dias (6.7%)
		Transferencia transferencia5 = TransferenciaBuilder.buildTransferencia(
				new BigDecimal("150000"), 15, TipoTransferenciaEnum.TIPOD);			
		ITipoCalculo tipoCalculo5 = TipoCalculoFactory
				.getTipoCalculo(transferencia5);
		BigDecimal taxaCalculada5 = tipoCalculo5.calculaTaxa(transferencia5);
		Assert.assertTrue(taxaCalculada5.compareTo(new BigDecimal("10050")) == 0);
		
		//TIPO D COM REFERENCIA DO TIPO C - Até 10 dias (7.4%)		
		Transferencia transferencia6 = TransferenciaBuilder.buildTransferencia(
				new BigDecimal("150000"), 10, TipoTransferenciaEnum.TIPOD);			
		ITipoCalculo tipoCalculo6 = TipoCalculoFactory
				.getTipoCalculo(transferencia6);
		BigDecimal taxaCalculada6 = tipoCalculo6.calculaTaxa(transferencia6);
		Assert.assertTrue(taxaCalculada6.compareTo(new BigDecimal("11100")) == 0);
		
		//TIPO D COM REFERENCIA DO TIPO C - Até 5 dias (8.3%)		
		Transferencia transferencia7 = TransferenciaBuilder.buildTransferencia(
				new BigDecimal("150000"), 5, TipoTransferenciaEnum.TIPOD);			
		ITipoCalculo tipoCalculo7 = TipoCalculoFactory
				.getTipoCalculo(transferencia7);
		BigDecimal taxaCalculada7 = tipoCalculo7.calculaTaxa(transferencia7);
		Assert.assertTrue(taxaCalculada7.compareTo(new BigDecimal("12450")) == 0);		
	}	

}
