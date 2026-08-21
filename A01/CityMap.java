import java.util.Random;

public class CityMap extends Map {
    @Override
    public Tile createTile() {
        // road forest building
        Tile tile = new RoadTile();
        Random r = new Random();
        switch (r.nextInt(3)) {
            case 0:
                tile = new RoadTile();
                break;
            case 1:
                tile = new ForestTile();
                break;
            case 2:
                tile = new BuildingTile();
                break;
        }
        return tile;
    }
}
