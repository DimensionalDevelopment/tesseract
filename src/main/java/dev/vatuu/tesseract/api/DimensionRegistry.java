package dev.vatuu.tesseract.api;

import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;

import java.util.function.BiFunction;

public interface DimensionRegistry {

    DimensionType registerDimensionType(Identifier name, boolean hasSkyLight, BiFunction<World, DimensionType, ? extends Dimension> create);
}