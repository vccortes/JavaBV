/**
 * 
 * 
 * @author vanessa cortes
 * 
 */

public class Endereco {
	private String logradouro; 
	private String tipoLogradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String complemento;
	private double latitude;
	private double longitude;
	
	
	//construtores:
	//construtor default.
	public Endereco() {
		logradouro = "";
		tipoLogradouro = "";
		bairro = "";
		cidade = "";
		estado = "";
		cep = "";
		complemento = "";
		latitude = 0.0;
		longitude = 0.0;
	}
	//construtores com parâmteros.
	public Endereco(String cep, String tipoLogradouro, String logradouro, String complemento, String bairro, String cidade, String estado) {
		this.cep = cep;
		this.tipoLogradouro = tipoLogradouro;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public Endereco(String cep, String tipoLogradouro, String logradouro, String bairro, String cidade, String estado) {
		this.cep = cep;
		this.tipoLogradouro = tipoLogradouro;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public Endereco(double longitude, double latitude) {
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public Endereco(String cep) {
		this.cep = cep;
	}
	
	//propriedades get
	public String getLogradouro() { return logradouro; }
	public String getTipoLogradouro() { return tipoLogradouro; }
	public String getBairro() { return bairro; }
	public String getCidade() { return cidade; }
	public String getEstado() { return estado; }
	public String getCep() { return cep; }
	public String getComplemento() { return complemento; }
	public double getLongitude() { return longitude; }
	public double getLatitude() { return latitude; }
	
	//propriedades set
	public void setLogradouro(String valor) {
		if(valor != null || valor != "")
			logradouro = valor;
	}
	
	public void setTipoLogradouro(String valor) {
		if(valor != null || valor != "")
			tipoLogradouro = valor;
	}
	public void setBairro(String valor) {
		if(valor != null || valor != "")
			bairro = valor;
	}
	public void setCidade(String valor) {
		if(valor != null || valor != "")
			cidade = valor;
	}
	public void setEstado(String valor) {
		if(valor != null || valor != "")
			estado = valor;
	}
	public void setCep(String valor) {
		if(valor != null || valor != "")
			cep = valor;
	}
	public void setComplemento(String valor) {
		if(valor != null || valor != "")
			complemento = valor;
	}
	public void setLongitude(double valor) {
		if(valor != 0.0)
			longitude = valor;
	}
	public void setLatitude(double valor) {
		if(valor != 0.0)
			latitude = valor;
	}
	
	@Override
	public String toString() {
		return this.tipoLogradouro + " " +this.logradouro + " - " +this.bairro +", " +this.cidade + " - " + this.estado + ", " + this.cep;
	}	
	
	
	public static void main(String[] args) {
		Endereco endereco = new Endereco("04675000", "Av." , "Brasil", "Vila Romanópolis", "Ferraz de Vasconcelos", "São Paulo");
		
		System.out.println(endereco);

	}

	
}

