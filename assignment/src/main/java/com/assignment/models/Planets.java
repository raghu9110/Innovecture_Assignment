package com.assignment.models;

/*
 * Planets has an object of Surfaces, surfaces object contains its own information. 
 * In such case relationship is every Planet HAS-A surface.
*/
public class Planets {

	private Surfaces surfaces;

	public Planets(Surfaces surfaces) {
		this.surfaces = surfaces;
	}

}
