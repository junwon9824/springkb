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
			return "�����ּ���";
		if (userNum < answer)
			return "�����ּ���";
		else
			return "�����Դϴ�";
	}

}