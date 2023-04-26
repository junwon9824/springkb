package sp0425_aop.aspect;

import org.aspectj.lang.*;
import org.aspectj.lang.JoinPoint;

public class MyAspect {

	// TODO Auto-generated constructor stub

	public void printBefore(JoinPoint jp) {
		
		System.out.println("Before!!");
		Signature sig = jp.getSignature();
		String name = sig.getName();
		System.out.println("target name" + name);
		Object[] args = jp.getArgs();
		System.out.println("Arg ����: " + args.length);

	}

	public void printAfter(Object rtn) {
		System.out.println("** ������ **");
		System.out.println("��ȯ��= " + rtn);
	}

}
