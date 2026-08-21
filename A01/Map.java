public abstract class Map {
    Tile[][] tileArray = new Tile[5][8];
    public void display() {
        // create tiles
        for (Tile[] tile : tileArray) {
            for (int i = 0; i < tile.length; i++) {
                tile[i] = createTile();
            }
        }

        // get tile chars
        String[] tileStringArray = new String[5];
        for (int i = 0; i < tileStringArray.length; i++) {
            tileStringArray[i] = "";
            for (Tile tile : tileArray[i]) {
                tileStringArray[i] += tile.getCharacter();
            }
        }

        // display tiles
        System.out.println("********");
        for (String string : tileStringArray) {
            System.out.println(string);
        }
        System.out.println("********");
    }

    public abstract Tile createTile();
}
