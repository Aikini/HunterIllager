package baguchan.hunterillager;

import baguchan.hunterillager.entity.HunterIllagerEntity;
import baguchan.hunterillager.entity.projectile.BoomerangEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class HunterEntityRegistry {
    public static final EntityType<HunterIllagerEntity> HUNTERILLAGER = EntityType.Builder.create(HunterIllagerEntity::new, EntityClassification.CREATURE).setTrackingRange(80).setUpdateInterval(3).setShouldReceiveVelocityUpdates(true).size(0.6F, 1.95F).build(prefix("hunterillager"));
    public static final EntityType<BoomerangEntity> BOOMERANG = EntityType.Builder.<BoomerangEntity>create(BoomerangEntity::new, EntityClassification.MISC).setTrackingRange(100).setUpdateInterval(1).setShouldReceiveVelocityUpdates(true).setCustomClientFactory(BoomerangEntity::new).size(0.25F, 0.25F).build(prefix("boomerang"));

    @SubscribeEvent
    public static void registerEntity(IForgeRegistry<EntityType<?>> event) {

        event.register(HUNTERILLAGER.setRegistryName("hunterillager"));
        event.register(BOOMERANG.setRegistryName("boomerang"));

    }

    private static String prefix(String path) {

        return HunterIllagerCore.MODID + "." + path;

    }

}
