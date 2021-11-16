package RevisaoMetodos;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		exercício 3
		double numero = 0;
		double resultado = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número real: ");
		numero = entrada.nextDouble();
		
		if(numero > 0.0) {
			resultado = Math.sqrt(numero);
			System.out.println("Raiz quadrada: " + resultado);
		} else {
			System.out.println("Quadrado do número: "+ Math.pow(numero,2));
		}
		
		// exercício 23
		double totalIdades = 0;
		double somaIdades = 0;
		byte idade = 0;
		double mediaIdades = 0;
		
		System.out.println("Digite várias idades! para sair digite 0.");
		
		do {
			System.out.println((totalIdades + 1) + "a idade: ");
			idade = entrada.nextByte();
			
			somaIdades = idade + somaIdades;
			totalIdades++;
			
			// para imprimir o resultado após o usuário digitar cada idade.
			mediaIdades = somaIdades/totalIdades;
			System.out.println("Média: " + mediaIdades);
			
			
			
		} while(idade > 0 && idade < 127);
		// para imprimir o resultado da média só no final.
			mediaIdades = (somaIdades/(totalIdades -1));
			System.out.println("Média: " + mediaIdades);
		
		
		String[] status = {
			"Aprovado",
			"Cancelado",
			"Entregue",
			"Em separação",
			"Enviado"
			
		};
		System.out.println(status[0]);
		
		Arrays.sort(status); //ordem alfabética
		System.out.println(Arrays.toString(status));
		
		for(int i = 0; i < status.length; i++) {
			System.out.println(status[i] + " \t");
		}
	}

}
