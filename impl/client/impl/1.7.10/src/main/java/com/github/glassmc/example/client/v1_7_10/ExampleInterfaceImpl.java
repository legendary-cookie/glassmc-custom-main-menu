package com.github.glassmc.example.client.v1_7_10;

import com.github.glassmc.example.client.IExampleInterface;
import net.minecraft.client.MinecraftClient;

public class ExampleInterfaceImpl implements IExampleInterface {

    @Override
    public boolean isMAC() {
        return MinecraftClient.IS_MAC;
    }

}
