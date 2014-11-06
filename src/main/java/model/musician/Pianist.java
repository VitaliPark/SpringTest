package model.musician;

import constant.SongTitle;
import model.instrument.Instrument;

public class Pianist implements Musician{

	private Instrument piano;
	
	public void setPiano(Instrument piano) {
		this.piano = piano;
	}

	public void perform() {
		piano.play(SongTitle.ANALYSE);
	}

}
