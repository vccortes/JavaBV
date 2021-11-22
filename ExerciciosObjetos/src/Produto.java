
public class Produto {
	
	private String idProduto;
	private String nome;
	private String categoria;
	private double peso;
	private double preco;
	private double altura;
	private double largura;
	private double comprimento;
	private String marca;
	private String modelo;
	
	
	public Produto() {
		idProduto = "";
		nome = "";
		categoria = "";
		peso = 0.0;
		preco = 0.0;
		altura = 0.0;
		largura = 0.0;
		comprimento = 0.0;
		marca = "";
		modelo = "";
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	
	public Produto(String idProduto, String nome, String categoria, double preco, double altura, double largura, double comprimento, double peso) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
		this.peso = peso;
	} 
	
	public Produto(String idProduto, String nome, double preco, double altura, double largura, double comprimento, double peso) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
		this.peso = peso;
	}
	
		
	public double getPreco() {return preco; }
	public double getAltura() {return altura; }
	public double getLargura() {return largura; }
	public double getComprimento() {return comprimento; }
	public double getPeso() {return peso; }
	
	//dúvida, colocar as propriedades do get que estão na classe ou de todos os atributos??
	
	public String getNome() { return nome; }
	public String getCategoria() { return categoria; }
	public String getMarca() { return marca; }
	public String getModelo() { return modelo; }
	public String getIdProduto() {return idProduto;}
	
	
	
}
