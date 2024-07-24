package com.ivanprocookie.addon.modules.wasd;

import com.ivanprocookie.addon.ModulesPlus;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;

public class DKey extends Module {
    
   public DKey() {
      super(ModulesPlus.CATEGORY, "DKey", "A Standalone Module Purely for use with Starscript");
   }

}