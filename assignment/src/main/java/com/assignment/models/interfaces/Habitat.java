package com.assignment.models.interfaces;

// created common interface and used enum to restrict Habitats.

public interface Habitat {
	public enum AnimalName {
		Cat, Dog, Eagle, Finch, GilaMonster, GoldFish, Trout, Turtle
	};

	public Animal getAnimal(AnimalName name);

}
