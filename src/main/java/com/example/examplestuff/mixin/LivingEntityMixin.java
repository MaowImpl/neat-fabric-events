package com.example.examplestuff.mixin;

import com.example.examplestuff.event.LivingEntityCrobEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {
    private LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(method = "onDeath(Lnet/minecraft/entity/damage/DamageSource;)V", at = @At("HEAD"), cancellable = true)
    private void fireEvent(DamageSource source, CallbackInfo ci) {
        LivingEntityCrobEvent crobEvent = new LivingEntityCrobEvent((LivingEntity) (Object) this, world.isClient, source);
        LivingEntityCrobEvent.EVENT.invoker().listen(crobEvent);
        if (crobEvent.isCancelled()) {
            ci.cancel(); // I don't think this will really work, this is just for demonstration
        }
    }
}
