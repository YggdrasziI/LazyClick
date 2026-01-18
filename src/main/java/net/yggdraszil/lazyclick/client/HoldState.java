package net.yggdraszil.lazyclick.client;

import net.minecraft.client.Minecraft;

public class HoldState {

    private static boolean holdAttack = false;
    private static boolean holdUse = false;

    public static void toggleAttack() {
        holdAttack = !holdAttack;

        if (!holdAttack) {
            Minecraft.getInstance().options.keyAttack.setDown(false);
        } else {
            holdUse = false;
            Minecraft.getInstance().options.keyUse.setDown(false);
        }
    }

    public static void toggleUse() {
        holdUse = !holdUse;

        if (!holdUse) {
            Minecraft.getInstance().options.keyUse.setDown(false);
        } else {
            holdAttack = false;
            Minecraft.getInstance().options.keyAttack.setDown(false);
        }
    }

    public static boolean isHoldingAttack() {
        return holdAttack;
    }

    public static boolean isHoldingUse() {
        return holdUse;
    }

    public static void reset() {
        holdAttack = false;
        holdUse = false;

        Minecraft mc = Minecraft.getInstance();
        mc.options.keyAttack.setDown(false);
        mc.options.keyUse.setDown(false);
    }
}
