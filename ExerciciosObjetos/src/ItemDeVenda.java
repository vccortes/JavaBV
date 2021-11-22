
public class ItemDeVenda {
	private Produto produto;
	private int quantidade;
	private double subtotal;
	
	
	public ItemDeVenda() {
		Produto produto = new Produto();
		quantidade = 0;
		subtotal = 0.0;
	}
	
	public ItemDeVenda(Produto produto, int quantidade) {
		this.produto = produto;
		setQtde(quantidade);
		this.subtotal = calcularSubTotal();
	}
	
	//get
	
	public Produto getProduto() { return produto; }
	
	
	
	public int getQtde() { return quantidade; }
	
	public void setQtde(int valor) {
		if(valor != 0)
			quantidade = valor;
	}
	
	public double getSubTotal() { return calcularSubTotal(); }
	
	public void atualizaProduto(Produto produto, int quantidade) {
		if(produto != null) {
			this.produto = produto;
//			this.setQtde(quantidade);
		}
	}
		
	
	private double calcularSubTotal() {
		return produto.getPreco()*quantidade;
	}

	private void setProduto(Produto valor) {
		if(valor != null)
			produto = valor;
		
	}
	
	
	
//	public static void main(String[] args) {
//		Produto produto = new Produto("A01", "IPHONE 11" , 4500, 0.45, 0.25, 1.25, 150);
//		ItemDeVenda iv = new ItemDeVenda(produto,180);
//		
//		System.out.println(produto);
//		System.out.println(produto.getNome()+"-"+produto.getIdProduto()+"-"+produto.getPreco()+"-"+produto.getAltura()+"-"+produto.getLargura()+"-"+produto.getComprimento()+"-"+iv.quantidade);
//		
//	}
	
	
}
