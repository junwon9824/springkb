package sp0424.bean;

import sp0424.logger.MyLogger;

public class HelloBean {

	private String name;
	// 호출횟수 출력용 객체
	private MyLogger logger;
	private int count = 0;

	public HelloBean() {
		System.out.println("생성자HelloBean()");
	}

	public HelloBean(String name, MyLogger logger) {
		super();
		System.out.println("생성자HelloBean()");
		this.name = name;
		this.logger = logger;
	}
	
	public void myInit() {
		System.out.println("myInit()");
	}

	public String sayHello() {
		logger.print("HelloBean,count = " + count++);
		return "Hello" + (name == null ? "" : " " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// setLogger가 있어야지 logger가 null이 아님.
	public void setLogger(MyLogger logger) {
		this.logger = logger;
	}
}
