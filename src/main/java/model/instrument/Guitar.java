package model.instrument;

import org.springframework.stereotype.Component;

import constant.SongTitle;

@Component(value="guitar")
public class Guitar implements Instrument {

	public void play(SongTitle title) {
		switch(title){
			case RECKONER: 
				System.out.println("reeeeckoneeeeeeeaaaaa aaaa");
			break;
			case I_WAS_BORN_FOR_THIS:
				System.out.println("Stat sua cuique dies");
			break;
			
		}
	}
	
	
}
