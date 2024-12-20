package senac;

public class Produto {
	// Atributos da classe
	private String nome;
	private double preco;
	private int quantidade;
	
	//Construtor Padrão
	public Produto() {
		
	}
	
	//Construtor Parametrizado
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
		public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		
	}
	
	//Metodos Getters e Setters
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	} 
	
	public void setPreco(double preço) {
		this.preco = preco;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	//Metodos da classe 
	public String exibirDetalhes(){
	return "Nome: " + nome +"  " + "Preço:" + preco +" " +"quantidade:"+quantidade;
	
	}
 	//Metodo para retornar a receita monetaria do produto
	public double receitaMonetaria() {
		return preco * quantidade;
	

		

	}

}
