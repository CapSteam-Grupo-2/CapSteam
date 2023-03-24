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
	/**
	 * El me metodo trae todo el listado de juegos.
	 * @return Devuelve la lista de juegos..
	 */
	@Override
	public List<GameModel> getGames(){
		return gameDao.findAll();
	}

	@Override
	public void deleteById(int id) {
		gameDao.deleteById(id);
	}
	
	@Override
	public List<GameModel> findByPublisher(String publisher) {
		return gameDao.findByPublisher(publisher);
	}

}
