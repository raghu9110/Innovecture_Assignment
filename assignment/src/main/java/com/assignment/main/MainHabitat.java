package com.assignment.main;

import com.assignment.models.Habitats;
import com.assignment.models.interfaces.Animal;
import com.assignment.models.interfaces.Habitat;
import com.assignment.models.interfaces.Habitat.AnimalName;

public class MainHabitat {

	public static void main(String[] args) {

		Habitat habitat = new Habitats();
		Animal animal = habitat.getAnimal(AnimalName.GilaMonster);
		if (animal != null) {
			animal.feed();
		} else {
			System.out.println("Anmal was not allowed in to the habitat so cannot feed it");
		}

	}

}
