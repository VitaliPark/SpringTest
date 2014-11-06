

import model.musician.Musician;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.PlayerService;

public class EntryPoint {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");
		Musician thom = (Musician)context.getBean("yorke");
		thom.perform();
		
		Musician austin = (Musician)context.getBean("Wintory");
		austin.perform();
		
		Musician justin = (Musician)context.getBean("vernon");
		justin.perform();
		
		PlayerService service = (PlayerService) context
				.getBean("playerService");
		service.getPlayer();
		((ConfigurableApplicationContext) context).close();
	}

}
