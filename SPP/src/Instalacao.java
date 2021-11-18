
public class Instalacao {
	private long idInstalacao;
	private String nome;
	private Endereco localizacao;
	
	//construtor default
	public Instalacao() {
		localizacao = new Endereco();
		nome = "";
		
	}
	
	//construtor com parametros
	public Instalacao(long idLocalizacao, String nome, Endereco localizacao) {
		this.idInstalacao = idLocalizacao;
		this.nome = nome;
		this.localizacao = localizacao;
	}
	
	public Instalacao(long idLocalizacao, String nome) {
		this.idInstalacao = idLocalizacao;
		this.nome = nome;
	}
	
		
	
	
		
	//get 
	public String getNome() { return nome; }
	public Endereco getLocalizacao() { return localizacao; }
	
	//set
	public void setNome(String valor) {
		if(valor != null || valor != "")
			nome = valor;
	}
	
	public void setLocalizacao(Endereco valor) {
		if(valor != null)
			localizacao = valor;
	}
}

	