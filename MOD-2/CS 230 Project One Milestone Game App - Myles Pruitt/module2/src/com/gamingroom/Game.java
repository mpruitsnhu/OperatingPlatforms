package com.gamingroom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity {

	private static List<Team> teams = new ArrayList<Team>();

	public Game(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public addTeam(String name){

		GameService service = new GameService();

		Team team = null;

		for (int i = 0; i < teams.size() - 1; i++) {
			if (teams.get(i).getName() == name) {
				team = teams.get(i);
			}
		}

		if (teams == null) {
			teams = new Team(service.getNextPlayerId(), name);
			teams.add(team);
		}

		return team;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + "]";
	}
}
