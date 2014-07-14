package com.spazzy.ChocolateFactory.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CocoaBeansUncooked extends CocoaFactoryItems
{
    public CocoaBeansUncooked()
    {
        super();
        this.setUnlocalizedName("cocoaBeanUncooked");
    }
    
    public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
    {

                Block block = world.getBlock(p_77648_4_, p_77648_5_, p_77648_6_);
                int i1 = world.getBlockMetadata(p_77648_4_, p_77648_5_, p_77648_6_);

                if (block == Blocks.log && BlockLog.func_150165_c(i1) == 3)
                {
                    if (p_77648_7_ == 0)
                    {
                        return false;
                    }

                    if (p_77648_7_ == 1)
                    {
                        return false;
                    }

                    if (p_77648_7_ == 2)
                    {
                        --p_77648_6_;
                    }

                    if (p_77648_7_ == 3)
                    {
                        ++p_77648_6_;
                    }

                    if (p_77648_7_ == 4)
                    {
                        --p_77648_4_;
                    }

                    if (p_77648_7_ == 5)
                    {
                        ++p_77648_4_;
                    }

                    if (world.isAirBlock(p_77648_4_, p_77648_5_, p_77648_6_))
                    {
                        int j1 = Blocks.cocoa.onBlockPlaced(world, p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_8_, p_77648_9_, p_77648_10_, 0);
                        world.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, Blocks.cocoa, j1, 2);

                        if (!entityplayer.capabilities.isCreativeMode)
                        {
                            --itemstack.stackSize;
                        }
                    }

                    return true;
                }
            

            return false;
        }
    }
