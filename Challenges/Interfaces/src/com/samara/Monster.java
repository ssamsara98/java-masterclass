package com.samara;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
	// properties
	private String name;
	private int hitPoints;
	private int strength;

	// constructors
	public Monster(String name, int hitPoints, int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
	}

	// getters
	public String getName() {
		return name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	// overriding
	@Override
	public String toString() {
		return "Monster{" +
				"name='" + name + '\'' +
				", hitPoints=" + hitPoints +
				", strength=" + strength +
				'}';
	}

	// implementations
	@Override
	public List<String> write() {
		ArrayList<String> values = new ArrayList<String>();
		values.add(0, this.name);
		values.add(1, "" + this.hitPoints);
		values.add(2, "" + this.strength);
		return values;
	}

	@Override
	public void read(List<String> savedValues) {
		if ((savedValues != null) && (savedValues.size() > 0)) {
			this.name = savedValues.get(0);
			this.hitPoints = Integer.parseInt(savedValues.get(1));
			this.strength = Integer.parseInt(savedValues.get(2));
		}
	}
}
