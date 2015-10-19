package br.com.reservafacil.teste.transferencia;

import java.math.BigDecimal;

import br.com.reservafacil.teste.modelo.Transferencia;

public class CalculoTipoD {

	public ITipoCalculo buscaCalculoCorreto(Transferencia transferencia){
		if (transferencia.getValor().compareTo(new BigDecimal("25000")) <= 0) {
			return new CalculoTipoA();
		} else if (transferencia.getValor().compareTo(
				new BigDecimal("25000")) > 0
				&& transferencia.getValor().compareTo(
						new BigDecimal("120000")) <= 0) {
			return new CalculoTipoB();
		} else if (transferencia.getValor().compareTo(
				new BigDecimal("120000")) > 0) {
			return new CalculoTipoC();
		}
		
		return null;
	}
	
}
