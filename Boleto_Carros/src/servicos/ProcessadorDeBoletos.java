package servicos;

import java.time.Duration;

import entidades.Aluguel_Carros;
import entidades.Fatura;

public class ProcessadorDeBoletos {

	private Double precoPorHora;
	private Double precoPorDia;
	
	private BrasilCalcTaxas brasilCalcTaxas;

	public ProcessadorDeBoletos(Double precoPorHora, Double precoPorDia, BrasilCalcTaxas brasilCalcTaxas) {
		super();
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.brasilCalcTaxas = brasilCalcTaxas;
	}
	
	public void ProcessarBoletos(Aluguel_Carros alCarros) {
		
		double minuto = Duration.between(alCarros.getInicio(), alCarros.getFechar()).toMinutes();
		double hora = minuto/60;
		//System.out.println("HORA TOTAL: " + hora);
		double pagamentoBasico;
		
		
		if(hora <= 12) {
			pagamentoBasico = precoPorHora * Math.ceil(hora);
		}
		else {
			pagamentoBasico = precoPorDia * Math.ceil(hora/24);
		}
		
		double taxa = brasilCalcTaxas.taxasBrasil(pagamentoBasico);
		alCarros.setFatura(new Fatura(pagamentoBasico, taxa));
	}
}
