package org.bukkit.craftbukkit.util;

import net.minecraft.util.ResourceLocation;

import org.bukkit.NamespacedKey;

public final class CraftNamespacedKey {

    public CraftNamespacedKey() {
    }

    public static NamespacedKey fromStringOrNull(String string) {
        if (string == null || string.isEmpty()) {
            return null;
        }
        ResourceLocation minecraft = new ResourceLocation(string);
        return (minecraft == null) ? null : fromMinecraft(minecraft);
    }

    public static NamespacedKey fromString(String string) {
        return fromMinecraft(new ResourceLocation(string));
    }

    public static NamespacedKey fromMinecraft(ResourceLocation minecraft) {
        return new NamespacedKey(minecraft.getResourceDomain(), minecraft.getResourcePath());
    }

    public static ResourceLocation toMinecraft(NamespacedKey key) {
        return new ResourceLocation(key.getNamespace(), key.getKey());
    }
}
