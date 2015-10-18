package br.com.reservafacil.teste.transferencia;

import java.math.BigDecimal;

import br.com.reservafacil.teste.modelo.Transferencia;

public class TipoCalculoFactory {

	public static ITipoCalculo getTipoCalculo(Transferencia transferencia) {
		switch (transferencia.getTipoTransferenciaEnum()) {
		case TIPOA:
			return new CalculoTipoA();
		case TIPOB:
			return new CalculoTipoB();
		case TIPOC:
			return new CalculoTipoC();
		case TIPOD:
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
		default:
			return null;
		}
	}

	public static void main(String[] args) {
		BigDecimal numero1 = new BigDecimal("15000");
		BigDecimal numero2 = new BigDecimal("26000");
		numero2.compareTo(numero1);

	}

}
