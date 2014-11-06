package logging;

import org.aspectj.lang.ProceedingJoinPoint;

public class Looger {

	// public void invokedMethod(){
	// System.out.println("method was invoked");
	// }
	//
	// public void finishedMethod(){
	// System.out.println("method was finished");
	// }

	public void logMethodInvocation(ProceedingJoinPoint joinPoint) {
		try {
			System.out.println("method invocatoin");
			joinPoint.proceed();
			System.out.println("method finish");
		} catch (Throwable e) {
			System.out.println("exception");
		}

	}
}
