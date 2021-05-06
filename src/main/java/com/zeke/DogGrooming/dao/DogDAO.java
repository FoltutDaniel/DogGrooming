package com.zeke.DogGrooming.dao;

import java.util.List;

import com.zeke.DogGrooming.entity.Dog;

public interface DogDAO {

	public List<Dog> getDogsByClient(int id);
	
	public Dog saveDog(Dog dog);
	
	public Dog getDog(int id);
	
	public void deleteDog(int id);
}
