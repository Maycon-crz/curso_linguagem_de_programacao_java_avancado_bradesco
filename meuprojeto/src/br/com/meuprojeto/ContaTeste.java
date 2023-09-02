package br.com.meuprojeto;

public class ContaTeste {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.cliente = "Maycon";
		conta.saldo = 4_000.00;
		conta.exibesaldo();
		
		/*
 		conta.saque(2000);
		conta.exibesaldo();
		
		conta.deposita(8000);
		conta.exibesaldo();
		 * */
			
		Conta destino = new Conta();
		destino.cliente = "Camila";
		destino.saldo = 5_000.00;
		destino.exibesaldo();
		
	}
}
