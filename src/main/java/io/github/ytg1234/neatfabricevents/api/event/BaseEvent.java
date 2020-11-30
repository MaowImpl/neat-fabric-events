package io.github.ytg1234.neatfabricevents.api.event;

import org.jetbrains.annotations.Nullable;

public abstract class BaseEvent<T> implements Event<T> {
    protected boolean isCancelled = false;
    @Nullable
    protected T source;

    protected boolean isClient;

    public BaseEvent(@Nullable T source) {
        this(source, false);
    }

    public BaseEvent(@Nullable T source, boolean isClient) {
        this.source = source;
        this.isClient = isClient;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public boolean onClientSide() {
        return isClient;
    }

    @Nullable
    @Override
    public T getSource() {
        return source;
    }
}
