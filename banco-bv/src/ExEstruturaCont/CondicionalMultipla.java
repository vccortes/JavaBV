package ExEstruturaCont;

public class CondicionalMultipla {

	public static void main(String[] args) {
//		multipla1();
		multipla2();

	}

//	static void multipla1() {
//		char operador = '+';
//		
//
//		switch (operador) {
//
//		case '+':
//			somar();
//			break;
//		case '-':
//			subtrair();
//			break;
//		case '*':
//			multiplicar();
//			break;
//		case '/':
//			dividir();
//			break;
//		default:
//			System.err.println("Operador inválido");
//		}
//
//	}

	static void multipla2() {
		int dia = 1;
		String diaDaSemana = "";

		switch (dia) {
		case 1:
			diaDaSemana = "Domingo";
			break;
		case 2:
			diaDaSemana = "Segunda-feira";
			break;
		case 3:
			diaDaSemana = "Terça-feira";
			break;
		case 4:
			diaDaSemana = "Quarta-feira";
			break;
		case 5:
			diaDaSemana = "Quinta-feira";
			break;
		case 6:
			diaDaSemana = "Sexta-feira";
			break;
		case 7:
			diaDaSemana = "Sábado";
			break;
		default:
			diaDaSemana = "Dia inválido";
			break;
		}
	}

}
