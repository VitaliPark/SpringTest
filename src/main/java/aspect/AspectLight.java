package aspect;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component("as")
public class AspectLight {
	
	@Pointcut(" execution(* model.instrument.Instrument.play(..)) ")
	public void start(){}
	
	@Before("start()")
	public void turunOnTheLight(){
		System.out.println("light is on");
	}
	
	@After("start()")
	public void turnOffTheLight(){
		System.out.println("light is off");
	}
}
