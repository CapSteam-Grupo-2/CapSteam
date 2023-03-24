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
	
    /**
     * Busca el juego por id y devuelve el objeto juego
     * @param id : id del juego
     * @return el objeto juego con el id buscado
     */
	@Override
	public Optional<GameModel> findById(int id) {
		return gameDao.findById(id);
	}
	
    /**
     * Recibe un objeto juego y lo guarda
     * @param game : objeto juego
     */
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

    /**
     * Elimina el objeto juego a partir del id recibido
     * @param id : id del juego
     */
	@Override
	public void deleteById(int id) {
		gameDao.deleteById(id);
	}

    /**
     * Crea una lista de juegos filtrados por el publisher recibido
     * @param publisher : publisher por el que se quiere filtrar
     * @return la lista filtrada
     */
	@Override
	public List<GameModel> findByPublisher(String publisher) {
		return gameDao.findByPublisher(publisher);
	}

}
