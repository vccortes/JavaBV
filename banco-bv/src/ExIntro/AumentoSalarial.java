package ExIntro;

public class AumentoSalarial {

	public static void main(String[] args) {
		double salario = 200;
		if (salario <= 500) {
			salario = salario * 1.2;
			System.out.println("Salário: R$" + salario);
		} else {
			salario = salario * 1.1;
			System.out.println("Salário: R$" + salario);
		}

	}

}
