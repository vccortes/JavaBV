package ExFund;

public class estreitamento2 {

	public static void main(String[] args) {
		short anoAtual = 2020;
		short anoNascimento = 1989;
		byte idadeAtual = 0;
		
		idadeAtual = (byte) (anoAtual - anoNascimento);
		System.out.println("Idade atual = " + idadeAtual);

	}

}
