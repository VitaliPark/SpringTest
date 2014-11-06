package dao;

import model.Player;

import org.springframework.stereotype.Component;

import annotation.CustomImplementation;

@Component
@CustomImplementation
public class CustomPlayerDao implements PlayerDao {

	public Player getPlayer() {
		System.out.println("custom dao omlementation");
		return null;
	}

}
