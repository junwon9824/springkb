package sp0425_aop.service;

import org.springframework.stereotype.Component;

@Component
public class HelloService {

	public String sayHello() {
		return "Hello";

	}

	public String sayHello(String name) {
		return "Hello " + name;
	}

	
}
