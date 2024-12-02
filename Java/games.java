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
	private static List<Team> teams = new List<Team>();
	
	long id;
	String name;
	
	/**
	 * Hide the default constructor to prevent creating empty instances.
	 */
	private Game() {
	}

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		this();
		this.id = id;
		this.name = name;
	}

	public Team addTeam(String name) {

		// a local team instance
		Team team = null;

		// looks for existing team with same name
		Iterator<Team> iterator = teams.iterator();
		while (iterator.hasNext()) {
			Team te = iterator.next();
			// if found, the existing instance is returned
			if (te.getName().equals(name)) {
				return te;
			}
		}
		/* if not found, a new game instance is made and added to list of teams */
		team = new Team(nextGameId++, name);
		teams.add(team);
		
		// returns the new/existing game instance to the caller
		return Team;
	}

	@Override
	public String toString() {
		
		return "Game [id=" + id + ", name=" + name + "]";
	}

}
