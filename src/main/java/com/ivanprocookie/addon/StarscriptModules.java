package com.ivanprocookie.addon;

// import com.ivanprocookie.addon.commands.CommandExample;
// import com.ivanprocookie.addon.hud.HudExample;
import com.ivanprocookie.addon.modules.OtherKey1;
import com.ivanprocookie.addon.modules.OtherKey2;
import com.ivanprocookie.addon.modules.OtherKey3;
import com.ivanprocookie.addon.modules.OtherKey4;
import com.ivanprocookie.addon.modules.OtherKey5;
import com.ivanprocookie.addon.modules.OtherKey6;
import com.ivanprocookie.addon.modules.wasd.WKey;
import com.ivanprocookie.addon.modules.wasd.AKey;
import com.ivanprocookie.addon.modules.wasd.SKey;
import com.ivanprocookie.addon.modules.wasd.DKey;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.commands.Commands;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class ModulesPlus extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("Keys");
    public static final HudGroup HUD_GROUP = new HudGroup("IPC");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Meteor Addon Template");

        // Modules
        Modules.get().add(new WKey());
		Modules.get().add(new AKey());
		Modules.get().add(new SKey());
		Modules.get().add(new DKey());
        Modules.get().add(new OtherKey1());
        Modules.get().add(new OtherKey2());
        Modules.get().add(new OtherKey3());
        Modules.get().add(new OtherKey4());
        Modules.get().add(new OtherKey5());
        Modules.get().add(new OtherKey6());

        // Commands
        // Commands.add(new CommandExample());

        // HUD
        // Hud.get().register(HudExample.INFO);
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.ivanprocookie.addon";
    }

    @Override
    public GithubRepo getRepo() {
        return new GithubRepo("IvanProCookie", "Modules-Plus-Meteor-Addon");
    }
}
