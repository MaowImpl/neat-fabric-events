package io.github.ytg1234.neatfabricevents.api.event;

import net.fabricmc.api.EnvType;
import org.jetbrains.annotations.Nullable;

public interface Event<T> {
    void cancel();

    boolean isCancelled();

    void setCancelled(boolean isCancelled);

    boolean cancellable();

    boolean onClientSide();

    @Nullable T getSource();
}
