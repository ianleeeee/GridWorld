import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld2 {
	public static void main(String[] args) {
		int y = 0;
		World world = new World();
		world.show();
		Bug bug = new Bug();

		for (int i = 0; i < 11; i++) {

			Location cross = new Location(i, i);
			world.add(cross, bug);
			world.add(new Location(9 - i, i), bug);
		}

	}
}
