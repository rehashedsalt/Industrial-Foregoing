/*
 * This file is part of Industrial Foregoing.
 *
 * Copyright 2019, Buuz135
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so, subject to the
 * following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies
 * or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE
 * FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.buuz135.industrial.proxy.client.event;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class IFTooltipEvent {

    private static String[] other = new String[]{"Slushy Machine", "Ice Cream Maker", "DiHydrogenOxide Crystalizer", "Chillinator 9000", "Freezey McChillface", "Molecular Decelerator"};

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void onTooltip(ItemTooltipEvent event) {
        if (Block.getBlockFromItem(event.getItemStack().getItem()) == Blocks.AIR) return;
        //Block block = Block.getBlockFromItem(event.getItemStack().getItem());
        //if (block instanceof IHasAdvancedTooltip && !((IHasAdvancedTooltip) block).getTooltip(event.getItemStack()).isEmpty()) {
        //    if (!GuiScreen.isShiftKeyDown()) {
        //        event.getToolTip().add(new TranslationTextComponent("text.industrialforegoing.tooltip.hold_shift").getFormattedText());
        //    } else {
        //        event.getToolTip().addAll(((IHasAdvancedTooltip) block).getTooltip(event.getItemStack()));
        //    }
        //}
        //if (Minecraft.getInstance().world != null && block.equals(BlockRegistry.frosterBlock)) {
        //    event.getToolTip().add("or \"" + other[(int) ((Minecraft.getInstance().world.getTotalWorldTime() / 70) % other.length)] + "\"");
        //}TODO
    }
}
