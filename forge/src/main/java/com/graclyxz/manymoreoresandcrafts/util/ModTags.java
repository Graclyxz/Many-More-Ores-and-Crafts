package com.graclyxz.manymoreoresandcrafts.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public interface Items {
        //TagKey<Item> ADAMANTITE_INGOT = createTag(new ResourceLocation("forge:ingots/adamantite"));
        TagKey<Item> ADAMANTITE_INGOT = createTag(new ResourceLocation("forge:ingots/adamantite"));
        TagKey<Item> COBALT_INGOT = createTag(new ResourceLocation("forge:ingots/cobalt"));
        TagKey<Item> INFERNAL_INGOT = createTag(new ResourceLocation("forge:ingots/infernal"));
        TagKey<Item> LEAD_INGOT = createTag(new ResourceLocation("forge:ingots/lead"));
        TagKey<Item> MYTHRIL_INGOT = createTag(new ResourceLocation("forge:ingots/mythril"));
        TagKey<Item> OBSIDIAN_INGOT = createTag(new ResourceLocation("forge:ingots/obsidian"));
        TagKey<Item> ORICHALCUM_INGOT = createTag(new ResourceLocation("forge:ingots/orichalcum"));
        TagKey<Item> PALLADIUM_INGOT = createTag(new ResourceLocation("forge:ingots/palladium"));
        TagKey<Item> PLATINUM_INGOT = createTag(new ResourceLocation("forge:ingots/platinum"));
        TagKey<Item> SILVER_INGOT = createTag(new ResourceLocation("forge:ingots/silver"));
        TagKey<Item> TIN_INGOT = createTag(new ResourceLocation("forge:ingots/tin"));
        TagKey<Item> TITANIUM_INGOT = createTag(new ResourceLocation("forge:ingots/titanium"));
        TagKey<Item> TUNGSTEN_INGOT = createTag(new ResourceLocation("forge:ingots/tungsten"));

        TagKey<Item> COPPER = createTag(new ResourceLocation("forge:ingots/copper"));
        TagKey<Item> AMETHYST_SHARD = createTag(new ResourceLocation("forge:items/amethyst_shard"));
        TagKey<Item> EMERALD = createTag(new ResourceLocation("forge:items/emerald"));

        private static TagKey<Item> createTag(ResourceLocation name) {
            return TagKey.create(Registries.ITEM, name);
        }
    }
}