import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		LocalDate nascimento = LocalDate.now();
		
		Endereco enderecoEntrega = new Endereco();
		Instalacao instalacao = new Instalacao();
		Pedido pedido = new Pedido();
		
		
		Produto[] produtos = new Produto[100000];
		
		Pedido[] listaDePedidos = new Pedido[20];
		
		System.out.print(nascimento);

	    LocalDate localDate = LocalDate.parse("12/06/1989", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	    System.out.println(localDate.toString());
	    
	    Produto iphone = new Produto(1,"Iphone 11", 5000,"Celular com 64GB");
		Produto maquinaDeLavar = new Produto(2,"Lavadora Samsung",3500,"Máquina com capacidade de 13kg");
		
		System.out.println(iphone.getNome()+" - "+iphone.getDescricao());
		
		Produto p = new Produto(); 
		
		System.out.println(iphone.getNome());
		iphone.setNome("Iphone 12");
		System.out.println(iphone.getNome());
		
		//Cliente
		Cliente clienteNovo = new Cliente("Vanessa","Cortes","000.000.000-00",'F',"vanessa@outlook.com","46000000");
		System.out.println(clienteNovo.getNome());
		clienteNovo.setNome("Jaqueline");
		System.out.println(clienteNovo.getNome());
		
		//Pedido
		Pedido pedidoNovo = new Pedido("A001",25,5);
		System.out.println(pedidoNovo.getDesconto());
		pedidoNovo.setDesconto(7.0);
		System.out.println(pedidoNovo.getDesconto());
 		
//		Cliente cliente = new Cliente();
//		Endereco endereco = new Endereco();
//		Instalacao instalacao = new Instalacao();
//		Pedido pedido = new Pedido();
//		Produto produto = new Produto();
//		
		//Instalacao
		Instalacao deposito = new Instalacao(1,"CD - Guarulhos");
		Instalacao deposito2 = new Instalacao(1,"CD - Guarulhos", enderecoEntrega);
		String nomeDeposito = deposito2.getNome();
		System.out.println(nomeDeposito);
		
		//produto
		Produto notebook = new Produto(423,"Notebook Dell",4000,150);
		
		System.out.println(notebook.getNome());
		System.out.println(notebook.getQdteEstoque());
		
		notebook.setQtdeEstoque(50);
		
		System.out.println(notebook.getNome());
		System.out.println(notebook.getQdteEstoque());
		
		for(int i = 0; i < 25; i++) {
			notebook.diminuirEstoque();
		}
		
		System.out.println(notebook.getNome());
		System.out.println(notebook.getQdteEstoque());
		
		
	}

}
