package fr.univartois.butinfo.r304.flatcraft.model.map;

import fr.univartois.butinfo.r304.flatcraft.model.Cell;
import fr.univartois.butinfo.r304.flatcraft.model.CellFactory;
import fr.univartois.butinfo.r304.flatcraft.model.resources.Resource;
import fr.univartois.butinfo.r304.flatcraft.model.resources.ToolType;
import fr.univartois.butinfo.r304.flatcraft.view.ISpriteStore;
import fr.univartois.butinfo.r304.flatcraft.view.Sprite;

import java.util.Random;

public class NetherFactory implements CellFactory {
    private ISpriteStore spriteStore;

    @Override
    public void setSpriteStore(ISpriteStore spriteStore) {
        this.spriteStore=spriteStore;
    }

    @Override
    public Cell createSky() {
        Sprite sprite = spriteStore.getSprite("coal_block");
        return new Cellule(sprite);
    }

    @Override
    public Cell createSoilSurface() {
        Random r = new Random();
        int n = r.nextInt(5);
        if (n<=3) {
            Sprite sprite = spriteStore.getSprite("desert_stone");
            Resource resource = new Resource("desert_stone", sprite, ToolType.NO_TOOL, 1);
            return new Cellule(resource);
        }
        Sprite sprite = spriteStore.getSprite("lava");
        Resource resource = new Resource("lava", sprite, ToolType.NO_TOOL, 1);
        return new Cellule(resource);
    }

    @Override
    public Cell createSubSoil() {
        Random r = new Random();
        int n = r.nextInt(100);
        if (n<=95) {
            Sprite sprite = spriteStore.getSprite("desert_stone");
            Resource resource = new Resource("desert_stone", sprite, ToolType.NO_TOOL, 1);
            return new Cellule(resource);
        }
        Sprite sprite = spriteStore.getSprite("lava");
        Resource resource = new Resource("lava", sprite, ToolType.NO_TOOL, 1);
        return new Cellule(resource);
    }

    @Override
    public Cell createTrunk() {
        Random r = new Random();
        int n = r.nextInt(5);
        if (n<=3) {
            Sprite sprite = spriteStore.getSprite("desert_stone");
            Resource resource = new Resource("desert_stone", sprite, ToolType.NO_TOOL, 1);
            return new Cellule(resource);
        }
        Sprite sprite = spriteStore.getSprite("lava");
        Resource resource = new Resource("lava", sprite, ToolType.NO_TOOL, 1);
        return new Cellule(resource);
    }

    @Override
    public Cell createLeaves() {
        Sprite sprite = spriteStore.getSprite("coal_block");
        return new Cellule(sprite);
    }
}
