package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Produto;

public class ProdutoService {
	
	public double filteredSum(List<Produto> list, Predicate<Produto> criteria) {
		double sum = 0.0;
		for (Produto p : list) {
			if(criteria.test(p)) {
				sum += p.getPreco();
			}
		}
		return sum;
	}

}
