package br.com.dio.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static br.com.dio.service.EventEnum.CLEAR_SPACE;

public class NotifierService {
    private final Map<EventEnum, List<EventListener>> listeneres = new HashMap<>(){{
        put(CLEAR_SPACE, new ArrayList<>());
    }};

    public void subscribe(final EventEnum eventType, EventListener eventListener) {
        var selectedListeners = listeneres.get(eventType);
        selectedListeners.add(eventListener);
    }

    public void notify(final EventEnum eventType){
        listeneres.get(eventType).forEach(l ->l.update(eventType));
    }
}
