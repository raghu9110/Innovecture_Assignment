package com.assignment.main;

import com.assignment.models.Appliances;
import com.assignment.models.Buildings;
import com.assignment.models.Planets;
import com.assignment.models.Plants;
import com.assignment.models.Surfaces;
import com.assignment.models.Vehicles;

public class MainPlanet {

	public static void main(String args[]) {
		Appliances app = new Appliances();
		Buildings buildings = new Buildings(app);
		Vehicles veh = new Vehicles();
		Plants plants = new Plants();

		Surfaces sur = new Surfaces(buildings, veh, plants);
		Planets planets = new Planets(sur);
		System.out.println(planets);

	}

}
