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
		System.out.println("Arg 갯수: " + args.length);

	}

	public void printAfter(Object rtn) {
		System.out.println("** 실행후 **");
		System.out.println("반환값= " + rtn);
	}

}
