package net.yggdraszil.lazyclick.client;

import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.yggdraszil.lazyclick.LazyClick;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(
        modid = LazyClick.MOD_ID,
        bus = Mod.EventBusSubscriber.Bus.MOD,
        value = Dist.CLIENT
)
public class ClientModEvents {

    @SubscribeEvent
    public static void onRegisterKeyMappings(RegisterKeyMappingsEvent event) {
        Keybinds.register(event);
    }
}
