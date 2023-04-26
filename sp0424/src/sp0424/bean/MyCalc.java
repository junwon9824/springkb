package sp0424.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import sp0424.logger.MyLogger;

@Component
public class MyCalc {
	@Autowired //setLogger�ʿ� ����.
	@Qualifier(value="myFileLogger")
	private MyLogger logger; //interface�� ����Ŭ������ ã�Ƽ� �־���.

	public int plus(int i, int j) {
		logger.print(i+"+"+j+"=");
		return i + j;
	}

}