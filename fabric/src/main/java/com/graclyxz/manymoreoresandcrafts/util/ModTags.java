package com.graclyxz.manymoreoresandcrafts.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public interface Items {
        TagKey<Item> ADAMANTITE_INGOT = createTag(new ResourceLocation("c:ingots/adamantite"));
        TagKey<Item> COBALT_INGOT = createTag(new ResourceLocation("c:ingots/cobalt"));
        TagKey<Item> INFERNAL_INGOT = createTag(new ResourceLocation("c:ingots/infernal"));
        TagKey<Item> LEAD_INGOT = createTag(new ResourceLocation("c:ingots/lead"));
        TagKey<Item> MYTHRIL_INGOT = createTag(new ResourceLocation("c:ingots/mythril"));
        TagKey<Item> OBSIDIAN_INGOT = createTag(new ResourceLocation("c:ingots/obsidian"));
        TagKey<Item> ORICHALCUM_INGOT = createTag(new ResourceLocation("c:ingots/orichalcum"));
        TagKey<Item> PALLADIUM_INGOT = createTag(new ResourceLocation("c:ingots/palladium"));
        TagKey<Item> PLATINUM_INGOT = createTag(new ResourceLocation("c:ingots/platinum"));
        TagKey<Item> SILVER_INGOT = createTag(new ResourceLocation("c:ingots/silver"));
        TagKey<Item> TIN_INGOT = createTag(new ResourceLocation("c:ingots/tin"));
        TagKey<Item> TITANIUM_INGOT = createTag(new ResourceLocation("c:ingots/titanium"));
        TagKey<Item> TUNGSTEN_INGOT = createTag(new ResourceLocation("c:ingots/tungsten"));

        TagKey<Item> COPPER = createTag(new ResourceLocation("c:ingots/copper"));
        TagKey<Item> AMETHYST_SHARD = createTag(new ResourceLocation("c:items/amethyst_shard"));
        TagKey<Item> EMERALD = createTag(new ResourceLocation("c:items/emerald"));

        private static TagKey<Item> createTag(ResourceLocation name) {
            return TagKey.create(Registries.ITEM, name);
        }
    }
}