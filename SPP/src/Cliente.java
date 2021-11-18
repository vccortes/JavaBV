import java.time.LocalDate;

/**
 * 
 * @author vanessa cortes
 *
 */
public class Cliente {
	
	//região dos atributos
	private String nome;
	private String sobrenome;
	private String CPF;
	private char sexo;
	private Endereco enderecoResidencial;
	private String email;
	private String telefone;
	private String celular;
	private LocalDate nascimento; 
	private String apelido;
	
	Pedido[] pedidos;
	
	//região dos construtores
	 public void fazerPedido() {
	   Pedido pedido = new Pedido();
	
	
	 }
	 //construtores personalizado
	 public Cliente(String nome, String sobrenome, String cpf, char sexo, String email, String celular) {
		 this.nome = nome;
		 this.sobrenome = sobrenome;
		 this.CPF = cpf;
		 this.sexo = sexo;
		 this.email = email;
		 this.celular = celular;
		 
	}
	//construtores default
	 public Cliente() {
		 enderecoResidencial = new Endereco();
	 }
	 //propriedades get
	 public String getNome() { return nome; }
	 public String getSobrenome() { return sobrenome; }
	 public String getCPF() { return CPF; }
	 public char getSexo() { return sexo; }
	 public Endereco getEndereco() { return new Endereco();}
	 public String getEmail() { return email; }
	 public String getTelefone() { return telefone; }
	 public String getCelular() { return celular; }
	 public String getApelido() { return apelido; }
	
	//propriedades set
	public void setNome(String valor) {
			if(nome != null)
				nome = valor;
	}
	
	public void setSobrenome(String valor) {
		if(sobrenome != null)
			sobrenome = valor;
	}
	
	public void setCPF(String valor) {
		if(CPF != null)
			CPF = valor;
	}
	public void setSexo(char valor) {
		if(sexo != '\0')
			sexo = valor;
	}
	public void setEndereco(Endereco valor) {
		if(enderecoResidencial != null)
			enderecoResidencial = valor;
	}
	public void setEmail(String valor) {
		if(email != null)
			email = valor;
	}
	public void setTelefone(String valor) {
		if(telefone != null)
			telefone = valor;
	}
	
	public void setCelular(String valor) {
		if(celular != null)
			celular = valor;
	}
	public void setApelido(String valor) {
		if(apelido != null)
			apelido = valor;
	}
	
}
