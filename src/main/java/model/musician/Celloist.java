package model.musician;

import model.instrument.Instrument;
import constant.SongTitle;

public class Celloist implements Musician{

	private SongTitle title;
	
	private Instrument cello;
	
	public void perform() {
		cello.play(title);
	}

	public void setCello(Instrument cello) {
		this.cello = cello;
	}

	public void setTitle(SongTitle title) {
		this.title = title;
	}
	
	
	
}
