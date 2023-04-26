package com.multicampus.kb03;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NumberGuess {

	private int res = new java.util.Random().nextInt(100) + 1;

	@RequestMapping("/number_guess")
	public String number_guess(@RequestParam(value = "n1", required = false, defaultValue = "-1") int n1, Model model) { // 핸들러

		if (n1 == -1) {

			model.addAttribute("msg", "숫자입력해라"); // request에 전달

			return "number_guess";
		}

		// 메서드
		String msg = n1 + " ";

		if (res < n1)
			msg += "낮춰";
		else if (res > n1)
			msg += "올려";
		else
			msg += "정답";

		model.addAttribute("msg", msg); // request에 전달

		return "number_guess";

	}

}
