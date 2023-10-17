package fr.univartois.butinfo.r304.flatcraft.model.map;

import fr.univartois.butinfo.r304.flatcraft.model.IMovable;
import fr.univartois.butinfo.r304.flatcraft.model.movables.player.Player;
import fr.univartois.butinfo.r304.flatcraft.model.resources.Resource;
import fr.univartois.butinfo.r304.flatcraft.view.Sprite;

public class Cellule extends AbstractCell {
    protected Cellule(int row, int column) {
        super(row, column);
    }

    protected Cellule(Sprite sprite) {
        super(sprite);
    }

    protected Cellule(Resource resource) {
        super(resource);
    }

    /* pas sûr de cette fonction */
    @Override
    public boolean move(IMovable movable) {
        if (this.getResource()==null) {
            movable.setX(this.getColumn()*this.getSprite().getWidth());
            movable.setY(this.getRow()*this.getSprite().getHeight());
            return true;
        }
        return false;
    }

    @Override
    public boolean dig(IMovable player) {
        Resource resource = getResource();
        if (resource!=null) {
            if (resource.getHardness()!=0) {
                resource.dig();
            } else {
                ((Player) player).addObject(this.getResource().digBlock());
                return true;
            }
        }
        return false;
    }
}
