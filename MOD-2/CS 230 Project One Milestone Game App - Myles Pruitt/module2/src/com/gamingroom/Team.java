package com.gamingroom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity{

	private static List<Player> players = new ArrayList<Player>();

	public Team(long id, String name) {
		this.id = id;
		this.name = name;
	}

	// Add player to arraylist
	public addPlayer(String name){

		GameService service = GameService.getInstance();

		Player player = null;

		for (int i = 0; i < players.size() - 1; i++) {
			if (players.get(i).getName() == name) {
				player = players.get(i);
			}
		}

		if (players == null) {
			players = new Player(service.getNextPlayerId(), name);
			players.add(player);
		}

		return player;
	}
	
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + "]";
	}
}
