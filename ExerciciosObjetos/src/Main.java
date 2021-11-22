import java.util.Random;

public class Main {

	static final int NUMERO_DE_TIMES = 5;
	
	static Time[] times;
	
	/**
     * Carrega os times dos campeonatos
     */	
	static void carregarTimes() {

        times = new Time[NUMERO_DE_TIMES];

        for (int i = 0; i < times.length; i++) {

            String nomeTime = "Time " + (i + 1);
            Jogador[] jogadores = criarJogadores(Time.NUMERO_DE_JOGADORES);

            times[i] = new Time(nomeTime, jogadores); // Cria um time

        }
 
    }
	
	static Jogador[] criarJogadores(int quantidade) {

        Jogador[] jogadores = new Jogador[quantidade];

        for (int i = 0; i < jogadores.length; i++)
            jogadores[i] = criarJogador((i+1));

        
        
        return jogadores;
    }
	
	 /**
     * Cria um novo jogador aleatório
     * @return um novo jogador
     */
	
	static Jogador criarJogador(int codigo) {
		
		Random geradorNumeroAleatorios = new Random();
		
		String nome = "Jogador" + codigo;
		byte  idade = (byte) (geradorNumeroAleatorios.nextInt((40-15)) +15);
		double peso = geradorNumeroAleatorios.nextDouble() * 100;
		int altura = geradorNumeroAleatorios.nextInt((210 - 100)) + 100;
		
		Jogador jogador = new Jogador(nome, idade, peso, altura);
		
		return jogador;
	}
	
	
	
	static void imprimirJogador(Jogador jogador, int numero) {
		System.out.println("Nome: " + jogador.getNome() + numero);
		System.out.println("Idade: " + jogador.getIdade() + " anos" );
		System.out.println("Peso: " + jogador.getPeso() + " kg");
		System.out.println("Altura: " + jogador.getAltura() + " cm");
		System.out.println();
		
//		System.out.printf("%.2f", jogador.getPeso());
//		System.out.println();
	}
	
	static void imprimirTime(Time time) {
		System.out.println(time.getNome());
		for (int i = 0; i < time.getJogadores().length; i++) {
			System.out.println(time.getJogadores()[i].toString());
		}
    }
	
	static int contarTotalMenorDeIdade(Time[] times) {

        int total = 0;

        for (int i = 0; i < times.length; i++) {

            Jogador[] jogadores = times[i].getJogadores();

            for (int j = 0; j < jogadores.length; j++) {

                if (jogadores[j].getIdade() < 18)
                    total++;
            }

        }
 
        return total;
    }
	
	static double calcularMediaGlobalAltura(Time[] times) {

        double media = 0.0;
        double alturaTotal = 0.0;
        double totalJogadores = NUMERO_DE_TIMES * Time.NUMERO_DE_JOGADORES;

        for (int i = 0; i < times.length; i++) {

            Jogador[] jogadores = times[i].getJogadores();

            for (int j = 0; j < jogadores.length; j++) {

                alturaTotal += jogadores[j].getAltura();
 
            } // Fim for j

        } // Fim for i


        media = alturaTotal / totalJogadores;

        return media;
 
    }

	static int contarMaioresOitentaKilos(Time[] times) {

        int total = 0;

        for (int i = 0; i < times.length; i++) {

            Jogador[] jogadores = times[i].getJogadores();

            for (int j = 0; j < jogadores.length; j++) {

                if (jogadores[j].getPeso() > 80.00)
                    total++;
            }

        }
 
        return total;

    }
	
