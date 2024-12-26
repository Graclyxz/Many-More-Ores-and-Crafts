package com.graclyxz.many_more_ores_and_crafts.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public interface Items {

        TagKey<Item> ADAMANTITE_INGOT = createTag(ResourceLocation.parse("c:ingots/adamantite"));
        //TagKey<Item> AMETHYST_INGOT = createTag(ResourceLocation.parse("c:ingots/amethyst"));
        TagKey<Item> COBALT_INGOT = createTag(ResourceLocation.parse("c:ingots/cobalt"));
        TagKey<Item> INFERNAL_INGOT = createTag(ResourceLocation.parse("c:ingots/infernal"));
        TagKey<Item> LEAD_INGOT = createTag(ResourceLocation.parse("c:ingots/lead"));
        TagKey<Item> MYTHRIL_INGOT = createTag(ResourceLocation.parse("c:ingots/mythril"));
        TagKey<Item> OBSIDIAN_INGOT = createTag(ResourceLocation.parse("c:ingots/obsidian"));
        TagKey<Item> ORICHALCUM_INGOT = createTag(ResourceLocation.parse("c:ingots/orichalcum"));
        TagKey<Item> PALLADIUM_INGOT = createTag(ResourceLocation.parse("c:ingots/palladium"));
        TagKey<Item> PLATINUM_INGOT = createTag(ResourceLocation.parse("c:ingots/platinum"));
        TagKey<Item> SILVER_INGOT = createTag(ResourceLocation.parse("c:ingots/silver"));
        TagKey<Item> TIN_INGOT = createTag(ResourceLocation.parse("c:ingots/tin"));
        TagKey<Item> TITANIUM_INGOT = createTag(ResourceLocation.parse("c:ingots/titanium"));
        TagKey<Item> TUNGSTEM_INGOT = createTag(ResourceLocation.parse("c:ingots/tungsten"));

        private static TagKey<Item> createTag(ResourceLocation name) {
            return TagKey.create(Registries.ITEM, name);
        }
    }
}
