package sp0424.bean;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("ng")
public class NumberGuess {
	
	private int answer;
	
	public NumberGuess() {
		int r = new Random().nextInt(100) + 1;
		this.setAnswer(r);
	}

	public NumberGuess(int answer) {
		super();
		this.answer = answer;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	public String checkNum(int userNum) {
		if (userNum > answer)
			return "낮춰주세요";
		if (userNum < answer)
			return "높여주세요";
		else
			return "정답입니다";
	}

}
