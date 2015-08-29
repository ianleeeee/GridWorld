import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

import java.awt.Color;
import java.util.Random;

public class GridWorld {
	// Copyright Wintriss Technical Schools 2014
	// Need Gridworld handouts (4 handouts with descriptions of World, Bug, Grid
	// and Location objects. look for laminated sheets.)
	public static void main(String[] args) {

		World world = new World();
		world.show();
		// In this exercise we’ll use OBJECTS and METHODS to make a world that
		// contains bugs and flowers.

		// 0. Download the Gridworld JAR.
		// /1. Make a new Java Project and add this JAR to it.
		// Right click your project and add it as an External JAR (Under Java
		// Build Path > Libraries).
		// 2. Figure out how to get the World to show.

		// 3. Figure out how to add a Bug to the world (clue: you will need the
		// Bug and Location objects)
		Bug bug = new Bug();
		Location location1 = new Location(5, 5);
		world.add(location1, bug);
		// 4. Add another bug at a random location in the world.
		Random bugLocation = new Random();
		int grid1 = bugLocation.nextInt(9);
		int grid2 = bugLocation.nextInt(9);
		Location location2 = new Location(grid1, grid2);
		Bug bug2 = new Bug();
		bug2.setColor(Color.blue);
		bug2.turn();
		bug2.turn();
		Flower flower = new Flower();
		Flower flower2 = new Flower();
		Location flowerLocation = new Location(grid1, grid2 - 1);
		Location flowerLocation2 = new Location(grid1, grid2 + 1);
		world.add(location2, bug2);
		world.add(flowerLocation, flower);
		world.add(flowerLocation2, flower2);

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				Flower ian = new Flower();
				ian.setColor(Color.red);
				if (i % 2 == 0) {
					ian.setColor(Color.white);
				}
				if (i <= 4 && j <= 4) {
					ian.setColor(Color.blue);
				}
				world.add(new Location(i, j), ian);

			}

		}
		// 5. Change the color of that bug to blue.
		// 6. Make the bug face to the right.
		// 7. Add flowers to the left and right of the bug.
		// 8. Fill the whole world with flowers!
		// *9. [Optional] Color the flowers in rows like the American flag (red
		// & white)

	}
}
