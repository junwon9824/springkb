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

		MyCalc mc = context.getBean(MyCalc.class); // �ϳ��� ��ȯ, ���ų� ������ ������ ����
		int r = mc.plus(30, 40);
		System.out.println(r);
		
		System.out.println("** ���ڸ��߱�  ���� for SpringFW **");
		System.out.println("1~100 ���� ��ǻ���� ���ڸ� ���� ������");
		NumberGuess ng = context.getBean("ng", NumberGuess.class); //component("ng") >> component�� id
																// �̸� �� �ٿ��� �ڵ����� �����ȴ�. (ù���� �ҹ����� Ŭ����������)
		
//		NumberGuess ng = context.getBean("ng", NumberGuess.class); >> id�� �̿��� ���� ã�� ����ȯ��Ų��.
//		NumberGuess ng = context.getBean(NumberGuess.class); >> NumberGuess Ŭ������ ���� ã�� �ϳ��� ���� ��ȯ
		
		
		System.out.println("���� : "+ng.getAnswer());
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1~100���� ���ڸ� �Է��ϼ���: ");
			int userNum = sc.nextInt();
			String result = ng.checkNum(userNum);
			System.out.println(userNum + " " + result);
			if (result.startsWith("�����Դϴ�")) {
				System.out.println("�����Դϴ�.");
				break;
			}
			else {
				System.out.println(result);
			}
		}//end while

	}
}