package com.Kakyoin17.tinkervillager.event;

import com.Kakyoin17.tinkervillager.villager.ModVillagers;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import slimeknights.tconstruct.shared.TinkerCommons;
import slimeknights.tconstruct.shared.TinkerMaterials;
import slimeknights.tconstruct.smeltery.TinkerSmeltery;
import slimeknights.tconstruct.tools.TinkerTools;
import slimeknights.tconstruct.world.TinkerWorld;

import java.util.List;


import static com.Kakyoin17.tinkervillager.TinkerVillager.MODID;

@Mod.EventBusSubscriber(modid = MODID,bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEventListener {
    //村民交易
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() == ModVillagers.SEAR_MASTER.get()) {                       //SEAR_MASTER村民
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();//获取交易列表
            //level 1
            int villagerLevel1 = 1;                                                    //交易等级
            trades.get(villagerLevel1).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(TinkerSmeltery.grout.get(), 32),                     //交易花费
                    new ItemStack(Items.EMERALD, 1),                                   //交易获得
                    64, 3, 0.02F));                                                    //最大交易次数，交易获得经验，价格波动区间
            trades.get(villagerLevel1).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(TinkerSmeltery.searedBrick.get(), 16),
                    64, 3, 0.02F));
            //level 2
            int villagerLevel2 = 2;
            trades.get(villagerLevel2).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(TinkerSmeltery.searedBricks.get(), 8),
                    32, 6, 0.02F));
            trades.get(villagerLevel2).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(TinkerSmeltery.searedGlass.get(), 8),
                    32, 6, 0.02F));
            //level 3
            int villagerLevel3 = 3;
            trades.get(villagerLevel3).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.COPPER_INGOT, 4),
                    new ItemStack(TinkerSmeltery.smelteryController.get(), 1),
                    4, 24, 0.02F));
            trades.get(villagerLevel3).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(TinkerSmeltery.searedDrain.get(), 2),
                    16, 12, 0.02F));
            //level 4
            int villagerLevel4 = 4;
            trades.get(villagerLevel4).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(TinkerSmeltery.searedDuct.get(), 2),
                    8, 24, 0.02F));
            trades.get(villagerLevel4).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(TinkerSmeltery.searedChute.get(), 2),
                    8, 24, 0.02F));
            //level 5
            int villagerLevel5 = 5;
            trades.get(villagerLevel5).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 4),
                    new ItemStack(TinkerTools.cleaver.get()),
                    4, 36, 0.02F));
            trades.get(villagerLevel5).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(TinkerSmeltery.searedSoulGlass.get(), 4),
                    4, 12, 0.02F));
        }
        if (event.getType() == ModVillagers.SCORCH_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            //level 1
            int villagerLevel1 = 1;
            trades.get(villagerLevel1).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(TinkerCommons.obsidianPane.get(), 4),
                    new ItemStack(Items.EMERALD, 1),
                    64, 3, 0.02F));
            trades.get(villagerLevel1).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(TinkerSmeltery.scorchedBrick.get(), 16),
                    64, 3, 0.02F));
            //level 2
            int villagerLevel2 = 2;
            trades.get(villagerLevel2).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(TinkerSmeltery.scorchedBricks.get(), 8),
                    32, 6, 0.02F));
            trades.get(villagerLevel2).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(TinkerSmeltery.scorchedGlass.get(), 8),
                    32, 6, 0.02F));
            //level 3
            int villagerLevel3 = 3;
            trades.get(villagerLevel3).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.COPPER_INGOT, 4),
                    new ItemStack(TinkerSmeltery.foundryController.get(), 1),
                    4, 24, 0.02F));
            trades.get(villagerLevel3).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(TinkerSmeltery.scorchedDrain.get(), 2),
                    16, 12, 0.02F));
            //level 4
            int villagerLevel4 = 4;
            trades.get(villagerLevel4).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(TinkerSmeltery.scorchedDuct.get(), 2),
                    8, 24, 0.02F));
            trades.get(villagerLevel4).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(TinkerSmeltery.scorchedChute.get(), 2),
                    8, 24, 0.02F));
            //level 5
            int villagerLevel5 = 5;
            trades.get(villagerLevel5).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(TinkerWorld.rawCobalt, 1),
                    new ItemStack(TinkerMaterials.debrisNugget.get(), 2),
                    4, 36, 0.02F));
            trades.get(villagerLevel5).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(TinkerWorld.cobaltOre.get(), 10),
                    new ItemStack(Items.ANCIENT_DEBRIS, 3),
                    4, 12, 0.02F));
        }
    }
}
