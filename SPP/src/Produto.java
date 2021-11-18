
public class Produto {
	private long id;
	private String nome;
	private String descricao;
	private double peso;
	private String cor;
	private double preco;
	private double precoCusto;
	private String unidadeMedida;
	private double altura;
	private double largura;
	private double comprimento;
	private String grade;
	private String marca;
	private String modelo;
	private byte avalicao;
	private String genero;
	
	private Instalacao localizacao;
	private int qtdeEstoque;
	
	 
	  
	//regi�o dos construtores
	// inicializar um novo produto com par�metro id, nome, preco e descri��o.
	public Produto(long id, String nome, double preco, String descricao) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}
	
	
	// inicializar um novo produto com par�metro id, nome, preco e qtdeEstoque.
	public Produto(long id, String nome, double preco, int qtdeEstoque) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.qtdeEstoque = qtdeEstoque;
	}
	
	//construturo default (sem par�metros) podendo deixar tudo em branco ou apenas trazer de forma padr�o como ex abaixo.
	// inicializar um novo produto sem parametro.
	public Produto() {
		localizacao = new Instalacao();
		nome = "";
	}
	
	public String getNome() {return nome; }
//	public String getDescricao() {return descricao; }
//	public double getPeso() {return peso; }
//	public String getNome() {return nome; }
//	public String getNome() {return nome; }
//	public String getNome() {return nome; }
//	public String getNome() {return nome; }
	
	public void setNome(String valor) {
		if(valor !=null)
			nome = valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getQdteEstoque() {return qtdeEstoque;}
	
	public void setQtdeEstoque(int quantidade) {
		qtdeEstoque += quantidade;
	}
	
	public void aumentarEstoque() {
		qtdeEstoque++;
	}
	
	public void diminuirEstoque() {
		qtdeEstoque--;
	}
}

