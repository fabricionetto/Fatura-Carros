package entidades;

import java.time.LocalDateTime;
import java.util.Date;

public class Aluguel_Carros {

	private LocalDateTime inicio;
	private LocalDateTime fechar;
	
	private Veiculo veiculo;
	private Fatura fatura;
	
	
	public Aluguel_Carros() {
		super();
	}

	public Aluguel_Carros(LocalDateTime inicio, LocalDateTime fechar, Veiculo veiculo) {
		super();
		this.inicio = inicio;
		this.fechar = fechar;
		this.veiculo = veiculo;
	}


	public LocalDateTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}

	public LocalDateTime getFechar() {
		return fechar;
	}

	public void setFechar(LocalDateTime fechar) {
		this.fechar = fechar;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}	
}
