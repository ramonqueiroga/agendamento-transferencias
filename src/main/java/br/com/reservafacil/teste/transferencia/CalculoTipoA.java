package br.com.reservafacil.teste.transferencia;

import java.math.BigDecimal;

import br.com.reservafacil.teste.modelo.Transferencia;

public class CalculoTipoA extends AbstractTipoCalculo {

	@Override
	public BigDecimal calculaTaxa(Transferencia transferencia) {
		BigDecimal valorFixoTaxa = new BigDecimal("2");
		BigDecimal valorPercentual = transferencia.getValor().multiply(new BigDecimal("0.03"));
		BigDecimal totalTaxa = valorFixoTaxa.add(valorPercentual);
		return totalTaxa;
	}

}
