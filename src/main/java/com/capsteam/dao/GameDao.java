package com.capsteam.dao;

import com.capsteam.model.GameModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameDao extends JpaRepository<GameModel,Integer> {
    /**
     *
     * @param publisher
     * @return
     */
    List<GameModel> findByPublisher(String publisher);

}
