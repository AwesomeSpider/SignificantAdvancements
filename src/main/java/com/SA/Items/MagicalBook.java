package com.SA.Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class MagicalBook extends Item {

	public MagicalBook(String name){
		setUnlocalizedName(name);
	}
	
	@Override
	public void onCreated(ItemStack item, World world, EntityPlayer player){
		item.stackTagCompound
	}
}
