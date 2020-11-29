package io.github.ytg1234.neatfabricevents.api.event.listener;

import io.github.ytg1234.neatfabricevents.api.event.Event;

public interface EventListener<T extends Event> {
    void listen(T e);
}
