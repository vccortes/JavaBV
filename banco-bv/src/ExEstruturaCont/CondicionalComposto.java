package ExEstruturaCont;

public class CondicionalComposto {

	public static void main(String[] args) {
		condicionalComposto1();
	}
		static void condicionalComposto1() {
			byte hora = 7;
			if(hora < 12) {
				System.out.println("Bom dia");
			} else if (hora < 18) {
				System.out.println("Boa tarde");
			} else {
				System.out.println("Boa noite");
			}
		}

}


