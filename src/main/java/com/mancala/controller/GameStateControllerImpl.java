

package com.mancala.controller;

import com.mancala.model.dto.GameStateDto;
import com.mancala.model.entity.TurnActionDto;
import com.mancala.model.service.GameLogicService;
import com.mancala.model.service.GameStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Oleksandr Husiev on 8/12/2018.
 */
@RestController
public class GameStateControllerImpl implements GameStateController {


    private static final long serialVersionUID = -6242854424423314906L;

    @Autowired
    private GameLogicService gameLogicService;

    @Autowired
    private GameStateService gameStateService;

    @GetMapping("/game/state")
    public GameStateDto getGameState() {
        return gameStateService.getGameState();
    }

    @PutMapping("/game/processTurn")
    public void processGameTurn(TurnActionDto turnActionDto) {
        if (gameStateService.validatePlayer(turnActionDto.getPlayerId())) {
            throw new IllegalArgumentException();
        }
        gameLogicService.processTurn(turnActionDto);
    }

    @PostMapping("/game/start")
    public void startGame() {
        gameStateService.initGame();
    }
}
