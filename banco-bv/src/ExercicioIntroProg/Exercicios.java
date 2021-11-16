package ExercicioIntroProg;

import java.util.Scanner;

public class Exercicios {
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Exercícios - Introdução à Programação \n----------------------------------------");
		
//		exercicio1();
//		exercício2();
//		exercicio3();
//		exercicio4();
//		exercicio5();
//		exercicio6();
//		exercicio7();
//		exercicio8();
//		exercicio9();
//		exercicio10();
//		exercicio11();
//		exercicio12();
//		exercicio13();
//		exercicio14();
//		exercicio15();
//		exercicio16();
//		exercicio17();
//		exercicio18();
//		exercicio19();
//		exercicio20();
//		exercicio21();
//		exercicio22();
//		exercicio23();
//		exercicio24();
//		exercicio25();
//		exercicio26();
//		exercicio27();
		exercicio28();
	}
	static void exercicio1() {
		System.out.print("Exercício 1 - ");
		System.out.println("Olá Mundo!");
	}
	
	static void exercício2() {
		System.out.print("Exercício 2 - ");
		String nomeC = "Vanessa Cuevas Cortes";
		System.out.println(nomeC);
	}
	
	static void exercicio3() {
		String frase = "Exercício 3 - "+"A programação é aprendida escrevendo programas\r\n"
				+ "(Brian Kernighan)";
		System.out.println(frase);
	}
	
	static void exercicio4() {
		int n1 = 25, n2 = 27, produto = (n1*n2);
		System.out.println("Exercício 4 - Produto de: " + n1 + " * " + n2 + ": " + produto);
	}
	
	static void exercicio5() {
		double n1, n2, n3, media;
		n1 = 4;
		n2 = 12;
		n3 = 15;
		media = (n1 + n2 + n3)/3;
		System.out.printf("Exercício 5 - Média: %.2f", media);
		System.out.println("");
	}
	
	static void exercicio6() {
//		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		
		System.out.print("Exercício 6 - ");
		System.out.print("Digite um número: ");
		numero = entrada.nextInt();
		System.out.println("O número digitad foi: " + numero);
	}

	static void exercicio7() {
		int n1, n2;
		n1 = 13;
		n2 = 26;
		System.out.println("Exercício 7 - número 1: " + n1 + ". numero 2: " + n2);
	}
	
	static void exercicio8() {
		int n1 = 75;
		int ant = n1-1;
		int suc = n1+1;
		System.out.println("Exercício 8 - Número atual: " + n1  + ". Sucessor: " + suc + ". Antecessor: " + ant);
	}
	static void exercicio9() {
		String nome;
		String endereco = "";
		String telefone = "";
		System.out.print("Digite seu nome: ");
		entrada.nextLine();
		nome = entrada.nextLine();
		System.out.print("Digite seu endereço: ");
		endereco = entrada.nextLine();
		System.out.print("Digite o telefone: ");
		telefone = entrada.nextLine();
		System.out.println("Seus dados: \nNome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone);
		
	}
	
	static void exercicio10() {
		int n1 = 8, n2 = 2, soma = n1*n2;
		System.out.println("Exercício 10 - Soma: " + n1 + " * " + n2 + " = " + soma);
	}
	
	static void exercicio11() {
		double numero = 25;
		System.out.println("Exercício 11 - " + numero);
	}
	
	static void exercicio12() {
		int dividendo = 14;
		int divisor = 2;
		int divisao = dividendo/divisor;
		int resto = dividendo % divisor;
		System.out.println("Exercício 12 - Resultado da divisão: " + divisao + ". Resto: " + resto);
		
	}
	
	static void exercicio13() {
		int n1 = 80;
		int n2 = 59;
		int n3 = 24;
		int n4 = 10;
		int soma = n1+n2+n3+n4;
		System.out.println("Exercício 13 - A soma dos quatros números é: " + soma);
	}
	
	static void exercicio14() {
		int numero, centena, dezena, resto;
		numero = 135;
		centena = numero/100;
		resto = numero % 100;
		dezena = resto/10;
		
		System.out.println("Exercício 14 - A dezena é: " + dezena);
		
	}
	
	static void exercicio15() {
		int numero1, numero2, numero3, media;
		
		System.out.print("Exercício 15 - ");
		
		System.out.print("Digite o primeiro número: ");
		numero1 = entrada.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = entrada.nextInt();
		System.out.print("Digite o terceiro número: ");
		numero3 = entrada.nextInt();
		
		media = (numero1+numero2+numero3)/3;
		System.out.println("Média aritmética é: " + media);
				
	}
	
	static void exercicio16() {
		int numero1, numero2, numero3, media, peso1, peso2, peso3;
		
		System.out.print("Exercício 16 - ");
		
		System.out.print("Digite o primeiro número: ");
		numero1 = entrada.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = entrada.nextInt();
		System.out.print("Digite o terceiro número: ");
		numero3 = entrada.nextInt();
		System.out.print("Digite o peso do primeiro número: ");
		peso1 = entrada.nextInt();
		System.out.print("Digite o peso do segundo número: ");
		peso2 = entrada.nextInt();
		System.out.print("Digite o peso do terceiro número: ");
		peso3 = entrada.nextInt();
		
		int somaNotas = (numero1*peso1)+(numero2*peso2)+(numero3*peso3);
		int somaPesos = (peso1+peso2+peso3);
		media = somaNotas/somaPesos;
		System.out.print("A média ponderada é: " + media);
	}
	
	static void exercicio18() {
		double salario;
		
		System.out.print("Exercício 17 - Insira valor do seu salário: R$");
		salario = entrada.nextDouble();
		salario = salario * 1.25;
		System.out.println("Salário atualizado: R$" + salario);
		

	}
	
	static void exercicio19() {
		double salario, percentualAumento;
		
		System.out.print("Exercício 18 - Insira valor do seu salário: R$");
		salario = entrada.nextDouble();
		System.out.print("Insira o percentual de aumento em decimal: ");
		percentualAumento = entrada.nextDouble();
		percentualAumento = percentualAumento+1;
		salario = salario*percentualAumento;
		System.out.println("Salário atualizado: R$" + salario);
	}
	
	static void exercicio17() {
		double numero;
		
		System.out.print("Exercício 17 - Digite um número: ");
		numero = entrada.nextDouble();
		System.out.print(numero + " ^ 2: " + Math.pow(numero, 2)+ ". Raiz quadrada: " + Math.sqrt(numero));
		
		
	}
	static void exercicio20() {
		double salarioBase;
		double gratificacao = 0.05;
		double imposto = 0.07;
		
		System.out.print("Exercício 20 - Digite seu salário atual: ");
		salarioBase = entrada.nextDouble();
		double desconto = salarioBase * imposto;
		double valorGratificacao = salarioBase * gratificacao;
		double salarioNovo = (salarioBase - desconto) + valorGratificacao;
		System.out.println("Salário atualizado com impostos (7%) e gratificação (5%): R$" + salarioNovo);
	}
	
	static void exercicio21() {
		double salarioBase;
		double gratificacao = 50.0;
		double imposto = 0.10;
		
		System.out.print("Exercício 20 - Digite seu salário atual: ");
		salarioBase = entrada.nextDouble();
		double desconto = salarioBase * imposto;
		double salarioNovo = (salarioBase - desconto) + gratificacao;
		System.out.println("Salário atualizado com impostos (10%) e gratificação (50,00): R$" + salarioNovo);
	}
	
	static void exercicio22() {
		double deposito, taxaJuros, rendimento, rendimentoTotal;
		
		System.out.print("Exercício 21 - Digite o depósito: ");
		deposito = entrada.nextDouble();
		System.out.print("Digite a taxa de juros (em decimal): ");
		taxaJuros = entrada.nextDouble();
		rendimento = deposito * taxaJuros;
		rendimentoTotal = deposito+rendimento;
		System.out.println("Seu rendimento: R$" + rendimento);
		System.out.println("Seu rendimento total: R$" + rendimentoTotal);
		
	}
	
	static void exercicio23() {
		int area, base, altura;
		
		System.out.print("Exercício 22 - Digite a base: ");
		base = entrada.nextInt();
		System.out.print("Digite a altura: ");
		altura = entrada.nextInt();
		area = (base*altura)/2;
		System.out.print("A area do triângulo: " + area);
		
	}
	
	static void exercicio24() {
		final double PI = 3.14159;
		double area, raio;
		
		System.out.print("Exercício 24 - Informe o raio do circulo: ");
		raio = entrada.nextDouble();
		area = PI * Math.pow(raio, 2);
		System.out.println("A area do círculo: " + area);
	
	}
	
	static void exercicio25() {
		double numero;
		
		System.out.print("Exercício 25 - Digite um número: ");
		numero = entrada.nextDouble();
		double resultado = Math.pow(numero,2);
		System.out.println("a- O número digitado ao quadrado: " + resultado);
		resultado = Math.pow(numero, 3);
		System.out.println("b- O número digitado ao cubo: " + resultado);
		resultado = Math.sqrt(numero);
		System.out.println("c- A raiz quadrada do número digitado: " + resultado);
		resultado = Math.cbrt(numero);
		System.out.println("d- A raiz cúbica do número digitado: " + resultado);
		
	}
	
	static void exercicio26() {
		double numero1, numero2;
		
		System.out.print("Exercício 26 - Digite o primeiro número: ");
		numero1 = entrada.nextDouble();
		System.out.print("Digite o segundo número: ");
		numero2 = entrada.nextDouble();
		
		double resultado = Math.pow(numero1, numero2);
		System.out.print("Um elevado ao outro: " + resultado);
	}
	
	static void exercicio27() {
	double pe = 12, jarda = 3, milha = 1760;
	double conversao;
	
	System.out.print("Exercício 27 - Digite um número para ser convertido:");
	double numeroPes = entrada.nextDouble();
	conversao = numeroPes * pe;
	System.out.println("Resultado da conversão de pés para polegadas: " + conversao);
	conversao = numeroPes/jarda;
	System.out.println("Resultado da conversão de pés para jardas: " + conversao);
	conversao = conversao / milha;
	System.out.println("Resultado da conversão de pés para milhas: " + conversao);
	
	}
	
	static void exercicio28() {
		int anoNascimento, anoAtual = 2021;
		
		System.out.println("Exercício 28 - Digite o ano do seu nascimento: ");
		anoNascimento = entrada.nextInt();
		int idade = anoAtual - anoNascimento;
		System.out.println("a- A idade dessa pessoa: " + idade);
		idade = 2050 - anoNascimento;
		System.out.println("b- Quantos anos ela terá em 2050: " + idade);
				
		}
}