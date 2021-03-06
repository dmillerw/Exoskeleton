package exoskeleton.common

import cpw.mods.fml.common.registry.GameRegistry
import exoskeleton.common.item._

object ExoItems{
  val itemExoArmorHelm: ItemExoHelmet = new ItemExoHelmet();
  val itemExoArmorChest: ItemExoChestplate = new ItemExoChestplate();
  val itemExoArmorLegs: ItemExoLeggings = new ItemExoLeggings();
  val itemExoArmorBoots: ItemExoBoots = new ItemExoBoots();

  def init(): Unit ={
    GameRegistry.registerItem(this.itemExoArmorBoots, "itemExoArmorBoots");
    GameRegistry.registerItem(this.itemExoArmorChest, "itemExoArmorChest");
    GameRegistry.registerItem(this.itemExoArmorHelm, "itemExoArmorHelm");
    GameRegistry.registerItem(this.itemExoArmorLegs, "itemExoArmorLegs");
  }
}
