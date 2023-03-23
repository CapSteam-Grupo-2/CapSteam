package com.capsteam.util;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;

import com.capsteam.dao.GameDao;
import com.capsteam.model.GameModel;
import com.capsteam.service.GameService;
import com.capsteam.service.GameServiceImpl;


public class Utils {
	
	@Autowired
	private GameService service;
	@Autowired
	private GameDao gameDao;
	
	public void leerArchivoCsv() {
		String fileLine;
		String columnsLine[];
		GameModel games = new GameModel("1","2","3","4","5","6","7","8","9","10");
		
	
		gameDao.save(games);
		/*try {
			BufferedReader read = new BufferedReader(new FileReader("./CapSteam/src/main/resources/vgsales.csv"));
			while((fileLine = read.readLine()) !=null) {
				columnsLine = fileLine.split(",");
				
				//GameModel games = new GameModel(Integer.parseInt(columnsLine[0]),columnsLine[1],columnsLine[2],Integer.parseInt(columnsLine[3]),columnsLine[4],columnsLine[5],Integer.parseInt(columnsLine[6]),Integer.parseInt(columnsLine[7]),Integer.parseInt(columnsLine[8]),Integer.parseInt(columnsLine[9]),Integer.parseInt(columnsLine[10]));
				
				//service.save(games);
				
			}
		}catch (Exception e) {
			System.out.println(e);
		}*/
	}
	
}
/*
				for(int i = 0; i< lineObjet.length;i++) {
					System.out.println(lineObjet[i]);
				}
				System.out.println("--------------------");*/
