package enteties_impl;
import java.util.Arrays;
import java.util.List;

import enteties.Cart;
import enteties.Product;

public class DefaultCart implements Cart {

	private static final int DEFAULT_PRODUCT_CAPACITY = 10;
	private Product[] products;
	List<Product> nonNullProducts ;
	private int lastIndex;
	
	{
		products = new Product[DEFAULT_PRODUCT_CAPACITY];
	}
	
	@Override
	public boolean isEmpty() {
		if (products == null || products.length == 0) {
			return true;
		}
		
		for (Product product : products) {
			if (product != null) {
				return false;
			}
		}
		
		return true;
	}

	@Override
	public void addProduct(Product product) {
		if (product == null) {
			return;
		}
		/*
		 * lastIndex  = 0 ; 
		 * when adding a new product u make lastIndex++;
		 * when the lastIndex reaches 10 or the default product capacity
		 * u creat a new array with twice the length of the old one and u keep adding products and increament lastINdex
		 * until it reaches the maximum again 
		 */
		if (products.length <= lastIndex) {
			products = Arrays.copyOf(products, products.length << 1);
		}
		products[lastIndex++] = product;
	}

	@Override
	public Product[] getProducts() {	
		
		for (Product product : products) {
			if (product != null) {
				addProduct(product);
			}
		}
		
		
		return products;
	}

	@Override
	public void clear() {
		products = new Product[DEFAULT_PRODUCT_CAPACITY];
	}

}
