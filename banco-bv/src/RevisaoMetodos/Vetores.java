package RevisaoMetodos;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		exerc�cio 3
		double numero = 0;
		double resultado = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero real: ");
		numero = entrada.nextDouble();
		
		if(numero > 0.0) {
			resultado = Math.sqrt(numero);
			System.out.println("Raiz quadrada: " + resultado);
		} else {
			System.out.println("Quadrado do n�mero: "+ Math.pow(numero,2));
		}
		
		// exerc�cio 23
		double totalIdades = 0;
		double somaIdades = 0;
		byte idade = 0;
		double mediaIdades = 0;
		
		System.out.println("Digite v�rias idades! para sair digite 0.");
		
		do {
			System.out.println((totalIdades + 1) + "a idade: ");
			idade = entrada.nextByte();
			
			somaIdades = idade + somaIdades;
			totalIdades++;
			
			// para imprimir o resultado ap�s o usu�rio digitar cada idade.
			mediaIdades = somaIdades/totalIdades;
			System.out.println("M�dia: " + mediaIdades);
			
			
			
		} while(idade > 0 && idade < 127);
		// para imprimir o resultado da m�dia s� no final.
			mediaIdades = (somaIdades/(totalIdades -1));
			System.out.println("M�dia: " + mediaIdades);
		
		
		String[] status = {
			"Aprovado",
			"Cancelado",
			"Entregue",
			"Em separa��o",
			"Enviado"
			
		};
		System.out.println(status[0]);
		
		Arrays.sort(status); //ordem alfab�tica
		System.out.println(Arrays.toString(status));
		
		for(int i = 0; i < status.length; i++) {
			System.out.println(status[i] + " \t");
		}
	}

}
