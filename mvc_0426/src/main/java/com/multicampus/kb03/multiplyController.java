package com.multicampus.kb03;

import java.time.LocalTime;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class multiplyController {
	static Random random = new Random();

	static long start;
	static long end;

	@RequestMapping(value = "/multi_calc_game", method = RequestMethod.GET)
	public String simple_calc(Model model, HttpSession session) {
		session.setAttribute("game_seq", 1);
		start = System.currentTimeMillis();

		return "multi_calc_game";

	}

//	, @RequestParam("result") int result, @RequestParam("r1") int r1,
//	@RequestParam("r2") int r2

	private int r1;
	private int r2;

	@RequestMapping(value = "/multi_calc_game_main", method = RequestMethod.GET)
	public String multi_calc_game_main(Model model, HttpSession session) {
		System.out.println("main GET");
		r1 = new java.util.Random().nextInt(9) + 1;
		r2 = new java.util.Random().nextInt(21) + 10;
		model.addAttribute("r1", r1);
		model.addAttribute("r2", r2);

		return "multi_calc_game_main";

	}

	@RequestMapping(value = "/multi_calc_game_main", method = RequestMethod.POST)
	public String multi_calc_game_main_post(Model model, @RequestParam(value = "n1") int n1,
			@RequestParam(value = "n2") int n2, @RequestParam(value = "ans") int ans, HttpSession session) {

		Integer game_seq = (Integer) session.getAttribute("game_seq");

		if (game_seq == 1) {
			start = System.currentTimeMillis();

		}

		game_seq++;
		session.setAttribute("game_seq", game_seq);

		System.out.println("main POST");
		String result = n1 + " * " + n2 + " = " + ans;
		System.out.println("result=" + result);

		if (game_seq == 11) {
			end = System.currentTimeMillis();
			long tot = (end - start) / 1000;
			System.out.println(tot);
			System.out.println("걸린시간" + tot / 60 + "분" + tot % 60 + "초");

		}

		if (n1 * n2 == ans) {
			result += " 정답입니다";

		} else {
			result += " 오답입니다.정답은 " + (n1 * n2);
		}

		model.addAttribute("result", result);
		return multi_calc_game_main(model, session);
	}

}