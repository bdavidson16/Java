/*
 * Bailey Davidson
 * CS230 Project One
 * 5/26/2024
 */

package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Entity {

	private long id;
   	private String name;
	
    /**
    * makes constructor private to not allow class to be instantiated,    
    * and make sure there is only one instance at a time in memory
    */
    private Entity() {};

    public Entity(long id, String name) {
        this.id = id;
		this.name = name;
    };
	
	public long getId() {
		return id;
	}

    public String getName() {
		return name;
	}
    
    public static toString() {
        return "Entity [id=" + id + ", name=" + name + "]";
    }
}
