package com.lambda.client.module.modules.misc

import com.lambda.client.event.events.PacketEvent
import com.lambda.client.module.Category
import com.lambda.client.module.Module
import com.lambda.event.listener.listener
import net.minecraft.init.SoundEvents
import net.minecraft.network.play.server.SPacketSoundEffect
import net.minecraft.util.SoundCategory

object NoSoundLag : Module(
    name = "NoSoundLag",
    category = Category.MISC,
    description = "Prevents lag caused by sound machines"
) {
    init {
        listener<PacketEvent.Receive> {
            if (it.packet !is SPacketSoundEffect) return@listener
            if (it.packet.category == SoundCategory.PLAYERS && it.packet.sound == SoundEvents.ITEM_ARMOR_EQUIP_GENERIC) {
                it.cancel()
            }
        }
    }
}