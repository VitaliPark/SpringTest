package model.musician;

import model.instrument.Instrument;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import constant.SongTitle;

@Component(value="yorke")
public class Guitarist implements Musician{

	private SongTitle songTitle;
	
	@Autowired
	@Qualifier("guitar")
	private Instrument guitar;
	

	@Value("#{T(constant.SongTitle).RECKONER}")
	public void setSongTitle(SongTitle songTitle) {
		this.songTitle = songTitle;
	}

	public Guitarist() {
		super();
	}

	public void perform() {
		guitar.play(songTitle);
	}
	
	

}
