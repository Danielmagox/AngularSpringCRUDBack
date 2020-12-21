package com.example.AngularSpringCRUD;

import java.util.List;

public interface PersonaService {
	List<Persona>listar();
	Persona listarId(int id);
	Persona add(Persona p);
	Persona edit(Persona p);
	Float sumarSueldos();
	Float mediaSueldos();
	Float desviacionTipica();
	Persona delete(int id);
}
