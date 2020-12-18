package com.example.AngularSpringCRUD;

import org.springframework.data.repository.Repository;
import java.util.List;

@org.springframework.stereotype.Repository
public interface PersonaRepositorio extends Repository<Persona, Integer> {
	List<Persona>findAll();
	Persona findById(int id);
	Persona save(Persona p);
	void delete(Persona p);
}
