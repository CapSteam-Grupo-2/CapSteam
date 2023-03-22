package com.capsteam.service;

import com.capsteam.model.GameModel;

import java.util.List;
import java.util.Optional;

public interface GameService {

	Optional<GameModel> findById(int id);

	void saveGame(GameModel game);
	
	 List<GameModel> getGames();
}
