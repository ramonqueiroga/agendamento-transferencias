package br.com.reservafacil.teste.transferencia;

import java.math.BigDecimal;

import br.com.reservafacil.teste.enums.TipoTaxaEnum;

public class TaxaFactory {
	
	public static ITaxa getTaxa(TipoTaxaEnum tipoTaxaEnum, BigDecimal valorTransferencia){
		switch (tipoTaxaEnum) {
		case TIPOA:
			return new TaxaTipoA();
		case TIPOB:
			return new TaxaTipoB();
		case TIPOC:
			return new TaxaTipoC();
		case TIPOD:
			//TODO implementar corretamente a regra para o D
			if(true){
				return new TaxaTipoA();
			}else if(true){
				return new TaxaTipoB();
			}else if(true){
				return new TaxaTipoC();	
			}
		}
		return null;
	}

}
