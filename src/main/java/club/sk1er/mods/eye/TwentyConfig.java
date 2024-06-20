package club.sk1er.mods.eye;

import cc.polyfrost.oneconfig.config.Config;
import cc.polyfrost.oneconfig.config.annotations.KeyBind;
import cc.polyfrost.oneconfig.config.annotations.Slider;
import cc.polyfrost.oneconfig.config.annotations.Switch;
import cc.polyfrost.oneconfig.config.core.OneKeyBind;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;
import cc.polyfrost.oneconfig.libs.universal.UKeyboard;

public class TwentyConfig extends Config {
    @KeyBind(
            name = "Start Break Keybind",
            description = "The keybind used to start a break.",
            category = "General", subcategory = "General"
    )
    public static OneKeyBind startBreakKeybind = new OneKeyBind(UKeyboard.KEY_J);

    @Slider(
            name = "Minutes In Between (minutes)",
            description = "Choose how long between breaks.",
            category = "General", subcategory = "Time",
            min = 1, max = 60
    )
    public static int interval = 20;

    @Slider(
            name = "Break Duration (seconds)",
            description = "Choose how long breaks last.",
            category = "General", subcategory = "Time",
            min = 1, max = 60
    )
    public static int duration = 20;

    @Slider(
            name = "Notification Corner",
            description = "Choose where the break notification is displayed.",
            category = "General", subcategory = "Notification",
            min = 1, max = 4
    )
    public static int corner = 1;

    @Switch(
            name = "Chat Message",
            description = "Display a message in chat when ready.",
            category = "General", subcategory = "Notification"
    )
    public static boolean chat = true;

    @Switch(
            name = "Ping When Done",
            description = "Ping when the break is over.",
            category = "General", subcategory = "Notification"
    )
    public static boolean pingWhenDone = true;

    @Switch(
            name = "Ping When Ready",
            description = "Ping when the break is ready.",
            category = "General", subcategory = "Notification"
    )
    public static boolean pingWhenReady = true;

    public TwentyConfig() {
        super(new Mod(TwentyTwentyTwentyMod.NAME, ModType.UTIL_QOL), "202020.json");
        initialize();
    }

}
