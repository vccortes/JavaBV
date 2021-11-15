package ExEstruturaCont;

public class CondicionalSimples {
//	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		condicionalSimples1();
		condicionalSimples2();
	}
	
	static void condicionalSimples1() {
		int x = 12;
		int y = 7;
		
		if(x > y) {
			System.out.println("x é maior que y");
		}
	}
	
	static void condicionalSimples2() {
		boolean emMovimento = true;
		short velocidade = 100;
		short velocidadeAtual = 0;
		
		if(emMovimento && velocidade > 80) {
			velocidadeAtual--;
			System.out.println("Reduzindo a velocidade!");
		}
	}
}
