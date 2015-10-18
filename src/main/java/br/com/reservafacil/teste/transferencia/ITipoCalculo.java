package br.com.reservafacil.teste.transferencia;

import java.math.BigDecimal;

import br.com.reservafacil.teste.modelo.Transferencia;

public interface ITipoCalculo {

	public BigDecimal calculaTaxa(Transferencia transferencia);
	
}
