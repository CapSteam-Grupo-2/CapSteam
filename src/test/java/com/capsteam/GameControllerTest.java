package com.capsteam;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import com.capsteam.model.GameModel;
import com.capsteam.service.GameService;

@SpringBootTest
public class GameControllerTest {
	
/*
	Autowired
	GameService service;
	
	
	 	void listGames() throws Exception {
	 		
	 	List<GameModel> games;
	 	when(service.getGames()).thenReturn( games);
	 	
		mockMvc.perform(get("/css/estilos.css"))
			   .andDo(print())
			   .andExpect(status().isOk());
	}
	*/
	
}
