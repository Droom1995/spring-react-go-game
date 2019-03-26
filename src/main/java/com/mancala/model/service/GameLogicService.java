

package com.mancala.model.service;


import com.mancala.model.entity.TurnActionDto;

/**
 * Created by Oleksandr Husiev on 8/12/2018.
 */
public interface GameLogicService {

    void processTurn(TurnActionDto turnActionDto);

}
