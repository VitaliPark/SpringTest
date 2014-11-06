package dao;

import model.Player;

import org.springframework.stereotype.Component;

import annotation.DefaultImplementation;

@Component
@DefaultImplementation
public class DefaultPlayerDao implements PlayerDao {

	public Player getPlayer() {
		System.out.println("default dao omlementation");
		return null;
	}

}
