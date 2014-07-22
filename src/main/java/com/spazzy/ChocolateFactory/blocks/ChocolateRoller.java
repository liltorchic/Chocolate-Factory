package com.spazzy.ChocolateFactory.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

import com.spazzy.ChocolateFactory.CocoaBase;
import com.spazzy.ChocolateFactory.CreativeTabChocolate;
import com.spazzy.ChocolateFactory.reference.GuiId;
import com.spazzy.ChocolateFactory.reference.Reference;
import com.spazzy.ChocolateFactory.reference.RenderIds;
import com.spazzy.ChocolateFactory.tileentity.TileEntityChocolateRoller;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ChocolateRoller extends BlockContainer
{

    public ChocolateRoller()
    {
        super(Material.iron);
        this.setHardness(5.0f);
        this.setBlockName("chocolateRoller");
        this.setCreativeTab(CreativeTabChocolate.ChocoTab);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
        this.setBlockTextureName(Reference.MODID.toLowerCase() + ":chocolateRoller");
    }
    
    @Override
    public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack itemStack)
    {
    	int l = MathHelper.floor_double((double)(entityliving.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
    	world.setBlockMetadataWithNotify(i, j, k, l, 2);
    }
    
    @Override
    public TileEntity createNewTileEntity(World world, int p_149915_2_) {
            return new TileEntityChocolateRoller();
    }
    
    //You don't want the normal render type, or it wont render properly.
    @Override
    public int getRenderType() {
            return -1;
    }
    
    //It's not an opaque cube, so you need this.
    @Override
    public boolean isOpaqueCube() {
            return false;
    }
    
    //It's not a normal block, so you need this too.
    public boolean renderAsNormalBlock() {
            return false;
    }




    
    
}