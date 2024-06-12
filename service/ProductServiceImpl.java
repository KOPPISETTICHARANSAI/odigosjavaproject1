package productmanagement.service;

import java.util.Set;

public class ProductServiceImpl implements ProductService {
 ProductDao dao=new ProductDAOImpl();
	@Override
	public String addProduct(Product product) {
		
		return dao.addProduct(product);
	}

	@Override
	public String updateProduct(Product product) {
		
		return dao.updateProduct(product);
	}

	@Override
	public String deleteProduct(int productId) {
		
		return dao.deleteProduct( productId);
	}

	@Override
	public Product getProductById(int productId) {
		
		return dao.getProductById(productId);
	}

	@Override
	public Set<Product> getAllProducts() {
		
		return dao.getAllProducts();
	}

	@Override
	public Set<Product> getAllProductsByPricerange(int initialPrice, int finalPrice) {
		
		return dao.getAllProductsByPricerange(initialPrice,finalPrice) 
			 ;
	}

	@Override
	public Set<Product> getAllProductsByCategory(String category) {
		
		return dao. getAllProductsByCategory(category);
	}

	@Override
	public Set<Product> getAllProductsByBrandName(String brandName) {
		
		return dao.getAllProductsByBrandName( brandName);
	}
	
}