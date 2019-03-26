package com.mancala.model.service;

import com.mancala.model.dto.GameStateDto;

/**
 * Created by Oleksandr Husiev on 8/14/2018.
 */
public interface GameStateService {

    void initGame();

    void changeActivePlayer();

    boolean validatePlayer(int playerId);

    GameStateDto getGameState();
}
