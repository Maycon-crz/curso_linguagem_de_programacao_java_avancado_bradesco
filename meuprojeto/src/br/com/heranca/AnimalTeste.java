package br.com.heranca;

public class AnimalTeste {
	public static void main(String[] args) {
		Cachorro lulu = new Cachorro();
		lulu.comida = "Ração";
		lulu.dormi();
		
		Galinha cocorico = new Galinha();
		cocorico.dormi();
	}
}
