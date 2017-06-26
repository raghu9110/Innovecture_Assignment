package com.assignment.models;

/*
 * created Habitats that is capable of interacting with animals and 
 * able to restrict different type of animals coming inside.
*/

import com.assignment.models.interfaces.Animal;
import com.assignment.models.interfaces.Habitat;

public class Habitats implements Habitat {

	public Animal animal;

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Animal getAnimal(AnimalName name) {

		switch (name) {

		case Cat:
			return new Cat();
		case Dog:
			return new Dog();
		case Eagle:
			return new Eagle();
		case Finch:
			return new Finch();
		case GilaMonster:
			return new GilaMonster();
		case GoldFish:
			return new GoldFish();
		case Trout:
			return new Trout();
		case Turtle:
			return new Turtle();
		default: {
			System.out.println(name + " not allowed in to habitat");
		}
		}

		return null;
	}

}
