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
