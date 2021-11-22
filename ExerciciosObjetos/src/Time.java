
public class Time {
	
	private String nome;
	private Jogador[] jogadores;
	
	private double mediaIdade;
	private double mediaAltura;
	private double mediaPeso;
	
	public static final int NUMERO_DE_JOGADORES = 11;

	/**
	 * 
	 */
	public Time() {
		super();
	}

	/**
	 * @param nome
	 * @param jogadores
	 */
	public Time(String nome, Jogador[] jogadores) {
		super();
		this.nome = nome;
		this.jogadores = jogadores;
		atualizarMedias();
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
	 * @return the jogadores
	 */
	public Jogador[] getJogadores() {
		return jogadores;
	}

	/**
	 * @param jogadores the jogadores to set
	 */
	public void setJogadores(Jogador[] jogadores) {
		this.jogadores = jogadores;
		atualizarMedias();
	}

	/**
	 * @return the mediaIdade
	 */
	public double getMediaIdade() {
		return mediaIdade;
	}

	/**
	 * @return the mediaAltura
	 */
	public double getMediaAltura() {
		return mediaAltura;
	}

	/**
	 * @return the mediaPeso
	 */
	public double getMediaPeso() {
		return mediaPeso;
	}
	
	private void atualizarMedias() {
		
		byte[] idades = new byte[NUMERO_DE_JOGADORES];
		
		int[] alturas = new int[NUMERO_DE_JOGADORES];
		
		double[] pesos = new double[NUMERO_DE_JOGADORES];
		
		for(int i = 0; i < this.jogadores.length; i++) {
			alturas[i] = jogadores[i].getAltura();
			idades[i] = jogadores[i].getIdade();
			pesos[i] = jogadores[i].getPeso();
		}
		
		mediaPeso = calcularMedia(pesos);
		mediaAltura = calcularMedia(alturas);
		mediaIdade = calcularMedia(idades);
	}
	

	private double calcularMedia(double[] numeros) {
		
		double media = 0.0;
		double somaNumeros = 0.0;
		int totalNumeros = numeros.length;
		
		for(int i = 0; i < numeros.length; i++){
			somaNumeros += numeros[i];
		}
		
		media = somaNumeros/totalNumeros;
		return media;
		
		
		}
	
	 private double calcularMedia(int[] numeros) {

	        double media = 0.0;
	        double somaNumeros = 0.0;
	        int totalNumeros = numeros.length;


	        for (int i = 0; i < numeros.length; i++)
	            somaNumeros += numeros[i];


	        media = somaNumeros / totalNumeros;

	        return media;
	
	 }
	 
	 private double calcularMedia(byte[] numeros) {

	        double media = 0.0;
	        double somaNumeros = 0.0;
	        int totalNumeros = numeros.length;


	        for (int i = 0; i < numeros.length; i++)
	            somaNumeros += numeros[i];


	        media = somaNumeros / totalNumeros;

	        return media;

	    } // Fim do método calcularMedia
}
