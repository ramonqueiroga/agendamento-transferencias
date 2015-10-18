package br.com.reservafacil.teste.transferencia;

import br.com.reservafacil.teste.modelo.Transferencia;

public class TipoCalculoFactory {
	
	public static ITipoCalculo getTipoCalculo(Transferencia transferencia){
		switch (transferencia.getTipoTransferenciaEnum()) {
		case TIPOA:
			return new CalculoTipoA();
		case TIPOB:
			return new CalculoTipoB();
		case TIPOC:
			return new CalculoTipoC();
		case TIPOD:
			//TODO implementar corretamente a regra para o D
			if(true){
				return new CalculoTipoA();
			}else if(true){
				return new CalculoTipoB();
			}else if(true){
				return new CalculoTipoC();	
			}
		}
		return null;
	}

}
