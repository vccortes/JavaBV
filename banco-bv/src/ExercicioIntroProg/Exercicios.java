package ExercicioIntroProg;

import java.util.Scanner;

public class Exercicios {
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Exerc�cios - Introdu��o � Programa��o \n----------------------------------------");
		
//		exercicio1();
//		exerc�cio2();
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
		System.out.print("Exerc�cio 1 - ");
		System.out.println("Ol� Mundo!");
	}
	
	static void exerc�cio2() {
		System.out.print("Exerc�cio 2 - ");
		String nomeC = "Vanessa Cuevas Cortes";
		System.out.println(nomeC);
	}
	
	static void exercicio3() {
		String frase = "Exerc�cio 3 - "+"A programa��o � aprendida escrevendo programas\r\n"
				+ "(Brian Kernighan)";
		System.out.println(frase);
	}
	
	static void exercicio4() {
		int n1 = 25, n2 = 27, produto = (n1*n2);
		System.out.println("Exerc�cio 4 - Produto de: " + n1 + " * " + n2 + ": " + produto);
	}
	
	static void exercicio5() {
		double n1, n2, n3, media;
		n1 = 4;
		n2 = 12;
		n3 = 15;
		media = (n1 + n2 + n3)/3;
		System.out.printf("Exerc�cio 5 - M�dia: %.2f", media);
		System.out.println("");
	}
	
	static void exercicio6() {
//		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		
		System.out.print("Exerc�cio 6 - ");
		System.out.print("Digite um n�mero: ");
		numero = entrada.nextInt();
		System.out.println("O n�mero digitad foi: " + numero);
	}

	static void exercicio7() {
		int n1, n2;
		n1 = 13;
		n2 = 26;
		System.out.println("Exerc�cio 7 - n�mero 1: " + n1 + ". numero 2: " + n2);
	}
	
	static void exercicio8() {
		int n1 = 75;
		int ant = n1-1;
		int suc = n1+1;
		System.out.println("Exerc�cio 8 - N�mero atual: " + n1  + ". Sucessor: " + suc + ". Antecessor: " + ant);
	}
	static void exercicio9() {
		String nome;
		String endereco = "";
		String telefone = "";
		System.out.print("Digite seu nome: ");
		entrada.nextLine();
		nome = entrada.nextLine();
		System.out.print("Digite seu endere�o: ");
		endereco = entrada.nextLine();
		System.out.print("Digite o telefone: ");
		telefone = entrada.nextLine();
		System.out.println("Seus dados: \nNome: " + nome + "\nEndere�o: " + endereco + "\nTelefone: " + telefone);
		
	}
	
	static void exercicio10() {
		int n1 = 8, n2 = 2, soma = n1*n2;
		System.out.println("Exerc�cio 10 - Soma: " + n1 + " * " + n2 + " = " + soma);
	}
	
	static void exercicio11() {
		double numero = 25;
		System.out.println("Exerc�cio 11 - " + numero);
	}
	
	static void exercicio12() {
		int dividendo = 14;
		int divisor = 2;
		int divisao = dividendo/divisor;
		int resto = dividendo % divisor;
		System.out.println("Exerc�cio 12 - Resultado da divis�o: " + divisao + ". Resto: " + resto);
		
	}
	
	static void exercicio13() {
		int n1 = 80;
		int n2 = 59;
		int n3 = 24;
		int n4 = 10;
		int soma = n1+n2+n3+n4;
		System.out.println("Exerc�cio 13 - A soma dos quatros n�meros �: " + soma);
	}
	
	static void exercicio14() {
		int numero, centena, dezena, resto;
		numero = 135;
		centena = numero/100;
		resto = numero % 100;
		dezena = resto/10;
		
		System.out.println("Exerc�cio 14 - A dezena �: " + dezena);
		
	}
	
	static void exercicio15() {
		int numero1, numero2, numero3, media;
		
		System.out.print("Exerc�cio 15 - ");
		
		System.out.print("Digite o primeiro n�mero: ");
		numero1 = entrada.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		numero2 = entrada.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		numero3 = entrada.nextInt();
		
		media = (numero1+numero2+numero3)/3;
		System.out.println("M�dia aritm�tica �: " + media);
				
	}
	
	static void exercicio16() {
		int numero1, numero2, numero3, media, peso1, peso2, peso3;
		
		System.out.print("Exerc�cio 16 - ");
		
		System.out.print("Digite o primeiro n�mero: ");
		numero1 = entrada.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		numero2 = entrada.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		numero3 = entrada.nextInt();
		System.out.print("Digite o peso do primeiro n�mero: ");
		peso1 = entrada.nextInt();
		System.out.print("Digite o peso do segundo n�mero: ");
		peso2 = entrada.nextInt();
		System.out.print("Digite o peso do terceiro n�mero: ");
		peso3 = entrada.nextInt();
		
		int somaNotas = (numero1*peso1)+(numero2*peso2)+(numero3*peso3);
		int somaPesos = (peso1+peso2+peso3);
		media = somaNotas/somaPesos;
		System.out.print("A m�dia ponderada �: " + media);
	}
	
	static void exercicio18() {
		double salario;
		
		System.out.print("Exerc�cio 17 - Insira valor do seu sal�rio: R$");
		salario = entrada.nextDouble();
		salario = salario * 1.25;
		System.out.println("Sal�rio atualizado: R$" + salario);
		

	}
	
	static void exercicio19() {
		double salario, percentualAumento;
		
		System.out.print("Exerc�cio 18 - Insira valor do seu sal�rio: R$");
		salario = entrada.nextDouble();
		System.out.print("Insira o percentual de aumento em decimal: ");
		percentualAumento = entrada.nextDouble();
		percentualAumento = percentualAumento+1;
		salario = salario*percentualAumento;
		System.out.println("Sal�rio atualizado: R$" + salario);
	}
	
	static void exercicio17() {
		double numero;
		
		System.out.print("Exerc�cio 17 - Digite um n�mero: ");
		numero = entrada.nextDouble();
		System.out.print(numero + " ^ 2: " + Math.pow(numero, 2)+ ". Raiz quadrada: " + Math.sqrt(numero));
		
		
	}
	static void exercicio20() {
		double salarioBase;
		double gratificacao = 0.05;
		double imposto = 0.07;
		
		System.out.print("Exerc�cio 20 - Digite seu sal�rio atual: ");
		salarioBase = entrada.nextDouble();
		double desconto = salarioBase * imposto;
		double valorGratificacao = salarioBase * gratificacao;
		double salarioNovo = (salarioBase - desconto) + valorGratificacao;
		System.out.println("Sal�rio atualizado com impostos (7%) e gratifica��o (5%): R$" + salarioNovo);
	}
	
	static void exercicio21() {
		double salarioBase;
		double gratificacao = 50.0;
		double imposto = 0.10;
		
		System.out.print("Exerc�cio 20 - Digite seu sal�rio atual: ");
		salarioBase = entrada.nextDouble();
		double desconto = salarioBase * imposto;
		double salarioNovo = (salarioBase - desconto) + gratificacao;
		System.out.println("Sal�rio atualizado com impostos (10%) e gratifica��o (50,00): R$" + salarioNovo);
	}
	
	static void exercicio22() {
		double deposito, taxaJuros, rendimento, rendimentoTotal;
		
		System.out.print("Exerc�cio 21 - Digite o dep�sito: ");
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
		
		System.out.print("Exerc�cio 22 - Digite a base: ");
		base = entrada.nextInt();
		System.out.print("Digite a altura: ");
		altura = entrada.nextInt();
		area = (base*altura)/2;
		System.out.print("A area do tri�ngulo: " + area);
		
	}
	
	static void exercicio24() {
		final double PI = 3.14159;
		double area, raio;
		
		System.out.print("Exerc�cio 24 - Informe o raio do circulo: ");
		raio = entrada.nextDouble();
		area = PI * Math.pow(raio, 2);
		System.out.println("A area do c�rculo: " + area);
	
	}
	
	static void exercicio25() {
		double numero;
		
		System.out.print("Exerc�cio 25 - Digite um n�mero: ");
		numero = entrada.nextDouble();
		double resultado = Math.pow(numero,2);
		System.out.println("a- O n�mero digitado ao quadrado: " + resultado);
		resultado = Math.pow(numero, 3);
		System.out.println("b- O n�mero digitado ao cubo: " + resultado);
		resultado = Math.sqrt(numero);
		System.out.println("c- A raiz quadrada do n�mero digitado: " + resultado);
		resultado = Math.cbrt(numero);
		System.out.println("d- A raiz c�bica do n�mero digitado: " + resultado);
		
	}
	
	static void exercicio26() {
		double numero1, numero2;
		
		System.out.print("Exerc�cio 26 - Digite o primeiro n�mero: ");
		numero1 = entrada.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		numero2 = entrada.nextDouble();
		
		double resultado = Math.pow(numero1, numero2);
		System.out.print("Um elevado ao outro: " + resultado);
	}
	
	static void exercicio27() {
	double pe = 12, jarda = 3, milha = 1760;
	double conversao;
	
	System.out.print("Exerc�cio 27 - Digite um n�mero para ser convertido:");
	double numeroPes = entrada.nextDouble();
	conversao = numeroPes * pe;
	System.out.println("Resultado da convers�o de p�s para polegadas: " + conversao);
	conversao = numeroPes/jarda;
	System.out.println("Resultado da convers�o de p�s para jardas: " + conversao);
	conversao = conversao / milha;
	System.out.println("Resultado da convers�o de p�s para milhas: " + conversao);
	
	}
	
	static void exercicio28() {
		int anoNascimento, anoAtual = 2021;
		
		System.out.println("Exerc�cio 28 - Digite o ano do seu nascimento: ");
		anoNascimento = entrada.nextInt();
		int idade = anoAtual - anoNascimento;
		System.out.println("a- A idade dessa pessoa: " + idade);
		idade = 2050 - anoNascimento;
		System.out.println("b- Quantos anos ela ter� em 2050: " + idade);
				
		}
}