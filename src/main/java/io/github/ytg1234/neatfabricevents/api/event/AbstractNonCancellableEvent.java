package io.github.ytg1234.neatfabricevents.api.event;

import org.jetbrains.annotations.Nullable;

public abstract class AbstractNonCancellableEvent<T> extends BaseEvent<T> {
    public AbstractNonCancellableEvent(@Nullable T source) {
        super(source);
    }

    @Override
    public void cancel() {
        throw new UnsupportedOperationException("Tried to cancel a non-cancellable event " + this.getClass().getName() + "!");
    }

    @Override
    public boolean cancellable() {
        return false;
    }

    @Override
    public void setCancelled(boolean isCancelled) {
        throw new UnsupportedOperationException("Tried to change the cancel status of a non-cancellable event " + this.getClass().getName() + "!");
    }
}
