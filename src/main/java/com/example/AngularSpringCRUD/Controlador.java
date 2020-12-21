package com.example.AngularSpringCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/personas"})
public class Controlador {
	@Autowired
	PersonaService service;
	
	@GetMapping
	public List<Persona>listar(){
		return service.listar();
	}
	@PostMapping
	public Persona agregar(@RequestBody Persona p) {
		return service.add(p);
	}
	@GetMapping(path = {"/{id}"})
	public Persona listarId(@PathVariable("id")int id) {
		return service.listarId(id);
	}
	@GetMapping({"/sueldos-suma"})
	public Float sumarSueldos() {
		return service.sumarSueldos();
	}
	@GetMapping({"/sueldos-media"})
	public Float mediaSueldos() {
		return service.mediaSueldos();
	}
	@PutMapping(path = {"/{id}"})
	public Persona editar(@RequestBody Persona p, @PathVariable("id") int id) {
		p.setId(id);
		return service.edit(p);
	}
	@DeleteMapping(path = {"/{id}"})
	public Persona delete(@PathVariable("id") int id) {
		return service.delete(id);
	}
}
