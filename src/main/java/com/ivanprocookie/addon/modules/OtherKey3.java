package com.ivanprocookie.addon.modules;

import com.ivanprocookie.addon.StarscriptModules;
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

public class OtherKey3 extends Module {

   public OtherKey3() {
      super(ModulesPlus.CATEGORY, "OtherKey3", "A Standalone Module Purely for use with Starscript");
   }

}
