package entities;

public class Produto {
	
	private String nome;
	private Double preco;
	
	public Produto() {
	}
	
	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public static boolean staticProdutoPredicate(Produto p) {
		return p.getPreco() >= 100.0;
	}
	
	public boolean nonStaticProdutoPredicate() {
		return preco >= 100.0;
	}
	
	public static void staticPriceUpdate(Produto p) {
		p.setPreco(p.getPreco() * 1.1);
	}
	
	public void nonStaticPriceUpdate() {
		setPreco(getPreco() * 1.1); 
	}
	
	public static String staticUpperCaseName(Produto p) {
		return p.getNome().toUpperCase();
	}
	
	public String nonStaticUpperCaseName() {
		return nome.toUpperCase();
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + String.format("%.2f", preco) + "]";
	}
	
	
	
	

}
