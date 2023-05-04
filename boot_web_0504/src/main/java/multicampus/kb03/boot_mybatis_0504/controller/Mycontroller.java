package multicampus.kb03.boot_mybatis_0504.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mycontroller {

	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("msg", "반갑습니다");

		return "hello";
	}
	
}
