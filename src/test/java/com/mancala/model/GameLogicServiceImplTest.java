package com.mancala.model;


import com.mancala.model.service.GameLogicServiceImpl;
import com.mancala.model.service.GameStateServiceImpl;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Oleksandr Husiev on 8/13/2018.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= {GameLogicServiceImpl.class, GameStateServiceImpl.class})
@Ignore
public class GameLogicServiceImplTest {


    @Autowired
    private GameLogicServiceImpl gameLogicService;

    @Autowired
    private GameStateServiceImpl gameStateService;

}