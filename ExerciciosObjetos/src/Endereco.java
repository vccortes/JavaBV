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
	/**
	 * 
	 * @param cep
	 * @param tipoLogradouro
	 * @param logradouro
	 * @param complemento
	 * @param bairro
	 * @param cidade
	 * @param estado
	 */
	public Endereco(String cep, String tipoLogradouro, String logradouro, String complemento, String bairro, String cidade, String estado) {
		this.cep = cep;
		this.tipoLogradouro = tipoLogradouro;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	/**
	 * 
	 * @param cep
	 * @param tipoLogradouro
	 * @param logradouro
	 * @param bairro
	 * @param cidade
	 * @param estado
	 */
	public Endereco(String cep, String tipoLogradouro, String logradouro, String bairro, String cidade, String estado) {
		this.cep = cep;
		this.tipoLogradouro = tipoLogradouro;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	/**
	 * 
	 * @param cep
	 * @param tipoLogradouro
	 * @param logradouro
	 * @param complemento
	 * @param bairro
	 * @param cidade
	 * @param estado
	 * @param longitude
	 * @param latitude
	 */
	public Endereco(String cep, String tipoLogradouro,String  logradouro, String complemento, String bairro, String cidade, String estado, double longitude, double latitude) {
		this.cep = cep;
		this.tipoLogradouro = tipoLogradouro;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	
	/**
	 * 
	 * @param longitude
	 * @param latitude
	 */
	public Endereco(double longitude, double latitude) {
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	/**
	 * 
	 * @param cep
	 */
	public Endereco(String cep) {
		this.cep = cep;
	}
	
	//propriedades get
	/**
	 * ontém nome do logradouro
	 * @return nome do logradouro
	 */
	public String getLogradouro() { return logradouro; }
	
	/**
	 * 
	 * @param valor do logradouro
	 */
	public void setLogradouro(String valor) {
		if(valor != null && valor != "")
			logradouro = valor;
	}
	
	public String getTipoLogradouro() { return tipoLogradouro; }
	
	public String getBairro() { return bairro; }
	
	public String getCidade() { return cidade; }
	
	public String getEstado() { return estado; }
	
	/**
	 * 
	 * obtém número do CEP
	 * @return o numero do CEP
	 */
	public String getCep() { return cep; }
	/**
	 * atualizar número do CEP
	 * @param valor
	 */
	public void setCep(String valor) {
		
		valor = valor.trim();
		
		if(valor != null && valor.length() == 8 && valor != "")
			cep = valor;
	}
	
	/**
	 * obtém o complemento
	 * @return complemento
	 */
	public String getComplemento() { return complemento; }
	
	/**
	 * atualiza o complemento
	 * @param valor do complemento
	 */
	public void setComplemento(String valor) {
		if(valor != null)
			complemento = valor;
	}
	
	public double getLongitude() { return longitude; }
	
	public double getLatitude() { return latitude; }
	
	
	//propriedades set
	
	
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
	
	
		
}

