package com.capsteam.service;

import com.capsteam.model.GameModel;

import java.util.List;

public interface ReadService {
    List<String> readFileCsv();
    GameModel parseModelfromString(String game);
}
