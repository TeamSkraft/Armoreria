package com.tsk.armoreria.armor;

import com.tsk.armoreria.core.init.ItemInit;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


import java.util.function.Supplier;

import com.tsk.armoreria.Armors;

public enum ModArmorMaterial implements IArmorMaterial {
	
	VIBRANIUM(Armors.MOD_ID + ":vibranium",40, new int[] {4,6,8,4}, 18,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F, () -> {return Ingredient.fromItems(ItemInit.VIBRANIUM.get());}),
	
	ENDERITE(Armors.MOD_ID + ":enderite",50, new int[] {5,7,9,5}, 20,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F, () -> {return Ingredient.fromItems(ItemInit.ENDERITE_INGOT.get());}),

	HIRON(Armors.MOD_ID + ":hiron",30, new int[] {3,5,7,3}, 16,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0F, () -> {return Ingredient.fromItems(ItemInit.REPAIRER.get());}),
	
	HGOLD(Armors.MOD_ID + ":hgold",30, new int[] {3,5,7,3}, 16,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0F, () -> {return Ingredient.fromItems(ItemInit.REPAIRER.get());}),
	
	WOOD(Armors.MOD_ID + ":wood",20, new int[] {2,3,5,2}, 10,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5F, () -> {return Ingredient.fromItems(ItemInit.REPAIRER.get());}),
	
	STONE(Armors.MOD_ID + ":stone",21, new int[] {2,4,6,2}, 10,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5F, () -> {return Ingredient.fromItems(ItemInit.REPAIRER.get());}),
	
	TIN(Armors.MOD_ID + ":tin",21, new int[] {2,4,6,2}, 10,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5F, () -> {return Ingredient.fromItems(ItemInit.TIN.get());});


	private static final int[] MAX_DAMAGE_ARRAY = new int[] {11, 16, 15, 13};
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantability;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final Supplier<Ingredient> repairMaterial;
	


				

	ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability,
					 SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial) {
		this.name = name;
		this.maxDamageFactor = maxDamageFactor;
		this.damageReductionAmountArray = damageReductionAmountArray;
		this.enchantability = enchantability;
		this.soundEvent = soundEvent;
		this.toughness = toughness;
		this.repairMaterial = repairMaterial;

	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		// TODO Auto-generated method stub
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}
	

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		// TODO Auto-generated method stub
		return this.damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() {
		// TODO Auto-generated method stub
		return this.soundEvent;
	}

	@Override
	public Ingredient getRepairMaterial() {
		// TODO Auto-generated method stub
		return this.repairMaterial.get();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public float getToughness() {
		// TODO Auto-generated method stub
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		// TODO Auto-generated method stub
		return 0;
	}

}
