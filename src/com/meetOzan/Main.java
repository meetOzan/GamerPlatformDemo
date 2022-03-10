package com.meetOzan;

import com.meetOzan.Entities.Events;
import com.meetOzan.Entities.Gamers;
import com.meetOzan.Entities.Games;
import com.meetOzan.Managers.EventManager;
import com.meetOzan.Managers.GameManager;
import com.meetOzan.Managers.GamerManager;
import com.meetOzan.Services.CheckService;

public class Main {

    public static void main(String[] args) {
        Gamers gamer1 = new Gamers();
        gamer1.setId(1);
        gamer1.setFirstName("Mert Ozan ");
        gamer1.setLastName("Kahraman");
        gamer1.setNickname("Merzan");
        gamer1.setNewNickName("meetOzan");


        GamerManager gamerManager = new GamerManager();
        gamerManager.addGamer(gamer1);
        gamerManager.upgradeGamer(gamer1);
        gamerManager.removeGamer(gamer1);
        System.out.println("\n");

        Events event1 = new Events();
        event1.setEventName("Hallowen");
        event1.setActive(true);
        event1.setHowManyDays(10);
        event1.setDisCount(15);

        Events event2 = new Events();
        event2.setEventName("New Year");
        event2.setActive(true);
        event2.setHowManyDays(5);
        event2.setDisCount(25);
        System.out.println("\n");

        Games games = new Games();
        games.setGameName("Assasin's Creed Odyseey");
        games.setId(201808);
        games.setPrice(200);
        games.priceAfterDiscount();

        Games games1 = new Games();
        games1.setGameName("Celeste");
        games1.setId(201804);
        games1.setPrice(50);
        games1.priceAfterDiscount();

        EventManager eventManager = new EventManager();
        eventManager.addEvent(event1,games1);
        eventManager.addEvent(event2,games);
        eventManager.overEvent(event2,games);
        eventManager.removeEvent(event1,games1);
        System.out.println("\n");

        GameManager gameManager = new GameManager();
        gameManager.sellGame(games1,gamer1);
        gameManager.sellGame(gamer1,games,event2);
        gameManager.giveBack(games,gamer1);
        System.out.println("\n");
    }
}
