package com.capsteam;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capsteam.model.GameModel;
import com.capsteam.service.GameService;

@SpringBootTest
public class GameControllerTest {

	@Autowired
	private GameService service;

	void listGames() throws Exception {
		List<GameModel> list;
		assertNotEquals(null, service.getGames());

	}
}
