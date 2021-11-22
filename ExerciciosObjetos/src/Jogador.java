
public class Jogador {
	private String nome;
	private byte idade;
	private double peso;
	private int altura;
	
	public Jogador() {
		super();
		nome = "";
		idade = 15;
	}
	
	public Jogador(String nome, byte idade, double peso, int altura) {
		super();
		
		setNome(nome);
		setIdade(idade);
		
		if(peso >= 0.0 && altura >= 0.0) {
			this.peso = peso;
			this.altura = altura;
		}
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the idade
	 */
	public byte getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(byte idade) {
		if (idade >= 15)
			this.idade = idade;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		if (peso >= 0)
			this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		if (altura >= 0)
			this.altura = altura;
	}
	
	 @Override
	    public String toString() {
	        return nome + ", " + idade + ", " + peso + ", " + altura;
	    }
	
}

	

