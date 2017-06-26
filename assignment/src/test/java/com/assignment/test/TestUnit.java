package com.assignment.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.assignment.models.Habitats;
import com.assignment.models.interfaces.Animal;
import com.assignment.models.interfaces.Habitat;
import com.assignment.models.interfaces.Habitat.AnimalName;

public class TestUnit {

	Habitat habitat = new Habitats();
	Animal animal = habitat.getAnimal(AnimalName.Cat);
	Object o = animal;
	
	@Test
	public void testAnimalObject(){
		assertEquals(o, animal);
		
	}
	
}
