package tcb.spiderstpo.common;


import net.fabricmc.api.ModInitializer;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpiderMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(Config.MOD_NAME);
    @Override
    public void onInitialize() {
        try {
            LOGGER.info(Config.MOD_NAME + " initialized successfully!");
            //Bind tag
            final TagKey<Block> nonClimbable = ModTags.NON_CLIMBABLE;
        } catch (Exception e) {
            LOGGER.error(Config.MOD_NAME + " initialization failed! Here is the StackStrace:\n" + e);
        }
    }
}
