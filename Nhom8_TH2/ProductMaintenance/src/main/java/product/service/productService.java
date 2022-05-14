package product.service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import product.domain.product;
import product.exception.ProductNotFoundException;
import product.repository.productRepository;

@Service
public class productService {
	@Autowired
	private productRepository productRepository;
	public static String codeString;
	public List<product> listAll(){
		return (List<product>) productRepository.findAll();
	}
	public void save(product product) {
		productRepository.save(product);
	}
	public product get(String code) {
		Optional<product> resultOptional = productRepository.findById(code);
		codeString=code;
			return resultOptional.get();
	}
	public void delete(String code) {
		productRepository.deleteById(code);
	}
}
