package productmanagement.service;

import java.util.Set;

import productmanagement.model.Product;

public interface ProductService {
	public abstract String addProduct(Product product);
	
	public abstract String updateProduct(Product product);
	
	public abstract String deleteProduct(int productId);
	
	public abstract Product getProductById(int productId);
	
	public abstract Set<Product>getAllProducts();
	
	public abstract Set<Product>getAllProductsByPricerange(int initialPrice, int finalPrice);
	
	public abstract Set<Product>getAllProductsByCategory(String category);
	
	public abstract Set<Product>getAllProductsByBrandName(String brandName);
	

}

}
