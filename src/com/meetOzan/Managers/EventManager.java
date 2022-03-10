package com.meetOzan.Managers;

import com.meetOzan.Entities.Events;
import com.meetOzan.Entities.Games;
import com.meetOzan.Services.EventService;

public class EventManager implements EventService {

    @Override
    public void addEvent(Events events, Games games) {
        System.out.println(events.getEventName()+" isimli event başlamıştır "+
                games.getGameName()+" isimli oyun/(lar) indirimdedir \n"+events.getHowManyDays()
                +" Gün Sürecektir.");
    }

    @Override
    public void upgradeEvent(Events events, Games games) {
        System.out.println(events.getEventName()+" isimli event Güncellenmiştir.");


    }

    @Override
    public void removeEvent(Events events, Games games) {
        System.out.println(events.getEventName()+" isimli event KALDIRILMIŞTIR");
    }

    @Override
    public void overEvent(Events events, Games games) {
        events.setHowManyDays(0);
        System.out.println(events.getEventName()+" isimli Event Bitmiştir.\nEvent Bitmesine Kalan: "+
                          events.getHowManyDays()+".");
    }
}
