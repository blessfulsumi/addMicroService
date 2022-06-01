package mypkg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mypkg.entity.Product;
import mypkg.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired

	private ProductRepository repository;

//	public Product saveProduct(Product p) {
//		// TODO Auto-generated method stub
//		return repository.save(p);
//	}

	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Product getProductByID(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}
}