	public static void main(String[] args) {
		
		
//		for(int i = 0; i < 11; i++) {
//			
//			Jogador jogador = criarJogador();
//			imprimirJogador(jogador, (i + 1));
//		}
//		
		
			
		
//		
//		Jogador[] jogadoresTime1 = new Jogador[Time.NUMERO_DE_JOGADORES];
//		Jogador[] jogadoresTime2 = new Jogador[Time.NUMERO_DE_JOGADORES];
//		Jogador[] jogadoresTime3 = new Jogador[Time.NUMERO_DE_JOGADORES];
//		Jogador[] jogadoresTime4 = new Jogador[Time.NUMERO_DE_JOGADORES];
//		Jogador[] jogadoresTime5 = new Jogador[Time.NUMERO_DE_JOGADORES];
//		
//		for(int i = 0; i < Time.NUMERO_DE_JOGADORES; i++) {
//			jogadoresTime1[i] = criarJogador();
//			jogadoresTime2[i] = criarJogador();
//			jogadoresTime3[i] = criarJogador();
//			jogadoresTime4[i] = criarJogador();
//			jogadoresTime5[i] = criarJogador();
//		}
		
//		Time time1 = new Time("Time 1", jogadoresTime1);
//		Time time2 = new Time("Time 2", jogadoresTime2);
//		Time time3 = new Time("Time 3", jogadoresTime3);
//		Time time4 = new Time("Time 4", jogadoresTime4);
//		Time time5 = new Time("Time 5", jogadoresTime5);
		
//		System.out.println(time1.getNome());
//		System.out.println(time1.getMediaPeso());
//		System.out.println(time1.getMediaAltura());
//		System.out.println(time1.getMediaIdade());
//		System.out.println(time1.getJogadores());
		
		
		// calcular qtde de jogadores menor de idade
		
		
		
//		int menorIdadeTime1 = totalMenorDeIdades(time1.getJogadores());
//		int menorIdadeTime2 = totalMenorDeIdades(time2.getJogadores());
//		int menorIdadeTime3 = totalMenorDeIdades(time3.getJogadores());
//		int menorIdadeTime4 = totalMenorDeIdades(time4.getJogadores());
//		int menorIdadeTime5 = totalMenorDeIdades(time5.getJogadores());
		
		
//		int totalMenorDeIdade = menorIdadeTime1 + menorIdadeTime2 + menorIdadeTime3 + menorIdadeTime4 + menorIdadeTime5;		
		
		
		carregarTimes();
		

        for(int i = 0; i < times.length; i++) {
        	
        	System.out.println();
        	
        	imprimirTime(times[i]);
        	
        	System.out.println();
        	
	
        	System.out.println("Média de idade: " + times[i].getMediaIdade());
        	
        }
        // Média de altura 
        System.out.println("Média de Altura = " + calcularMediaGlobalAltura(times));

        // Calcular quantidade de jogadores menor de idade
        int totalMenorIdade = contarTotalMenorDeIdade(times);
        System.out.println("\nTotal Menor de Idade = " + totalMenorIdade);


        // Quantos por cento dos jogadores tem mais de 80kgs
        // Passo 1: contar quantos jogadores tem mais de 80kgs.
        double totalAcimaPeso = contarMaioresOitentaKilos(times);
        double totalJogadores = NUMERO_DE_TIMES * Time.NUMERO_DE_JOGADORES;

        double porcentagemAcimaDoPeso = ((totalAcimaPeso / totalJogadores) * 100);

        System.out.println("Acima do Peso = " + porcentagemAcimaDoPeso);
        	
//            Jogador[] jogadores = times[i].getJogadores();

//            for(int j = 0; j < jogadores.length; j++) {
//
//                if (jogadores[j].getIdade() < 18)
//                    totalMenorIdade++;
// 
//            }
 
        

       
	}
        
//		System.out.println("Total Menor de Idade: " + totalMenorDeIdade);
//		
		
		}
	
//		static int totalMenorDeIdades(Jogador[] jogadores) {
//			int total = 0;
//			
//			for (int i = 0; i <jogadores.length;i++) {
//				if(jogadores[i].getIdade() < 18)
//					total++;
//			}
//			
//			return total;
//		}
		
	
		
		
		

		/*
		Produto notebook = new Produto("Notebook Dell", 5000);
		Produto blusa = new Produto("Brusinha", 5000);
		
		ItemDeVenda item1 = new ItemDeVenda(notebook, 1);
		ItemDeVenda item2 = new ItemDeVenda(blusa, 5);
		
		ItemDeVenda[] carrinhoDeCompras = {item1,item2};
		
		for(int i = 0; i < carrinhoDeCompras.length; i++) {
			String nomeProduto = carrinhoDeCompras[i].getProduto().getNome();
			double preco = carrinhoDeCompras[i].getProduto().getPreco();
			
			System.out.println(nomeProduto);
			System.out.println(preco);
			
			System.out.println();
		
			
			

		}
		ImprimirCupomFiscal(carrinhoDeCompras);
		ImprimirTotal(carrinhoDeCompras);
		
	}
////		public static final String NUM_TIMES= 5;
//		Endereco endereco = new Endereco("04675000", "Av." , "Brasil", "Vila Romanópolis", "Ferraz de Vasconcelos", "São Paulo");
//		
//		System.out.println(endereco);
//		
//		
	static void ImprimirCupomFiscal(ItemDeVenda[] itensDeVenda) {
		System.out.println();
		
		
		System.out.println("Cupom Fiscal");
		System.out.print("\n Nº | Nome | Preço | Qtde | Subtotal |");
		System.out.print("\n--------------------------------------");
		
		for(int i = 0; i < itensDeVenda.length; i++ ) {
			
			int numero = (i + 1);
			String nome = itensDeVenda[i].getProduto().getNome();
			double preco = itensDeVenda[i].getProduto().getPreco();
			int quantidade = itensDeVenda[i].getQtde();
			double subtotal = itensDeVenda[i].getSubTotal();
			
			System.out.print("\n" + numero);
			System.out.print(" " + nome);
			System.out.print("  R$ " + preco);
			System.out.print("  " + quantidade);
			System.out.print("  R$" + subtotal);
			
			System.out.println();
		}
		System.out.println();
	}
	
	static void ImprimirTotal(ItemDeVenda[] numeros) {
		//complete aqui!
//		System.out.println();
	}
	
}*/





