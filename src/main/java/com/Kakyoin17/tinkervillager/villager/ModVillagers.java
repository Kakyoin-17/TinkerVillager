package com.Kakyoin17.tinkervillager.villager;

import com.google.common.collect.ImmutableSet;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import slimeknights.tconstruct.smeltery.TinkerSmeltery;
import static com.Kakyoin17.tinkervillager.TinkerVillager.MODID;

public class ModVillagers {
    //注册职业方块，
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES,MODID);
    //注册职业
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS,MODID);
    //注册职业方块,ImmutableSet获取方块所有状态的集合
    public static final RegistryObject<PoiType> Seared_Melter_POI = POI_TYPES.register("seared_melter_poi",
            ()->new PoiType(ImmutableSet.copyOf(TinkerSmeltery.searedMelter.get().getStateDefinition().getPossibleStates()),
                    1,1));//(检测时间，工作半径）
    public static final RegistryObject<PoiType> Scorched_Alloyer_POI = POI_TYPES.register("scorched_alloyer_poi",
            ()->new PoiType(ImmutableSet.copyOf(TinkerSmeltery.scorchedAlloyer.get().getStateDefinition().getPossibleStates()),
                    1,1));
    //注册职业,工作方块
    public static final RegistryObject<VillagerProfession> SEAR_MASTER = VILLAGER_PROFESSIONS.register("sear_master",
            () -> new VillagerProfession("sear_master",x->x.get() == Seared_Melter_POI.get(), x -> x.get() == Seared_Melter_POI.get(),
                    ImmutableSet.of(),ImmutableSet.of(),//空
                    SoundEvents.VILLAGER_WORK_ARMORER));
    public static final RegistryObject<VillagerProfession> SCORCH_MASTER = VILLAGER_PROFESSIONS.register("scorch_master",
            () -> new VillagerProfession("scorch_master",x->x.get() == Scorched_Alloyer_POI.get(),
                    x -> x.get() == Scorched_Alloyer_POI.get(),ImmutableSet.of(),ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_TOOLSMITH));








    //注册到总线
    public static void register (IEventBus eventBus){
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }

}
