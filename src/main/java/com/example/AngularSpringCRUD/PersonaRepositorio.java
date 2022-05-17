package com.example.AngularSpringCRUD;

import java.util.List;

import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface PersonaRepositorio extends Repository<Persona, Integer> {
	List<Persona>findAll();
	Persona findById(int id);
	Persona save(Persona p);
	void delete(Persona p);
}
