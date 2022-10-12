package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GameService {

	private static List<Game> games = new ArrayList<Game>();

	private static long nextGameId = 1;
	private static long nextTeamId = 1;
	private static long nextPlayerId = 1;

	private static GameService instance = new GameService();

	private GamerService(){}

	public static GameService getInstance() {
		return instance;
	}

	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		if (getGame(name) != null) {
			game = getGame(name);
		}

		// if found, simply return the existing instance

		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	public Game getGame(long id) {

		Game game = null;

		for (int i = 0; i < getGameCount(); i++) {
			if (games.get(i).getId() == id) {
				game = games.get(i);
			}
		}
		return game;
	}

	public Game getGame(String name) {

		Game game = null;

		for (int i = 0; i < getGameCount(); i++) {
			
			if (games.get(i).getName() == name) {
				game = games.get(i);
			}
		}

		return game;
	}

	Game getGame(int index) {
		return games.get(index);
	}
	
	public getNextPlayerId() {
		return nextPlayerId++;
	}

	public getNextTeamId() {
		return nextTeamId++;
	}

	public int getGameCount() {
		return games.size();
	}
}
/** The iterator pattern is a design pattern in which the iterator is used to go through a containter and access the containers elements.
 *  This problem resolves recurring design problems to design flexible and reusable objects so there is no need to constantly create a object.
 */

