package model.instrument;

import constant.SongTitle;

public class Piano implements Instrument {

	public void play(SongTitle title) {
		switch(title){
			case RECKONER: 
				System.out.println("reeeeckoneeeeeeeaaaaa aaaa");
			break;
			case I_WAS_BORN_FOR_THIS:
				System.out.println("Stat sua cuique dies");
			break;
			
			case ANALYSE:
				System.out.println("There's no time to analyse");
			break;
		}		
	}

}
