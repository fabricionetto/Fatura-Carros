package aplicativo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entidades.Aluguel_Carros;
import entidades.Veiculo;
import servicos.BrasilCalcTaxas;
import servicos.ProcessadorDeBoletos;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo Carro: ");
		String carModelo = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
		LocalDateTime entrada = LocalDateTime.parse(sc.nextLine(), dtf);
		System.out.print("Entrega (dd/MM/yyyy HH:mm): ");
		LocalDateTime entrega = LocalDateTime.parse(sc.nextLine(), dtf);
		Veiculo v = new Veiculo("Corsa");
		Aluguel_Carros ac = new Aluguel_Carros(entrada, entrega,v);
		
		// System.out.println(ac);
		 
	    System.out.print("Entre com valor por hora: ");
			double vh = sc.nextDouble();
		System.out.print("Entre com valor por dia: ");
			double vd = sc.nextDouble();
			
			ProcessadorDeBoletos pb = new ProcessadorDeBoletos(vh, vd, new BrasilCalcTaxas());
		 
			pb.ProcessarBoletos(ac);
			System.out.println("Pagamento basico: " + ac.getFatura().getPagamentoBasico());
			System.out.println("Imposto: " + ac.getFatura().getTx());
			System.out.println("Pagamento total: " + ac.getFatura().buscarTotalPagamento());
			sc.close();
	}

}
