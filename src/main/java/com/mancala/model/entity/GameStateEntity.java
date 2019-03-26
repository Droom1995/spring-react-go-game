

package com.mancala.model.entity;

import com.mancala.model.consts.Players;
import lombok.*;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Oleksandr Husiev on 8/12/2018.
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GameStateEntity {
    private Players activePlayer;
    private HashMap<Integer, Players> playerIds;
    private int size;
    private List<Integer> board;
}
