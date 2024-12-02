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
public class Team extends Entity {
	private static List<Player> players = new List<Player>();
	
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Player addPlayer(String name) {

		// a local player instance
		Player player = null;

		// looks for existing player with same name
		Iterator<Player> iterator = players.iterator();
		while (iterator.hasNext()) {
			Player pla = iterator.next();
			// if found, the existing instance is returned
			if (pla.getName().equals(name)) {
				return pla;
			}
		}
		// if not found, a new game instance is made and added to list of players
		player = new Player(nextGameId++, name);
		players.add(player);
		
		// returns the new/existing game instance to the caller
		return Player;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + "]";
	}
}
