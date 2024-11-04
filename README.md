# Many More Ores and Crafts

Adds 14 ores and recipes (Swords, Armors, Tools and Blocks)

## Download links

- https://www.curseforge.com/minecraft/mc-mods/many-more-ores-and-crafts
- https://modrinth.com/mod/many-more-ores-and-crafts

## Development
The majority of this mod is developed in the Common project. The Common project is compiled against the vanilla game and is used to maintain code that is shared between the different specific loader versions of this mod. The Common project has no knowledge or access to ModLoader specific code, apis or concepts. Code that requires something from a specific loader must be done through that loader's specific project, such as the Forge or Fabric project.
Loader-specific projects, such as the Forge and Fabric projects, are used to load the Common project into the game. These projects also define code specific to that loader. Loader-specific projects can access all of the code in the Common project. It is important to remember that the Common project cannot access the code of the loader-specific projects.