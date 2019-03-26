

package com.mancala.model.service;

import com.mancala.model.entity.TurnActionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Oleksandr Husiev on 8/12/2018.
 */
@Service
public class GameLogicServiceImpl implements GameLogicService {


    @Autowired
    private GameStateService gameStateService;



    public void processTurn(TurnActionDto turnActionDto) {
        gameStateService.changeActivePlayer();
    }





}
