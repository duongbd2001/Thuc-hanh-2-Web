package product.controller;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.weaver.NewConstructorTypeMunger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import product.domain.product;
import product.exception.ProductNotFoundException;
import product.service.productService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private productService productService;

	@GetMapping("/view")
	public String view(Model model) {
		List<product> list = productService.listAll();
		model.addAttribute("list", list);
		return "view";
	}
	@GetMapping("/add")
	public String showAddForm(Model model) {
		model.addAttribute("product", new product());
		return "add";
	}
	@PostMapping("/save")
	public String saveProduct(product product) {
		productService.save(product);
		return "redirect:/product/view";
	}
	@GetMapping("/edit/{code}")
	public String showEditForm(@PathVariable ("code") String code,Model model){
			product product= productService.get(code);
			model.addAttribute("product", product);
			return "edit";	
	}
	@PostMapping("/edit")
	public String editProduct(product product) {
		product.setCode(productService.codeString);
		productService.save(product);
		return "redirect:/product/view";
	}
	@GetMapping("/delete/{code}")
	public String showDeleteForm(@PathVariable ("code") String code,Model model){
		product product= productService.get(code);
		model.addAttribute("product", product);
		return "delete";
	}
	@GetMapping("/delete")
	public String deleteProduct(product product) {
		product.setCode(productService.codeString);
		productService.delete(productService.codeString);
		return "redirect:/product/view";
	}
}
