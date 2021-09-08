package tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		double multiplicando, multiplicador, produto;
		double contador = 0, numRepeticao;

		System.out.print("Qual o multiplicando? ");
		multiplicando = scanner.nextDouble();
		System.out.print("Qual o máximo multiplicador? ");
		multiplicador = scanner.nextDouble();
		
		scanner.close();
		
		numRepeticao = multiplicador;
		
		
		while (contador <= numRepeticao) {
			
			produto = multiplicando * contador;
			
			System.out.println(multiplicando + " x " + contador + " = " + produto);
			
			contador++;
		}
		
		
		
	}
}
		
