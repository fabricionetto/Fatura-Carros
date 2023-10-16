package entidades;

public class Fatura {

	private Double pagamentoBasico;
	private Double tx;
	
	public Fatura() {
		super();
	}

	public Fatura(Double pagamentoBasico, Double tx) {
		super();
		this.pagamentoBasico = pagamentoBasico;
		this.tx = tx;
	}

	public Double getPagamentoBasico() {
		return pagamentoBasico;
	}

	public void setPagamentoBasico(Double pagamentoBasico) {
		this.pagamentoBasico = pagamentoBasico;
	}

	public Double getTx() {
		return tx;
	}

	public void setTx(Double tx) {
		this.tx = tx;
	}
	
	public Double buscarTotalPagamento() {
	 System.out.println("mETODO ACIONADO");
		return getPagamentoBasico() + getTx();		
	}
	
	}
