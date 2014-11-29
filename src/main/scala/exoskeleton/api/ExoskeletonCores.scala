package exoskeleton.api

import java.util

import net.minecraft.item.ItemStack

import scala.collection.JavaConversions._

object ExoskeletonCores{
  private val cores: util.List[Core] = new util.LinkedList[Core]();

  def registerCore(c: Core): Unit ={
    this.cores.add(c);
  }

  def getByName(n: String): Core={
    for(c: Core <- this.cores){
      if(c.getID().equalsIgnoreCase(n)){
        return c;
      }
    }

    return null;
  }

  def findCore(stack: ItemStack): Core={
    if(stack.hasTagCompound() &&
       stack.getTagCompound.hasKey(ExoskeletonTag.IDENTIFIER)){

      return getByName(ExoskeletonTag.getTag(stack).getString("coreName"));
    }

    return null;
  }

  def findTree(stack: ItemStack): Tree={
    if(stack.hasTagCompound() &&
       stack.getTagCompound.hasKey(ExoskeletonTag.IDENTIFIER)){

      return getByName(ExoskeletonTag.getTag(stack).getString("coreName")).getTree();
    } else{
      return null;
    }
  }
}