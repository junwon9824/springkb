package multicampus.kb03.boot0503;

import org.springframework.stereotype.Component;

@Component
public class MorningGreet implements Greet {

	@Override
	public String greeting() {
		// TODO Auto-generated method stub
		return "Good Morning";
	}

}
