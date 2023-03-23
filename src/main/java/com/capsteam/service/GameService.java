package com.capsteam.service;

import com.capsteam.model.GameModel;

import java.util.List;
import java.util.Optional;

public interface GameService {

    Optional<GameModel> findById(int id);

    List<GameModel> getGames();

    void save(GameModel game);

    void deleteById(int id);

    List<GameModel> findByPublisher(String publisher);
}
