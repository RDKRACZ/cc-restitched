/*
 * This file is part of ComputerCraft - http://www.computercraft.info
 * Copyright Daniel Ratcliffe, 2011-2021. Do not distribute without permission.
 * Send enquiries to dratcliffe@gmail.com
 */
package dan200.computercraft.fabric.mixin;

import dan200.computercraft.shared.util.DropConsumer;
import net.minecraft.block.Block;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.function.Supplier;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Captures block drops.
 *
 * @see Block#dropStack(World, BlockPos, ItemStack)
 */
@Mixin( Block.class )
public class MixinBlock
{
//    @Inject( method = "dropStack",
//        at = @At( value = "INVOKE", target = "Lnet/minecraft/world/World;spawnEntity(Lnet/minecraft/entity/Entity;)Z" ),
//        cancellable = true )
//    private static void dropStack( World world, BlockPos pos, ItemStack stack, CallbackInfo callbackInfo )
//    {
//        if( DropConsumer.onHarvestDrops( world, itemEntitySupplier.get().getBlockPos(), stack ) )
//        {
//            callbackInfo.cancel();
//        }
//    }
}
