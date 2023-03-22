package com.capsteam.service;

import com.capsteam.dao.GameDao;
import com.capsteam.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameDao gameDao;

    @Override
    public Optional<Game> findById(long id) {
        return gameDao.findById(id);
    }
}
