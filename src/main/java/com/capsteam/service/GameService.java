package com.capsteam.service;

import com.capsteam.model.GameModel;

import java.util.Optional;

public interface GameService {

	Optional<GameModel> findById(int id);

	void save(GameModel game);

	void deleteById(int id);

}
