package net.yggdraszil.lazyclick.client;

public class HoldState {

    private static boolean holdAttack = false;
    private static boolean holdUse = false;

    public static void toggleAttack() {
        holdAttack = !holdAttack;
        if (holdAttack) {
            holdUse = false; // désactive l'autre
        }
    }

    public static void toggleUse() {
        holdUse = !holdUse;
        if (holdUse) {
            holdAttack = false;
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
    }
}
