package com.assignment.models;

/*
 * Surfaces has an object of Buildings, Vehicles and Plants. 
 * Buildings, Vehicles and Plants object contains its own information. 
 * In such case relationship is Surface HAS-A Buildings, Vehicles and Plants.
*/
public class Surfaces {

	private Buildings buildings;
	private Vehicles vehicles;
	private Plants plants;

	public Surfaces(Buildings buildings, Vehicles vehicles, Plants plants) {
		this.buildings = buildings;
		this.vehicles = vehicles;
		this.plants = plants;
	}
}
