package br.com.reservafacil.teste.transferencia;

import java.util.Calendar;

import org.joda.time.DateTime;
import org.joda.time.Days;

public abstract class AbstractTipoCalculo implements ITipoCalculo {

	public long diferencaDiasCadastroAgendamento(Calendar dataCadastro,
			Calendar dataAgendamento) throws Exception {
		DateTime cadastro = new DateTime(dataCadastro);
		DateTime agendamento = new DateTime(dataAgendamento);
		return Days.daysBetween(cadastro, agendamento).getDays();
	}

}
