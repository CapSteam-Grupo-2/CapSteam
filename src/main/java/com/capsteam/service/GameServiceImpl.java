package com.capsteam.service;

import com.capsteam.dao.GameDao;
import com.capsteam.model.GameModel;
import com.ejemplos.spring.model.User;

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
	public void saveGame(GameModel game) {
		gameDao.save(game);

	}
	//Para Listar Todos
	public List<GameModel> getGames(){
		return gameDao.findAll();
	}

}
