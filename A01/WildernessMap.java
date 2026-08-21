import java.util.Random;

public class WildernessMap extends Map {
    @Override
    public Tile createTile() {
        // swamp water forest
        Tile tile = new SwampTile();
        Random r = new Random();
        switch (r.nextInt(3)) {
            case 0:
                tile = new SwampTile();
                break;
            case 1:
                tile = new WaterTile();
                break;
            case 2:
                tile = new ForestTile();
                break;
        }
        return tile;
    }
}
