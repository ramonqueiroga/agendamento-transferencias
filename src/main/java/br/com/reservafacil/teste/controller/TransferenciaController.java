package br.com.reservafacil.teste.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.reservafacil.teste.enums.TipoTransferenciaEnum;
import br.com.reservafacil.teste.modelo.Transferencia;
import br.com.reservafacil.teste.transferencia.ITipoCalculo;
import br.com.reservafacil.teste.transferencia.TipoCalculoFactory;

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
		result.include("tiposTransferencia", TipoTransferenciaEnum.values());
		result.include("transferencias", transferencias);
	}
	
	public void adicionaTransferencia(Transferencia transferencia){
		ITipoCalculo tipoCalculo = TipoCalculoFactory.getTipoCalculo(transferencia);
		BigDecimal taxaCalculada = tipoCalculo.calculaTaxa(transferencia);
		transferencia.setTaxa(taxaCalculada);
		transferencias.add(transferencia);
		result.redirectTo(TransferenciaController.class).index();
	}
	
}