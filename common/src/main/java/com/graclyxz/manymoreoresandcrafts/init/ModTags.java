package com.graclyxz.manymoreoresandcrafts.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {

    public interface Items {

        TagKey<Item> ADAMANTITEINGOT = create(ResourceLocation.parse("c:ingots/adamantite"));
        TagKey<Item> AMETHYST = create(ResourceLocation.parse("minecraft:amethyst_shard"));;
        TagKey<Item> COBALTINGOT = create(ResourceLocation.parse("c:ingots/cobalt"));
        TagKey<Item> INFERNALINGOT = create(ResourceLocation.parse("c:ingots/infernal"));
        TagKey<Item> LEADINGOT = create(ResourceLocation.parse("c:ingots/lead"));
        TagKey<Item> MYTHRILINGOT = create(ResourceLocation.parse("c:ingots/mythril"));
        TagKey<Item> OBSIDIANINGOT = create(ResourceLocation.parse("c:ingots/obsidian"));
        TagKey<Item> ORICHALCUMINGOT = create(ResourceLocation.parse("c:ingots/orichalcum"));
        TagKey<Item> PALLADIUMINGOT = create(ResourceLocation.parse("c:ingots/palladium"));
        TagKey<Item> PLATINUMINGOT = create(ResourceLocation.parse("c:ingots/platinum"));
        TagKey<Item> SILVERINGOT = create(ResourceLocation.parse("c:ingots/silver"));
        TagKey<Item> TININGOT = create(ResourceLocation.parse("c:ingots/tin"));
        TagKey<Item> TITANIUMINGOT = create(ResourceLocation.parse("c:ingots/titanium"));
        TagKey<Item> TUNGSTENINGOT = create(ResourceLocation.parse("c:ingots/tungsten"));

        private static TagKey<Item> create(ResourceLocation name) {
            return TagKey.create(Registries.ITEM, name);
        }
    }
}
