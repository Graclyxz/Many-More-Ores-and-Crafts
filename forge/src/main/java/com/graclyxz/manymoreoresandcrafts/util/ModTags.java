package com.graclyxz.manymoreoresandcrafts.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public interface Items {
        //TagKey<Item> ADAMANTITE_INGOT = createTag(new ResourceLocation("forge:ingots/adamantite"));
        TagKey<Item> ADAMANTITE_INGOT = createTag(ResourceLocation.parse("forge:ingots/adamantite"));
        TagKey<Item> COBALT_INGOT = createTag(ResourceLocation.parse("forge:ingots/cobalt"));
        TagKey<Item> INFERNAL_INGOT = createTag(ResourceLocation.parse("forge:ingots/infernal"));
        TagKey<Item> LEAD_INGOT = createTag(ResourceLocation.parse("forge:ingots/lead"));
        TagKey<Item> MYTHRIL_INGOT = createTag(ResourceLocation.parse("forge:ingots/mythril"));
        TagKey<Item> OBSIDIAN_INGOT = createTag(ResourceLocation.parse("forge:ingots/obsidian"));
        TagKey<Item> ORICHALCUM_INGOT = createTag(ResourceLocation.parse("forge:ingots/orichalcum"));
        TagKey<Item> PALLADIUM_INGOT = createTag(ResourceLocation.parse("forge:ingots/palladium"));
        TagKey<Item> PLATINUM_INGOT = createTag(ResourceLocation.parse("forge:ingots/platinum"));
        TagKey<Item> SILVER_INGOT = createTag(ResourceLocation.parse("forge:ingots/silver"));
        TagKey<Item> TIN_INGOT = createTag(ResourceLocation.parse("forge:ingots/tin"));
        TagKey<Item> TITANIUM_INGOT = createTag(ResourceLocation.parse("forge:ingots/titanium"));
        TagKey<Item> TUNGSTEN_INGOT = createTag(ResourceLocation.parse("forge:ingots/tungsten"));

        TagKey<Item> COPPER = createTag(ResourceLocation.parse("forge:ingots/copper"));
        TagKey<Item> AMETHYST_SHARD = createTag(ResourceLocation.parse("forge:items/amethyst_shard"));
        TagKey<Item> EMERALD = createTag(ResourceLocation.parse("forge:items/emerald"));

        private static TagKey<Item> createTag(ResourceLocation name) {
            return TagKey.create(Registries.ITEM, name);
        }
    }
}