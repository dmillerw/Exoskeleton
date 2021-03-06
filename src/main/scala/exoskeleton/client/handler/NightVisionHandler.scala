package exoskeleton.client.handler

import cpw.mods.fml.client.FMLClientHandler
import cpw.mods.fml.common.eventhandler.SubscribeEvent
import exoskeleton.client.overlay.NightvisionOverlay
import exoskeleton.common.lib.ArmorHelper
import exoskeleton.common.lib.data.DataManager
import net.minecraft.entity.player.EntityPlayer
import net.minecraftforge.client.event.RenderWorldLastEvent

object NightVisionHandler{
  private val overlay = new NightvisionOverlay;

  @SubscribeEvent
  def render(e: RenderWorldLastEvent): Unit ={
    val mc = FMLClientHandler.instance().getClient;
    val player = mc.thePlayer.asInstanceOf[EntityPlayer];

    if(DataManager.get(player).nightVisionEnabled() && ArmorHelper.hasExoHelm(player)){
      this.overlay.draw(mc);
    }
  }
}