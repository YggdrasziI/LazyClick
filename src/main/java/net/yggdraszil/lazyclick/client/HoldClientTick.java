package net.yggdraszil.lazyclick.client;

import net.minecraft.client.Minecraft;

public class HoldClientTick {

    public static void handleClientTick() {
        Minecraft mc = Minecraft.getInstance();

        if (mc.player == null || mc.screen != null) {
            // reset si écran ouvert
            HoldState.reset();
            mc.options.keyAttack.setDown(false);
            mc.options.keyUse.setDown(false);
            return;
        }

        mc.options.keyAttack.setDown(HoldState.isHoldingAttack());
        mc.options.keyUse.setDown(HoldState.isHoldingUse());
    }
}
