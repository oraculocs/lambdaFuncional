package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Produto;
import model.services.ProdutoService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 1500.0));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 400.00));
		list.add(new Produto("HD Case", 80.90));
		
		//Implementação de uma Classe anônima
//		Comparator<Produto> comp = new Comparator<Produto>() {
//
//			@Override
//			public int compare(Produto p1, Produto p2) {
//				return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
//			}
//			
//		};
		
		//Implementação de Função anônima
//		Comparator<Produto> comp = (p1, p2) ->{
//			return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
//		};
		
		Comparator<Produto> comp = (p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
		
		list.sort(comp);
		
		//list.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));
		
		//list.sort(new MyComparator());
		
		for(Produto p : list) {
			System.out.println(p);
		}
		
		System.out.println("------------------------------------------------------------------------");
		
		//list.removeIf(p -> p.getPreco() >= 100);
		
		//list.removeIf(new ProdutoPredicate());
		
//		list.removeIf(Produto::staticProdutoPredicate);
		
		//list.removeIf(Produto::nonStaticProdutoPredicate);
		
		//Predicate<Produto> pred = p -> p.getPreco() >= 100.0;
		
		//list.removeIf(pred);
		
//		list.removeIf(p -> p.getPreco() >= 100.0);
//		
//		for (Produto produto : list) {
//			System.out.println(produto);
//		}
		
		System.out.println("----------------------------------------------------------------------------");
		
		//list.forEach(new PriceUpdate());
		
		//list.forEach(Produto::staticPriceUpdate);
		
		//list.forEach(Produto::nonStaticPriceUpdate);
		
//		Consumer<Produto> cons = p -> {
//			p.setPreco(p.getPreco() * 1.1);
//		};
		
		//list.forEach(System.out::println);
		
		//list.forEach(cons);
		
		//list.forEach(System.out::println);
		
//		list.forEach(p -> p.setPreco(p.getPreco() * 1.1));
//		
//		list.forEach(System.out::println);
		
		System.out.println("----------------------------------------------------------------------------");
		
//		List<String> nomes = list.stream().map(new UpperCaseNome()).collect(Collectors.toList());
		
		//List<String> nomes = list.stream().map(Produto::staticUpperCaseName).collect(Collectors.toList());
		
		//List<String> nomes = list.stream().map(Produto::nonStaticUpperCaseName).collect(Collectors.toList());
		
//		Function<Produto, String> func = p -> p.getNome().toUpperCase();
//		
//		List<String> nomes = list.stream().map(func).collect(Collectors.toList());
		
//		List<String> nomes = list.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());
//		
//		nomes.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------------");
		
		ProdutoService ps = new ProdutoService();
		double sum = ps.filteredSum(list, p -> p.getPreco() < 100);
		
		System.out.println("Sum = " + String.format("%.2f", sum));
		
		
	}

}
