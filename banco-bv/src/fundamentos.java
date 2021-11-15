
public class fundamentos {
	public static void main(String[] args){
		  double notaFinal = 60.75;
		    String resultado = "";
		    resultado = (notaFinal >= 70.00) ? "Aprovado" : "Reprovado";
		    System.out.println(resultado);
		    //outra forma:
		    String resultadoNovo = "";
		    if(notaFinal >= 70.00) {
		    	resultadoNovo = "Aprovado";
		    } else {
		    	resultadoNovo = "Reprovado";
		    	System.out.print(resultadoNovo);
		  }
	}
}

