package com.capsteam.service;

import com.capsteam.model.GameModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ReadServiceImpl implements ReadService {

    public List<String> readFileCsv() {
        List<String> games = new ArrayList<>();
        try {
            BufferedReader read = new BufferedReader(new FileReader("./src/main/resources/vgsales.csv"));
            read.readLine();
            String linea;
            while ((linea = read.readLine()) != null) {
                games.add(linea);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return games;
    }

    private String[] splitString(String value) {
        return value.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
    }

    @Override
    public GameModel parseModelfromString(String gameData) {
        var game = splitString(gameData);
        return GameModel.builder()
                .id(Integer.parseInt(game[0]))
                .name(game[1])
                .platform(game[2])
                .year(game[3].contains("N") ? 0 : Integer.parseInt(game[3]))
                .genre(game[4])
                .publisher(game[5])
                .na_sales(Double.parseDouble(game[6]))
                .eu_sales(Double.parseDouble(game[7]))
                .jp_sales(Double.parseDouble(game[8]))
                .other_sales(Double.parseDouble(game[9]))
                .global_sales(Double.parseDouble(game[10]))
                .build();
    }

}