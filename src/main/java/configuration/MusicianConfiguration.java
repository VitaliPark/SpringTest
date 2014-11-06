package configuration;

import model.instrument.Instrument;
import model.instrument.Piano;
import model.musician.Musician;
import model.musician.Pianist;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MusicianConfiguration {

	@Bean
	public Instrument piano(){
		return new Piano();
	}
	
	@Bean
	public Musician vernon(){
		Pianist pianist = new Pianist();
		pianist.setPiano(piano());
		return pianist;
	}
}
