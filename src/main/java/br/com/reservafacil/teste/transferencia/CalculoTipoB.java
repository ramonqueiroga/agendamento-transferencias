package br.com.reservafacil.teste.transferencia;

import java.math.BigDecimal;

import br.com.reservafacil.teste.modelo.Transferencia;

public class CalculoTipoB extends AbstractTipoCalculo {

	@Override
	public BigDecimal calculaTaxa(Transferencia transferencia) {
		long diferencaDias = 0;
		
		try {
			diferencaDias = diferencaDiasCadastroAgendamento(
					transferencia.getDataCadastro(),
					transferencia.getDataAgendamento());
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (diferencaDias <= 30) {
			return new BigDecimal("10");
		} else {
			return new BigDecimal("8");
		}
	}

}