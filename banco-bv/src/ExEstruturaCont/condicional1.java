package ExEstruturaCont;

public class condicional1 {
	public static void main(String[] args) {
		double notaFinal = 60.75;
		String resultado = "";
		//operador ternário
		resultado = (notaFinal >= 70.00) ? "Aprovado" : "Reprovado";
		System.out.println(resultado);
		// outra forma:
		String resultadoNovo = "";
		if (notaFinal >= 70.00) {
			resultadoNovo = "Aprovado";
		} else {
			resultadoNovo = "Reprovado";
			System.out.print(resultadoNovo);
		}
	}
}
