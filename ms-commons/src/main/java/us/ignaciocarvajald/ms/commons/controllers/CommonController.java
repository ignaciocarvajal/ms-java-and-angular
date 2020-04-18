package us.ignaciocarvajald.ms.commons.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import us.ignaciocarvajald.ms.commons.services.CommonService;

public class CommonController<E, S extends CommonService<E>> {
	@Autowired
	protected S service;

	@GetMapping
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok().body(service.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id) {
		Optional<E> entityData = service.findById(id);
		if (entityData.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(entityData.get());
	}

	@PostMapping
	public ResponseEntity<?> create(@RequestBody E entity) {

		E entitySaved = service.save(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(entitySaved);
	}

	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		service.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
