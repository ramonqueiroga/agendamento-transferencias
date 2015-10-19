package br.com.reservafacil.teste.transferencia;

import java.math.BigDecimal;

import br.com.reservafacil.teste.enums.TipoTransferenciaEnum;
import br.com.reservafacil.teste.modelo.Transferencia;
import br.com.reservafacil.teste.utils.DataUtil;

public class TransferenciaBuilder {
	public static Transferencia buildTransferencia(BigDecimal valor, Integer quantidadeDiasSoma,
			TipoTransferenciaEnum tipoTransferenciaEnum) {
		Transferencia transferencia = new Transferencia();
		transferencia.setContaOrigem("65432-1");
		transferencia.setContaDestino("12345-6");
		transferencia.setValor(valor);
		transferencia.setDataAgendamento(DataUtil.criaDataComSomatorioDeDias(transferencia.getDataCadastro(), quantidadeDiasSoma));
		transferencia.setTipoTransferenciaEnum(tipoTransferenciaEnum);
		return transferencia;
	}	
}
