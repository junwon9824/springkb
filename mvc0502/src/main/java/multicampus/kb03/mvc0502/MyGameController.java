package multicampus.kb03.mvc0502;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyGameController {

	@GetMapping("/number_guess")
	public String number_guess() {

		return "number_guess";
	}

}
