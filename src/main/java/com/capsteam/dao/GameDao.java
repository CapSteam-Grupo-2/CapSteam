package com.capsteam.dao;

import com.capsteam.model.GameModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameDao extends JpaRepository<GameModel,Integer> {

}
