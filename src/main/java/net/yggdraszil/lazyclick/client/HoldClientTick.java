package net.yggdraszil.lazyclick.client;

import net.minecraft.client.Minecraft;

public class HoldClientTick {

    public static void handleClientTick() {
        Minecraft mc = Minecraft.getInstance();

        if (mc.player == null || mc.screen != null) {
            HoldState.reset();
            return;
        }

        if (HoldState.isHoldingAttack()) {
            mc.options.keyAttack.setDown(true);
        }

        if (HoldState.isHoldingUse()) {
            mc.options.keyUse.setDown(true);
        }
    }
}

