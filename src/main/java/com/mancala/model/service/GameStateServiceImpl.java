package com.mancala.model.service;

import com.mancala.model.consts.Players;
import com.mancala.model.dto.GameStateDto;
import com.mancala.model.entity.GameStateEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleksandr Husiev on 8/14/2018.
 */
@Service
public class GameStateServiceImpl implements GameStateService {

    @Value("${board.size}")
    private int boardSize;

    private GameStateEntity gameStateEntity;


    @Override
    public void initGame() {
        gameStateEntity = new GameStateEntity();
        List<Integer> board = new ArrayList<>(boardSize * boardSize);
        for (int i = 0; i < boardSize * boardSize; i++) {
            board.add(0);
        }
        gameStateEntity.setSize(boardSize);
        gameStateEntity.setBoard(board);
        gameStateEntity.setActivePlayer(Players.BLACK);

    }

    @Override
    public void changeActivePlayer() {
        Players currentPlayer = gameStateEntity.getActivePlayer();
        gameStateEntity.setActivePlayer(currentPlayer == Players.BLACK ? Players.WHITE : Players.BLACK);
    }

    //TODO add player validation
    @Override
    public boolean validatePlayer(int playerId) {
        return true;
    }

    @Override
    public GameStateDto getGameState() {
        return GameStateDto.builder()
                .activePlayer(gameStateEntity.getActivePlayer()).board(gameStateEntity.getBoard())
                .build();
    }
}
