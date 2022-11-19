
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package palamod.init;

import palamod.block.entity.Tcv2BlockEntity;
import palamod.block.entity.PaladiummachineBlockEntity;
import palamod.block.entity.PaladiumfurnaceonBlockEntity;
import palamod.block.entity.PaladiumfurnaceBlockEntity;
import palamod.block.entity.PaladiumforgeBlockEntity;
import palamod.block.entity.PaladiumcrusherBlockEntity;
import palamod.block.entity.NbtblockBlockEntity;
import palamod.block.entity.MegasafechestBlockEntity;
import palamod.block.entity.LuckyblockBlockEntity;
import palamod.block.entity.GrinderblockBlockEntity;
import palamod.block.entity.AsemblingtableBlockEntity;

import palamod.PalamodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class PalamodModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, PalamodMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> PALADIUMCRUSHER = register("paladiumcrusher", PalamodModBlocks.PALADIUMCRUSHER,
			PaladiumcrusherBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ASEMBLINGTABLE = register("asemblingtable", PalamodModBlocks.ASEMBLINGTABLE,
			AsemblingtableBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PALADIUMFURNACE = register("paladiumfurnace", PalamodModBlocks.PALADIUMFURNACE,
			PaladiumfurnaceBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PALADIUMFORGE = register("paladiumforge", PalamodModBlocks.PALADIUMFORGE,
			PaladiumforgeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MEGASAFECHEST = register("megasafechest", PalamodModBlocks.MEGASAFECHEST,
			MegasafechestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GRINDERBLOCK = register("grinderblock", PalamodModBlocks.GRINDERBLOCK,
			GrinderblockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TCV_2 = register("tcv_2", PalamodModBlocks.TCV_2, Tcv2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PALADIUMMACHINE = register("paladiummachine", PalamodModBlocks.PALADIUMMACHINE,
			PaladiummachineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LUCKYBLOCK = register("luckyblock", PalamodModBlocks.LUCKYBLOCK,
			LuckyblockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NBTBLOCK = register("nbtblock", PalamodModBlocks.NBTBLOCK, NbtblockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PALADIUMFURNACEON = register("paladiumfurnaceon", PalamodModBlocks.PALADIUMFURNACEON,
			PaladiumfurnaceonBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
