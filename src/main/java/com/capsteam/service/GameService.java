package com.capsteam.service;

import com.capsteam.model.Game;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

public interface GameService {

    Optional<Game> findById(long id);
}
