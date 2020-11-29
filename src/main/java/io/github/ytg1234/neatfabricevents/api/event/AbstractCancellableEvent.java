package io.github.ytg1234.neatfabricevents.api.event;

import org.jetbrains.annotations.Nullable;

public abstract class AbstractCancellableEvent<T> extends BaseEvent<T> {
    public AbstractCancellableEvent(@Nullable T source) {
        super(source);
    }

    @Override
    public void cancel() {
        isCancelled = true;
    }

    @Override
    public boolean cancellable() {
        return true;
    }

    @Override
    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }
}
