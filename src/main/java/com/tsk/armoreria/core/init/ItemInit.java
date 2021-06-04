package com.tsk.armoreria.core.init;

import com.tsk.armoreria.Armors;
import com.tsk.armoreria.armor.ModArmorMaterial;


import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Armors.MOD_ID);
	
	//MODI
	public static final RegistryObject<Item> VIBRANIUM = ITEMS.register("vibranium_ingot",
			() -> new Item(new Item.Properties().group(Armors.GAA)));	
	public static final RegistryObject<Item> TIN = ITEMS.register("tin_ingot",
			() -> new Item(new Item.Properties().group(Armors.GAA)));
	public static final RegistryObject<Item> ENDUR_INGOT = ITEMS.register("endur_ingot",
			() -> new Item(new Item.Properties().group(Armors.GAA)));
	public static final RegistryObject<Item> ENDERITE_SCRAP = ITEMS.register("enderite_scrap",
			() -> new Item(new Item.Properties().group(Armors.GAA)));
	public static final RegistryObject<Item> ENDERITE_INGOT = ITEMS.register("enderite_ingot",
			() -> new Item(new Item.Properties().group(Armors.GAA)));
	public static final RegistryObject<Item> REPAIRER = ITEMS.register("repairer",
			() -> new Item(new Item.Properties().group(Armors.GAA)));
	
	//ORES
	public static final RegistryObject<BlockItem> TIN_ORE = ITEMS.register("tin_ore",
			() -> new BlockItem(BlockInit.TIN_ORE.get(), new Item.Properties().group(Armors.GAA)));
	
	public static final RegistryObject<BlockItem> ENDER_ORE = ITEMS.register("ender_ore",
			() -> new BlockItem(BlockInit.ENDER_ORE.get(), new Item.Properties().group(Armors.GAA)));
	
	public static final RegistryObject<BlockItem> ENDERITE_DEBRIS = ITEMS.register("enderite_debris",
			() -> new BlockItem(BlockInit.ENDERITE_DEBRIS.get(), new Item.Properties().group(Armors.GAA)));

	//ARMOR VIBRANIUM
	public static final RegistryObject<ArmorItem> VIBRANIUM_HELMET = ITEMS.register("vibranium_helmet",
            () -> new ArmorItem(ModArmorMaterial.VIBRANIUM, EquipmentSlotType.HEAD, new Item.Properties().group(Armors.AMR)));

    public static final RegistryObject<ArmorItem> VIBRANIUM_CHESTPLATE = ITEMS.register("vibranium_chestplate",
            () -> new ArmorItem(ModArmorMaterial.VIBRANIUM, EquipmentSlotType.CHEST, new Item.Properties().group(Armors.AMR)));

    public static final RegistryObject<ArmorItem> VIBRANIUM_LEGGINGS = ITEMS.register("vibranium_leggings",
            () -> new ArmorItem(ModArmorMaterial.VIBRANIUM, EquipmentSlotType.LEGS, new Item.Properties().group(Armors.AMR)));

    public static final RegistryObject<ArmorItem> VIBRANIUM_BOOTS = ITEMS.register("vibranium_boots",
            () -> new ArmorItem(ModArmorMaterial.VIBRANIUM, EquipmentSlotType.FEET, new Item.Properties().group(Armors.AMR)));
    
    
    //ARMOR ENDERITE
    public static final RegistryObject<ArmorItem> ENDERITE_HELMET = ITEMS.register("enderite_helmet",
            () -> new ArmorItem(ModArmorMaterial.ENDERITE, EquipmentSlotType.HEAD, new Item.Properties().group(Armors.AMR)));

    public static final RegistryObject<ArmorItem> ENDERITE_CHESTPLATE = ITEMS.register("enderite_chestplate",
            () -> new ArmorItem(ModArmorMaterial.ENDERITE, EquipmentSlotType.CHEST, new Item.Properties().group(Armors.AMR)));

    public static final RegistryObject<ArmorItem> ENDERITE_LEGGINGS = ITEMS.register("enderite_leggings",
            () -> new ArmorItem(ModArmorMaterial.ENDERITE, EquipmentSlotType.LEGS, new Item.Properties().group(Armors.AMR)));

    public static final RegistryObject<ArmorItem> ENDERITE_BOOTS = ITEMS.register("enderite_boots",
            () -> new ArmorItem(ModArmorMaterial.ENDERITE, EquipmentSlotType.FEET, new Item.Properties().group(Armors.AMR)));
    
    
    //ARMOR HEAVY IRON
    public static final RegistryObject<ArmorItem> HEAVY_IRON_HELMET = ITEMS.register("heavy_iron_helmet",
            () -> new ArmorItem(ModArmorMaterial.HIRON, EquipmentSlotType.HEAD, new Item.Properties().group(Armors.AMR)));

    public static final RegistryObject<ArmorItem> HEAVY_IRON_CHESTPLATE = ITEMS.register("heavy_iron_chestplate",
            () -> new ArmorItem(ModArmorMaterial.HIRON, EquipmentSlotType.CHEST, new Item.Properties().group(Armors.AMR)));

    public static final RegistryObject<ArmorItem> HEAVY_IRON_LEGGINGS = ITEMS.register("heavy_iron_leggings",
            () -> new ArmorItem(ModArmorMaterial.HIRON, EquipmentSlotType.LEGS, new Item.Properties().group(Armors.AMR)));

    public static final RegistryObject<ArmorItem> HEAVY_IRON_BOOTS = ITEMS.register("heavy_iron_boots",
            () -> new ArmorItem(ModArmorMaterial.HIRON, EquipmentSlotType.FEET, new Item.Properties().group(Armors.AMR)));
    
    
    //ARMOR HEAVY GOLD 
    public static final RegistryObject<ArmorItem> HEAVY_GOLD_HELMET = ITEMS.register("heavy_gold_helmet",
            () -> new ArmorItem(ModArmorMaterial.HGOLD, EquipmentSlotType.HEAD, new Item.Properties().group(Armors.AMR)));

    public static final RegistryObject<ArmorItem> HEAVY_GOLD_CHESTPLATE = ITEMS.register("heavy_gold_chestplate",
            () -> new ArmorItem(ModArmorMaterial.HGOLD, EquipmentSlotType.CHEST, new Item.Properties().group(Armors.AMR)));

    public static final RegistryObject<ArmorItem> HEAVY_GOLD_LEGGINGS = ITEMS.register("heavy_gold_leggings",
            () -> new ArmorItem(ModArmorMaterial.HGOLD, EquipmentSlotType.LEGS, new Item.Properties().group(Armors.AMR)));

    public static final RegistryObject<ArmorItem> HEAVY_GOLD_BOOTS = ITEMS.register("heavy_gold_boots",
            () -> new ArmorItem(ModArmorMaterial.HGOLD, EquipmentSlotType.FEET, new Item.Properties().group(Armors.AMR)));
    
    
    //ARMOR WOOD
    public static final RegistryObject<ArmorItem> WOOD_HELMET = ITEMS.register("wood_helmet",
            () -> new ArmorItem(ModArmorMaterial.WOOD, EquipmentSlotType.HEAD, new Item.Properties().group(Armors.AMR)));

    public static final RegistryObject<ArmorItem> WOOD_CHESTPLATE = ITEMS.register("wood_chestplate",
            () -> new ArmorItem(ModArmorMaterial.WOOD, EquipmentSlotType.CHEST, new Item.Properties().group(Armors.AMR)));

    public static final RegistryObject<ArmorItem> WOOD_LEGGINGS = ITEMS.register("wood_leggings",
            () -> new ArmorItem(ModArmorMaterial.WOOD, EquipmentSlotType.LEGS, new Item.Properties().group(Armors.AMR)));

    public static final RegistryObject<ArmorItem> WOOD_BOOTS = ITEMS.register("wood_boots",
            () -> new ArmorItem(ModArmorMaterial.WOOD, EquipmentSlotType.FEET, new Item.Properties().group(Armors.AMR)));
    
    //ARMOR STONE
    public static final RegistryObject<ArmorItem> STONE_HELMET = ITEMS.register("stone_helmet",
            () -> new ArmorItem(ModArmorMaterial.STONE, EquipmentSlotType.HEAD, new Item.Properties().group(Armors.AMR)));

    public static final RegistryObject<ArmorItem> STONE_CHESTPLATE = ITEMS.register("stone_chestplate",
            () -> new ArmorItem(ModArmorMaterial.STONE, EquipmentSlotType.CHEST, new Item.Properties().group(Armors.AMR)));

    public static final RegistryObject<ArmorItem> STONE_LEGGINGS = ITEMS.register("stone_leggings",
            () -> new ArmorItem(ModArmorMaterial.STONE, EquipmentSlotType.LEGS, new Item.Properties().group(Armors.AMR)));

    public static final RegistryObject<ArmorItem> STONE_BOOTS = ITEMS.register("stone_boots",
            () -> new ArmorItem(ModArmorMaterial.STONE, EquipmentSlotType.FEET, new Item.Properties().group(Armors.AMR)));
    
    
    //ARMOR TIN
    public static final RegistryObject<ArmorItem> TIN_HELMET = ITEMS.register("tin_helmet",
            () -> new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.HEAD, new Item.Properties().group(Armors.AMR)));

    public static final RegistryObject<ArmorItem> TIN_CHESTPLATE = ITEMS.register("tin_chestplate",
            () -> new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.CHEST, new Item.Properties().group(Armors.AMR)));

    public static final RegistryObject<ArmorItem> TIN_LEGGINGS = ITEMS.register("tin_leggings",
            () -> new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.LEGS, new Item.Properties().group(Armors.AMR)));

    public static final RegistryObject<ArmorItem> TIN_BOOTS = ITEMS.register("tin_boots",
            () -> new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.FEET, new Item.Properties().group(Armors.AMR)));
    

	
}
