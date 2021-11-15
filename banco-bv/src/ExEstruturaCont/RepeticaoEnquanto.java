package ExEstruturaCont;

import java.util.Scanner;

public class RepeticaoEnquanto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador1 = 1;
				
		while (contador1 < 4 ) {
			System.out.println(contador1);
			contador1++; //incremento
		}
		
		int contador2 = 4;
		System.out.println("---------------");
		
		while (contador2 >= 0 ) {
			System.out.println(contador2);
			contador2--; // decremento 
		} 
		
		System.out.println("---------------");
		System.out.println("Digite vários números inteiros: ");
		System.out.println("Para Sair digite -1:");
		
		
		
		int numero;
		do {
			System.out.println("Numero: ");
			numero = entrada.nextInt();
			
		} while (numero != -1);
		

	}

}
