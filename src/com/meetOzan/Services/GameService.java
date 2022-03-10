package com.meetOzan.Services;

import com.meetOzan.Entities.Events;
import com.meetOzan.Entities.Gamers;
import com.meetOzan.Entities.Games;

public interface GameService {

    void sellGame(Games games,Gamers gamers);
    void sellGame (Gamers gamers, Games games, Events events);
    void giveBack (Games games,Gamers gamers);

}



