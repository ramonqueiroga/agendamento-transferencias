package br.com.reservafacil.teste.transferencia;

import java.util.Date;
import org.joda.time.Duration;

public abstract class AbstractTipoCalculo implements ITipoCalculo {

	public long diferencaDiasCadastroAgendamento(Date dataCadastro,
			Date dataAgendamento) throws Exception {
		Duration duracao = new Duration(dataCadastro.getTime(),
				dataAgendamento.getTime());
		return duracao.getStandardDays();
	}

}
