package multicampus.kb03.mvc0503;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

//	@RequestMapping

	@GetMapping("/greeting/{name}")
	public ModelAndView greeting(@PathVariable String name) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "이름:::: " + name);
		mav.setViewName("greeting");

		return mav;
	}
	
	

//	
//	@GetMapping("/greeting/{name}")
//	public String greeting(@PathVariable String name, Model model) {
//		
//		model.addAttribute("msg", "이름: " + name);
//		
//		return "greeting";
//		
//	}

//	@PostMapping

	
	
}
