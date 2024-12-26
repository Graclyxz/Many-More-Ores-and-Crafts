package com.graclyxz.many_more_ores_and_crafts.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public interface Items {
        TagKey<Item> TIN_INGOT = createTag(ResourceLocation.parse("c:ingots/tin"));

        private static TagKey<Item> createTag(ResourceLocation name) {
            return TagKey.create(Registries.ITEM, name);
        }
    }
}
