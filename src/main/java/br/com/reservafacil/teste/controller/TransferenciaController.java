package br.com.reservafacil.teste.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.reservafacil.teste.enums.TipoTaxaEnum;
import br.com.reservafacil.teste.modelo.Transferencia;
import br.com.reservafacil.teste.transferencia.ITaxa;
import br.com.reservafacil.teste.transferencia.TaxaFactory;

@Controller
public class TransferenciaController {

	private final Result result;
	private static List<Transferencia> transferencias = new ArrayList<Transferencia>();

	protected TransferenciaController() {
		this(null);
	}
	
	@Inject
	public TransferenciaController(Result result) {
		this.result = result;
	}

	@Path("/")
	public void index() {
		result.include("variable", "VRaptor!");
		result.include("tiposTaxa", TipoTaxaEnum.values());
	}
	
	public void adicionaTransferencia(Transferencia transferencia){
		ITaxa taxa = TaxaFactory.getTaxa(transferencia.getTipoTaxaEnum(), transferencia.getValor());
		BigDecimal taxaCalculada = taxa.calculaTaxa();
		transferencia.setTaxa(taxaCalculada);
		transferencias.add(transferencia);
		result.redirectTo(TransferenciaController.class).index();
	}
	
}