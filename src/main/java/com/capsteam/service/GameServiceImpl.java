package com.capsteam.service;

import com.capsteam.dao.GameDao;
import com.capsteam.model.GameModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	private GameDao gameDao;

	@Override
	public Optional<GameModel> findById(int id) {
		return gameDao.findById(id);
	}

	@Override
	public void save(GameModel game) {
		gameDao.save(game);
	}

	public List<GameModel> getGames(){
		return gameDao.findAll();
	}

	@Override
	public void deleteById(int id) {
		gameDao.deleteById(id);
	}

}
