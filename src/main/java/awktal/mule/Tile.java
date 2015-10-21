package awktal.mule;

public class Tile {

    private int x, y;
    private transient Player owner;
    private TileType type;
    private Mule mule;

    public Tile (int x, int y, TileType type) {
        this.x = x;
        this.y = y;
        this.type = type;
        mule = null;
    }

    public TileType getType() {
        return this.type;
    }

    public Player setOwner(Player owner){
        return this.owner = owner;
    }
    public Player getOwner() {
        return this.owner;
    }
    public boolean isOwned() {
        return owner != null;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setMule(Mule mule) {
        this.mule = mule;
    }
    public Mule getMule() {
        return mule;
    }
    public boolean hasMule() {
        return mule != null;
    }
    public Inventory calculateProduction() {
        if (mule == null) {
            return new Inventory();
        } else {
            return type.calculateProduction(mule.getType().getProductionType());
        }
    }
}