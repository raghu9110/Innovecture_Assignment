package com.assignment.models;

/*
 * Buildings has an object of Appliances, appliances object contains its own information. 
 * In such case relationship is Buildings HAS-A Appliances.
*/

public class Buildings {

	private Appliances appliances;

	public Buildings(Appliances appliances) {
		this.appliances = appliances;
	}

}
