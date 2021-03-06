package exoskeleton.core;

public enum ObfuscationMappings{
    ENTITY_ENDERMAN("net.minecraft.entity.monster.EntityEnderman", "ya"),
    ITEM_BOW("net.minecraft.item.ItemBow", "abm");

    private final String deobfuscated;
    private final String obfuscated;

    private ObfuscationMappings(String deobf, String obf){
        this.deobfuscated = deobf;
        this.obfuscated = obf;
    }

    public boolean isOf(String name){
        return this.deobfuscated.equalsIgnoreCase(name) || this.obfuscated.equalsIgnoreCase(name);
    }

    public boolean isObfuscated(String name){
        return this.obfuscated.equalsIgnoreCase(name);
    }

    public boolean isDeobfuscated(String name){
        return this.deobfuscated.equalsIgnoreCase(name);
    }
}