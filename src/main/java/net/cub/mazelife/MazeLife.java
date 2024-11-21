package net.cub.mazelife;

import net.fabricmc.api.ModInitializer;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MazeLife implements ModInitializer {
	public static final String MOD_ID = "mazelife";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");

		CustomPortalBuilder.beginPortal()
				.frameBlock(Blocks.STONE_BRICKS)
				.lightWithItem(Items.DEBUG_STICK)
				.destDimID(Identifier.of(MazeLife.MOD_ID, "liminal"))
				.tintColor(0, 66, 37)
				.registerPortal();
	}
}