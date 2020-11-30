package com.example.examplestuff;

import com.example.examplestuff.event.LivingEntityCrobEvent;
import net.fabricmc.api.ModInitializer;

public class ExampleModInit implements ModInitializer {
    @Override
    public void onInitialize() {
        LivingEntityCrobEvent.registerListener(event -> {
            if (!event.onClientSide()) System.out.println("Hello! ded");
        });
    }
}
