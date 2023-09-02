package br.com.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean continuar = true;
		
		do {		
			try {			
				System.out.print("Numero: ");			
				int a = s.nextInt();
				System.out.print("Divisor: ");			
				int b = s.nextInt();
				System.out.println(a/b);
			}catch(InputMismatchException e1) {
				System.err.println("Favor inserir números inteiro");
				s.nextLine();//Descarta entrada inválida
			}catch(Throwable e2) {
				System.err.println("O divisor deve ser diferente de zero");
			}finally{
				System.err.println("Finaly executando...");
			}
		}while(continuar);
	}
}
