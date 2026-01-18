package net.yggdraszil.lazyclick.client;

import net.minecraft.client.Minecraft;
import net.yggdraszil.lazyclick.LazyClick;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(
        modid = LazyClick.MOD_ID,
        bus = Mod.EventBusSubscriber.Bus.FORGE, // 🔥 IMPORTANT
        value = Dist.CLIENT
)
public class ClientInit {

    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;

        if (Minecraft.getInstance().screen != null) {
            return;
        }

        while (Keybinds.TOGGLE_ATTACK.consumeClick()) {
            HoldState.toggleAttack();
        }

        while (Keybinds.TOGGLE_USE.consumeClick()) {
            HoldState.toggleUse();
        }

        HoldClientTick.handleClientTick();
    }
}
