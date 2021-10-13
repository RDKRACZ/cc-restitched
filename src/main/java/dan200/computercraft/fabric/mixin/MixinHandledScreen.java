/*
 * This file is part of ComputerCraft - http://www.computercraft.info
 * Copyright Daniel Ratcliffe, 2011-2021. Do not distribute without permission.
 * Send enquiries to dratcliffe@gmail.com
 */
package dan200.computercraft.fabric.mixin;

import dan200.computercraft.client.gui.widgets.WidgetTerminal;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin( HandledScreen.class )
public class MixinHandledScreen<T extends ScreenHandler> extends Screen
{
    protected MixinHandledScreen( Text title )
    {
        super( title );
    }

    @Inject( method = "mouseReleased", at = @At ( "HEAD" ) )
    public void mouseReleased( double mouseX, double mouseY, int button, CallbackInfoReturnable<Boolean> cir )
    {
        for ( Element child : this.children() )
        {
            if ( child instanceof WidgetTerminal )
            {
                child.mouseReleased( mouseX, mouseY, button );
            }
        }
    }
}
