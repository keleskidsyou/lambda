package com.lambda.client.gui.clickgui.component

import com.lambda.client.gui.clickgui.LambdaClickGui
import com.lambda.client.gui.rgui.component.BooleanSlider
import com.lambda.client.plugin.PluginManager
import com.lambda.client.plugin.api.Plugin
import com.lambda.client.plugin.api.PluginModule
import com.lambda.client.util.math.Vec2f

class PluginButton(val plugin: Plugin) : BooleanSlider(plugin.name, 0.0, plugin.description) {
    init {
        if (plugin.hotReload) value = 1.0
    }

    override fun onTick() {
        super.onTick()
        value = if (PluginManager.loadedPlugins.containsName(plugin.name)) 1.0 else 0.0
    }

    override fun onClick(mousePos: Vec2f, buttonId: Int) {
        super.onClick(mousePos, buttonId)
        PluginManager.loadedPluginLoader.forEach {
            it
        }
//        if (buttonId == 0) plugin.
    }

    override fun onRelease(mousePos: Vec2f, buttonId: Int) {
        super.onRelease(mousePos, buttonId)
//        if (buttonId == 1) LambdaClickGui.displaySettingWindow(plugin)
    }
}