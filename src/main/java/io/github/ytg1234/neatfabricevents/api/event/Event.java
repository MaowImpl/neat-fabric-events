package io.github.ytg1234.neatfabricevents.api.event;

import org.jetbrains.annotations.Nullable;

public interface Event<T> {
    void cancel();

    boolean isCancelled();

    void setCancelled(boolean isCancelled);

    boolean cancellable();

    @Nullable T getSource();
}
