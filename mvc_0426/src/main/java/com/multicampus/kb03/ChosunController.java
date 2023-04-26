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
public class ChosunController {

	static String[] CHO = { "ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ", "ㄹ", "ㅁ", "ㅂ", "ㅃ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ", "ㅍ",
			"ㅎ" };

	static String[] JOONG = { "ㅏ", "ㅐ", "ㅑ", "ㅒ", "ㅓ", "ㅔ", "ㅕ", "ㅖ", "ㅗ", "ㅘ", "ㅙ", "ㅚ", "ㅛ", "ㅜ", "ㅝ", "ㅞ", "ㅟ", "ㅠ",
			"ㅡ", "ㅢ", "ㅣ" };

	static String[] JONG = { "", "ㄱ", "ㄲ", "ㄳ", "ㄴ", "ㄵ", "ㄶ", "ㄷ", "ㄹ", "ㄺ", "ㄻ", "ㄼ", "ㄽ", "ㄾ", "ㄿ", "ㅀ", "ㅁ", "ㅂ",
			"ㅄ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ" };

	@RequestMapping(value = "/chosun_game", method = RequestMethod.GET)
	public String chosun_game(Model model) {

		return "chosun_game";

	}

	static String ans = "국민은행";

//	, @RequestParam("result") int result, @RequestParam("r1") int r1,
//	@RequestParam("r2") int r2

	@RequestMapping(value = "/chosun_game_main", method = RequestMethod.GET)
	public String chosun_game_main(Model model) {

		System.out.println("main GET");
		String str = "ㄱㅁㅇㅎ";
		System.out.println("str" + str);

		model.addAttribute("str", str);
		model.addAttribute("ans", ans);

		return "chosun_game_main";

	}

	@RequestMapping(value = "/chosun_game_main", method = RequestMethod.POST)
	public String chosun_game_main_post(Model model, @RequestParam(value = "userans") String userans) {

		int cnt = 0;

		for (int i = 0; i < ans.length(); i++) {
			char uniVal = ans.charAt(i);
			char uniVal2 = userans.charAt(i);

			// 한글일 경우만 시작해야 하기 때문에 0xAC00부터 아래의 로직을 실행한다
			if (uniVal >= 0xAC00) {

				uniVal = (char) (uniVal - 0xAC00);
				uniVal2 = (char) (uniVal2 - 0xAC00);

				char cho = (char) (uniVal / 28 / 21);
				char joong = (char) ((uniVal) / 28 % 21);
				char jong = (char) (uniVal % 28); // 종성의 첫번째는 채움이기 때문에

				char cho2 = (char) (uniVal2 / 28 / 21);
				char joong2 = (char) ((uniVal2) / 28 % 21);
				char jong2 = (char) (uniVal2 % 28); // 종성의 첫번째는 채움이기 때문에

				if (cho == cho2 && joong == joong2 && jong == jong2) {
					cnt++;
				}

				System.out.println(CHO[cho2] + JOONG[joong2] + JONG[jong2]);

			}

		}

		if (cnt == ans.length()) {

			model.addAttribute("result", userans + ":" + "정답입니다.");
			System.out.println("정답입니다.");
		}

		else {
			model.addAttribute("result", userans + ":" + cnt + "개 맞춤.");

			System.out.println(cnt + "개 맞춤.");
		}

		System.out.println("main POST");
		return chosun_game_main(model);

	}

}