package productmanagement.dao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import productmanagement.model.Product;

public class ProductDAOImpl implements ProductDao {
	HashMap<Integer,Product>products = new HashMap<Integer,Product>
	
	public String addProduct(Product product) {
		products.put(product.getProductByid(),product);
		return "product saved successfully with id:"+ product.getProductid();
	}
  public String updateProduct(Product product) {
	products.put(product.getProductid(),product);
	return "product updated sucessfully";
}
  public String deleteProduct(int productId) {
	products.remove(productId);
	return "product deleted sucessfully";
  
  public Product getProductById(int productId) {
		return products.get(productId);
	}
	public Set<Product>getallproducts(){
		Set<Integer>keys=products.keySet();
		HashSet<Product> values= new HashSet<Product>();
		
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext()) {
			int key = itr.next();
			Product product = products.get(key);
			values.add(product);
		}
		return values;
	}
	 public Set<Product> getAllProductsByPricerange(int initialPrice,int FinalPrice){
		 Set<Integer> keys = products.keySet();
		 HashSet<Product> values= new HashSet<Product>();
		 
		 Iterator<Integer>itr =keys.iterator();
		 while(itr.hasNext()) {
			 int key=itr.next();
			 Product product = products.get(key);
			 int actualPrice;
		 }
		

  
  
  
  
  
}
	@Override
	public productmanagement.service.String addProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public productmanagement.service.String updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public productmanagement.service.String deleteProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Set<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Set<Product> getAllProductsByCategory(productmanagement.service.String category) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Set<Product> getAllProductsByBrandName(productmanagement.service.String brandName) {
		// TODO Auto-generated method stub
		return null;
	}
