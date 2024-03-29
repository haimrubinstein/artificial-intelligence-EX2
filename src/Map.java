
/**
 * the map class
 * we are not keeping a classic map of object,
 * we are just saving the parsed file input for better performance
 * we are creating the node on demand.
 */
public class Map {
	private String[][] map;
	private int size;

	public Map clone(){
		String[][] ma = new String[5][5];
		for (int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				ma[i][j] = this.map[i][j];
			}
		}
		return new Map(this.size,ma);
	}
	public void print(){
		for (int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(this.map[i][j] );
			}
			System.out.println();
		}
	}
	/**
	 * the constructor
	 */
	public Map(int mapSize, String[][] arr) {
		this.map = arr;
		this.size = mapSize;
	}

	/**
	 * get node representation
	 */
	public String getNodeStatus(int x, int y) {
		if ((x >= this.size) || (x < 0) || (y >= this.size) || (y < 0)) {
			return null; //todo what will apppend with equals to null
		}
		return this.map[x][y];
	}

	/**
	 * set a given block on the map
	 */
	public void setBlock(int x, int y, String color) {
		this.map[x][y] = color;
	}

	/**
	 * get map size given in file input
	 */
	public int getSize() {
		return size;
	}

}
