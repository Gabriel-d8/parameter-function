package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import model.services.ProductServices;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
	
		list.add(new Product("TV", 1200.00));
		list.add(new Product("Mouse", 65.90));
		list.add(new Product("Tablet", 310.00));
		list.add(new Product("HD Case", 70.90));
		
		ProductServices ps = new ProductServices();
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		
		System.out.println("Sum of products that start with the letter 'T': R$" + String.format("%.2f", sum));
		
	}

}