package io.github.ytg1234.neatfabricevents.api.event;

import org.jetbrains.annotations.Nullable;

public abstract class BaseEvent<T> implements Event<T> {
    protected boolean isCancelled = false;
    @Nullable
    protected T source;

    public BaseEvent(@Nullable T source) {
        this.source = source;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Nullable
    @Override
    public T getSource() {
        return source;
    }
}
