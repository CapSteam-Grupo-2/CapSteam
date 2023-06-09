package com.capsteam.dao;

import com.capsteam.model.GameModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameDao extends JpaRepository<GameModel,Integer> {
    /**
     * Busca y crea una lista
     * @param publisher : campo por el que se va a buscar
     * @return listado de juegos
     */
    List<GameModel> findByPublisher(String publisher);

}
