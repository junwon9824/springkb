package sp0424.logger;

import org.springframework.stereotype.Component;

@Component("screen")
public class MyScreenLogger implements MyLogger{
	
	public void print(String str) {
		System.out.println("[Screen] "+str);
	}

}
