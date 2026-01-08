package com.example.gigachest.block;

import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.slf4j.Logger;

public class OmegaChestBlock {
    public static final String MODID = "gigachest";
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final Logger LOGGER = LogUtils.getLogger();


}
