package ExIntro;

import java.util.Scanner;

public class mediaNotas {

	public static void main(String[] args) {
		double notaTrabalho = 0, notaProva = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite as duas notas: ");
		notaTrabalho = entrada.nextDouble();
		notaProva = entrada.nextDouble();
		
		
		entrada.close();
		double media = (notaTrabalho + notaProva)/2;
		System.out.println("Média: " + media);
		if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}

}
