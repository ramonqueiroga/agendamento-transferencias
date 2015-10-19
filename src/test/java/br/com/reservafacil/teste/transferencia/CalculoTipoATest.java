package br.com.reservafacil.teste.transferencia;

import java.math.BigDecimal;
import java.util.Calendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.reservafacil.teste.enums.TipoTransferenciaEnum;
import br.com.reservafacil.teste.modelo.Transferencia;
import br.com.reservafacil.teste.utils.DataUtil;

public class CalculoTipoATest {

	private Transferencia transferencia;

	@Before
	public void criaObjetoTransferencia() {
		transferencia = new Transferencia();
		transferencia.setContaOrigem("65432-1");
		transferencia.setContaDestino("12345-6");
		transferencia.setValor(new BigDecimal("100"));
		transferencia.setDataAgendamento(DataUtil.criaDataComSomatorioDeDias(Calendar.getInstance(), 2));
		transferencia.setTipoTransferenciaEnum(TipoTransferenciaEnum.TIPOA);
	}

	@Test
	public void TestaSeCalculoTipoAEstaCorreto() {
		ITipoCalculo tipoCalculo = TipoCalculoFactory
				.getTipoCalculo(transferencia);
		BigDecimal taxaCalculada = tipoCalculo.calculaTaxa(transferencia);
		Assert.assertTrue(taxaCalculada.compareTo(new BigDecimal("5")) == 0);
	}
}
