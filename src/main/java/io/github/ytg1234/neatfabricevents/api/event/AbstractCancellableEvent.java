package io.github.ytg1234.neatfabricevents.api.event;

import org.jetbrains.annotations.Nullable;

public abstract class AbstractCancellableEvent<T> extends BaseEvent<T> {
    public AbstractCancellableEvent(@Nullable T source) {
        super(source);
    }

    public AbstractCancellableEvent(@Nullable T source, boolean isClient) {
        super(source, isClient);
    }

    @Override
    public void cancel() {
        isCancelled = true;
    }

    @Override
    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    @Override
    public boolean cancellable() {
        return true;
    }
}
