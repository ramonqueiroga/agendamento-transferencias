package br.com.reservafacil.teste.transferencia;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.reservafacil.teste.modelo.Transferencia;

public class CalculoTipoC extends AbstractTipoCalculo {

	@Override
	public BigDecimal calculaTaxa(Transferencia transferencia) {
		long diferencaDias = 0;
		BigDecimal totalTaxa = BigDecimal.ZERO;
		try {
			diferencaDias = diferencaDiasCadastroAgendamento(
					transferencia.getDataCadastro(),
					transferencia.getDataAgendamento());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(diferencaDias > 30){
			totalTaxa = transferencia.getValor().multiply(new BigDecimal("0.012"));
		}else if(diferencaDias > 25 && diferencaDias <= 30){
			totalTaxa = transferencia.getValor().multiply(new BigDecimal("0.021"));
		}else if(diferencaDias > 20 && diferencaDias <= 25){
			totalTaxa = transferencia.getValor().multiply(new BigDecimal("0.043"));
		}else if(diferencaDias > 15 && diferencaDias <= 20){
			totalTaxa = transferencia.getValor().multiply(new BigDecimal("0.054"));
		}else if(diferencaDias > 10 && diferencaDias <= 15){
			totalTaxa = transferencia.getValor().multiply(new BigDecimal("0.067"));
		}else if(diferencaDias > 5 && diferencaDias <= 10){
			totalTaxa = transferencia.getValor().multiply(new BigDecimal("0.074"));
		}else if(diferencaDias > 0 && diferencaDias <= 5){
			totalTaxa = transferencia.getValor().multiply(new BigDecimal("0.083"));
		}

		return totalTaxa.setScale(2, RoundingMode.HALF_EVEN);
	}

}
