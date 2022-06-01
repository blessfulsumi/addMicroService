package mypkg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import mypkg.entity.Product;
import mypkg.service.ProductService;

@RestController
public class AddController {
//	@Bean
//	@LoadBalanced
//	public RestTemplate getRestTemplate() {
//		return new RestTemplate();
//	}
	@Autowired
	private ProductService service;
	
//	
//	@GetMapping("/prod")
//	public String products()
//	{ 
//		return "hi welcome to my product discovery";
//	}
////	
//	@PostMapping("/addProduct")
//	public Product addProduct(@RequestBody Product p) {
//		return service.saveProduct(p);
//	}
//	
	@GetMapping("/products")
	public List<Product> findAllProducts(){
		return service.getProducts();
	}
	
	@GetMapping("/pid/1")
	public Product findProductById() {
		return service.getProductByID(1);
	}


}
