/*
 * Bailey Davidson
 * CS230 Project One
 * 5/26/2024
 */

package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	
	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	
	//creates new object of GameService
	private static GameService instance = new GameService();
	
	/**
	 * makes constructor private to not allow class to be instantiated, 
	 * and make sure there is only one instance at a time in memory
	 */
	private GameService() {};
	
	//accesses the singular instance
	public static GameService getInstance() {
		return instance;
	}
	
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// looks for existing game with same name
		Iterator<Game> iterator = games.iterator();
		while (iterator.hasNext()) {
			Game ga = iterator.next();
			// if found, the existing instance is returned
			if (ga.getName().equals(name)) {
				return ga;
			}
		}
		// if not found, a new game instance is made and added to list of games
		game = new Game(nextGameId++, name);
		games.add(game);
		
		// returns the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// looks  for existing game with same id
		Iterator<Game> iterator = games.iterator();
		while (iterator.hasNext()) {
			Game ga = iterator.next();
			// if found, assigns that instance to the local variable
			if (ga.getId() == id) {
				return ga;
			}
		}
	
		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// looks for existing game with same name
		Iterator<Game> iterator = games.iterator();
		while (iterator.hasNext()) {
			Game ga = iterator.next();
			//if found, assigns that instance to the local variable
			if (ga.getName().equals(name)) {
				return ga;
			}
		}
		
		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
}
