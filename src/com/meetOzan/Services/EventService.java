package com.meetOzan.Services;

import com.meetOzan.Entities.Events;
import com.meetOzan.Entities.Games;

public interface EventService {

    void addEvent(Events events, Games games);
    void upgradeEvent (Events events,Games games);
    void removeEvent (Events events,Games games);
    void overEvent (Events events,Games games);

}
