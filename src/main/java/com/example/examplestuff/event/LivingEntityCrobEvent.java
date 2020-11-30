package com.example.examplestuff.event;

import io.github.ytg1234.neatfabricevents.api.event.AbstractCancellableEvent;
import io.github.ytg1234.neatfabricevents.api.event.listener.EventListener;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import org.jetbrains.annotations.Nullable;

public class LivingEntityCrobEvent extends AbstractCancellableEvent<LivingEntity> {
    public static Event<EventListener<LivingEntityCrobEvent>> EVENT = EventFactory.createArrayBacked(EventListener.class, listeners -> event -> {
        for (EventListener<LivingEntityCrobEvent> listener : listeners) {
            listener.listen(event);
        }
    });

    private final DamageSource damageSource;

    public LivingEntityCrobEvent(@Nullable LivingEntity source, boolean isClient, DamageSource src) {
        super(source, isClient);
        this.damageSource = src;
    }

    public static void registerListener(EventListener<LivingEntityCrobEvent> listener) {
        EVENT.register(listener);
    }

    public DamageSource getDamageSource() {
        return damageSource;
    }
}
