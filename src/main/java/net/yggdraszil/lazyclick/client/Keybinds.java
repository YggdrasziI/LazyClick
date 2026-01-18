package net.yggdraszil.lazyclick.client;

import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.yggdraszil.lazyclick.LazyClick;
import net.minecraft.client.KeyMapping;
import com.mojang.blaze3d.platform.InputConstants;
import org.lwjgl.glfw.GLFW;

public class Keybinds {

    public static KeyMapping TOGGLE_ATTACK;
    public static KeyMapping TOGGLE_USE;

    public static void register(RegisterKeyMappingsEvent event) {

        TOGGLE_ATTACK = new KeyMapping(
                "key." + LazyClick.MOD_ID + ".toggle_attack",
                InputConstants.Type.KEYSYM,
                GLFW.GLFW_KEY_G,
                "key.categories." + LazyClick.MOD_ID
        );

        TOGGLE_USE = new KeyMapping(
                "key." + LazyClick.MOD_ID + ".toggle_use",
                InputConstants.Type.KEYSYM,
                GLFW.GLFW_KEY_H,
                "key.categories." + LazyClick.MOD_ID
        );

        event.register(TOGGLE_ATTACK);
        event.register(TOGGLE_USE);
    }
}