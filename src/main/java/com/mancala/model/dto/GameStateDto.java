package com.mancala.model.dto;

import com.mancala.model.consts.Players;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by Oleksandr Husiev on 8/14/2018.
 */
@Getter
@Setter
@Builder
public class GameStateDto {
    private Players activePlayer;
    private int size;
    private List<Integer> board;
}
