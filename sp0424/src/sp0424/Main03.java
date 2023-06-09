package sp0424;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sp0424.bean.HelloBean;
import sp0424.bean.MyCalc;
import sp0424.bean.NumberGuess;

public class Main03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		MyCalc mc = context.getBean(MyCalc.class); // 하나면 반환, 없거나 여러개 있으면 오류
		int r = mc.plus(30, 40);
		System.out.println(r);
		
		System.out.println("** 숫자맞추기  게임 for SpringFW **");
		System.out.println("1~100 사이 컴퓨터의 숫자를 맞춰 보세요");
		NumberGuess ng = context.getBean("ng", NumberGuess.class); //component("ng") >> component의 id
																// 이름 안 붙여도 자동으로 제공된다. (첫글자 소문자인 클래스명으로)
		
//		NumberGuess ng = context.getBean("ng", NumberGuess.class); >> id를 이용해 먼저 찾고 형변환시킨다.
//		NumberGuess ng = context.getBean(NumberGuess.class); >> NumberGuess 클래스를 먼저 찾고 하나일 때만 반환
		
		
		System.out.println("정답 : "+ng.getAnswer());
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1~100사이 숫자를 입력하세요: ");
			int userNum = sc.nextInt();
			String result = ng.checkNum(userNum);
			System.out.println(userNum + " " + result);
			if (result.startsWith("정답입니다")) {
				System.out.println("정답입니다.");
				break;
			}
			else {
				System.out.println(result);
			}
		}//end while

	}
}
