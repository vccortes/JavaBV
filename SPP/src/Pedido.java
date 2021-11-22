import java.time.LocalDate;
import java.time.LocalDateTime;


public class Pedido {
	private double valorDoFrete;
	private String idPedido;
	private LocalDateTime dataVenda;
	private LocalDate previsaoEntrega;
	private LocalDateTime dataEntrega;
	private double desconto;
	private Endereco enderecoEntrega;
	private Produto[] produto;
	private String formaPagamento;
	
	public Pedido(String idPedido, double valorDoFrete, double desconto) {
		this.idPedido = idPedido;
		this.valorDoFrete = valorDoFrete;
		this.desconto = desconto;
		
	}
	
	/**
	 * @return the valorDoFrete
	 */
	public double getValorDoFrete() {
		return valorDoFrete;
	}

	
	/**
	 * @return the idPedido
	 */
	public String getIdPedido() {
		return idPedido;
	}

	

	/**
	 * @return the dataVenda
	 */
	public LocalDateTime getDataVenda() {
		return dataVenda;
	}

	/**
	 * @param dataVenda the dataVenda to set
	 */
	public void setDataVenda(LocalDateTime dataVenda) {
		this.dataVenda = dataVenda;
	}

	/**
	 * @return the previsaoEntrega
	 */
	public LocalDate getPrevisaoEntrega() {
		return previsaoEntrega;
	}

	/**
	 * @param previsaoEntrega the previsaoEntrega to set
	 */
	public void setPrevisaoEntrega(LocalDate previsaoEntrega) {
		this.previsaoEntrega = previsaoEntrega;
	}

	/**
	 * @return the dataEntrega
	 */
	public LocalDateTime getDataEntrega() {
		return dataEntrega;
	}

	/**
	 * @param dataEntrega the dataEntrega to set
	 */
	public void setDataEntrega(LocalDateTime dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	/**
	 * @return the enderecoEntrega
	 */
	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	/**
	 * @param enderecoEntrega the enderecoEntrega to set
	 */
	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	/**
	 * @return the produto
	 */
	public Produto[] getProduto() {
		return produto;
	}

	/**
	 * @param produto the produto to set
	 */
	public void setProduto(Produto[] produto) {
		this.produto = produto;
	}

	/**
	 * @return the formaPagamento
	 */
	public String getFormaPagamento() {
		return formaPagamento;
	}

	/**
	 * @param formaPagamento the formaPagamento to set
	 */
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	/**
	 * @param desconto the desconto to set
	 */
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	/**
	 * @param valorDoFrete
	 * @param idPedido
	 * @param dataVenda
	 * @param previsaoEntrega
	 * @param dataEntrega
	 * @param desconto
	 * @param enderecoEntrega
	 * @param produto
	 * @param formaPagamento
	 */
	public Pedido(double valorDoFrete, String idPedido, LocalDateTime dataVenda, LocalDate previsaoEntrega,
			LocalDateTime dataEntrega, double desconto, Endereco enderecoEntrega, Produto[] produto,
			String formaPagamento) {
		super();
		this.valorDoFrete = valorDoFrete;
		this.idPedido = idPedido;
		this.dataVenda = dataVenda;
		this.previsaoEntrega = previsaoEntrega;
		this.dataEntrega = dataEntrega;
		this.desconto = desconto;
		this.enderecoEntrega = enderecoEntrega;
		this.produto = produto;
		this.formaPagamento = formaPagamento;
	}

	public Pedido() {
		enderecoEntrega = new Endereco();
	}
	
	//get
	 public double getDesconto() {
			return desconto;
	}
	 
	 //set
	 public void setDesconto(Double valor) {
			if(desconto != 0)
				desconto = valor;
	}
	
	
}
