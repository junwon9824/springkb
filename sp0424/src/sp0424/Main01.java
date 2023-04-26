package sp0424;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sp0424.bean.HelloBean;

public class Main01 {
//	������ ������ �ڵ�
//	public static void main(String[] args) {
//		HelloBean hb = new HelloBean();
//		String msg = hb.sayHello();
//		System.out.println(msg);
//	}
	
//	������ ���� �ڵ�
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// �갡 xml�� �о ��ü���� ��������. �⺻�����ڵ��� ȣ��.(�⺻�����ڰ� �־�ߵ�!)
		
//		HelloBean hb = (HelloBean)context.getBean("hb");
//		HelloBean hb = context.getBean(HelloBean.class);	//HelloBeanŸ���� �ϳ��� �ƴϸ� ���� �߻� 
		HelloBean hb = context.getBean("hb",HelloBean.class);
 
		String msg = hb.sayHello();
		System.out.println(msg);
		
	}
}