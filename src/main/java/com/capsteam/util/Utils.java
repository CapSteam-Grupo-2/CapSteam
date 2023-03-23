package com.capsteam.util;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;

import com.capsteam.model.GameModel;
import com.capsteam.service.GameService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Utils {
	
	@Autowired
	private GameService service;

	
	public void leerArchivoCsv() {
		String fileLine;
		String columnsLine[];
		try {
			BufferedReader read = new BufferedReader(new FileReader("./src/main/resources/vgsales.csv"));
			while((fileLine = read.readLine()) !=null) {
				columnsLine = fileLine.split(",");
				
				
				GameModel games = new GameModel();//columnsLine[1],columnsLine[2],columnsLine[3],columnsLine[4],columnsLine[5],Integer.parseInt(columnsLine[6]),Integer.parseInt(columnsLine[7]),Integer.parseInt(columnsLine[8]),Integer.parseInt(columnsLine[9]),Integer.parseInt(columnsLine[10]));
				System.out.println(games.toString());
				log.info("juego: ",games.toString());
				service.save(games);
				
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
/*
				for(int i = 0; i< lineObjet.length;i++) {
					System.out.println(lineObjet[i]);
				}
				System.out.println("--------------------");*/