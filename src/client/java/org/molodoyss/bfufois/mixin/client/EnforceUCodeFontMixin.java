package org.molodoyss.bfufois.mixin.client;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

//make the isEnforceUnicode method always return false
@Mixin(Minecraft.class)
public class EnforceUCodeFontMixin {
    @Inject(at = @At("HEAD"), method = "isEnforceUnicode", cancellable = true)
    private void YesUnicodeIsEnforce(CallbackInfoReturnable<Boolean> cir) {
        cir.cancel();
        cir.setReturnValue(false);
    }
}
