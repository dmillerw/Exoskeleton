package exoskeleton.common.command

import exoskeleton.common.lib.skills.PlayerSkills
import exoskeleton.common.network.{PacketSyncSkills, PacketHandler}
import net.minecraft.command.{CommandBase, ICommandSender}
import net.minecraft.entity.player.{EntityPlayerMP, EntityPlayer}

class CommandGiveSkill
extends CommandBase{
  override def getCommandName: String ={
    return "give_skill";
  }

  override def getCommandUsage(p_71518_1_ : ICommandSender): String ={
    return "give_skill [tree] [skill tag]";
  }

  override def processCommand(sender: ICommandSender, args: Array[String]): Unit ={
    val tree: String = args(0);
    val skill: String = args(1);

    if(sender.isInstanceOf[EntityPlayer]){
      PlayerSkills.get(sender.asInstanceOf[EntityPlayer]).addSkill(tree, skill);
      PacketHandler.instance.sendTo(new PacketSyncSkills(sender.asInstanceOf[EntityPlayer]), sender.asInstanceOf[EntityPlayerMP]);
    }
  }
}