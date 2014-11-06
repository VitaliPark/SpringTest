package service;

import org.springframework.beans.factory.annotation.Autowired;

import annotation.CustomImplementation;
import dao.PlayerDao;

public class DefaultPlayerService implements PlayerService {

	@Autowired
	@CustomImplementation
	private PlayerDao PlayerDao;

	public void getPlayer() {
		PlayerDao.getPlayer();
	}

}
