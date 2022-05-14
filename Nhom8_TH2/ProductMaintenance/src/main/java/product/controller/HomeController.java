package product.controller;

import org.springframework.core.type.filter.AbstractClassTestingTypeFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("")
	public String home() {
		return "home";
	}
}
