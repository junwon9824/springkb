package multicampus.kb03.boot0503;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Boot0503Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Boot0503Application.class, args);
		Greet greet = context.getBean(Greet.class);
		System.out.println(greet.greeting());

	}

	@Autowired
	private Greet greet;

	public void execute() {
		System.out.println(greet.greeting());
	}
}
