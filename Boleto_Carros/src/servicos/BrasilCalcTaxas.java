package servicos;

public class BrasilCalcTaxas {

	public double taxasBrasil(double valor) {
		if(valor <= 100) {
			return valor * 0.2;
		} else {
			return valor * 0.15;
		}
	}
}
