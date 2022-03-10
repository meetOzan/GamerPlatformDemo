package com.meetOzan.Managers;

import com.meetOzan.Entities.Events;
import com.meetOzan.Entities.Gamers;
import com.meetOzan.Entities.Games;
import com.meetOzan.Services.GameService;

public class GameManager implements GameService {
    @Override
    public void sellGame(Games games, Gamers gamers) {
        System.out.println(gamers.getNickname()+"'Nickli Oyuncu "+games.getGameName()+" Oyununu Satın Aldı.");
    }

    @Override
    public void sellGame(Gamers gamers, Games games, Events events) {
        games.setPriceAfterDiscount(games.getPrice()-(games.getPrice()/events.getDisCount()));
        System.out.println(gamers.getNewNickName()+"Nickli Oyuncu"+games.getGameName()+" Oyununu "+
                        events.getEventName()+" Eventinde %"+events.getDisCount()+" tutarinda indirim ile "+
                        games.getPriceAfterDiscount()+" fiyatina almistir.");
    }

    @Override
    public void giveBack(Games games, Gamers gamers) {
        System.out.println(gamers.getNickname() +"Nickli Oyuncu"+games.getGameName()+" Oyununu iade etmiştir");
    }
}
