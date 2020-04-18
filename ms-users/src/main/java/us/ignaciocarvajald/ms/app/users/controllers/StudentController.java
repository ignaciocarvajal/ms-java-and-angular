package us.ignaciocarvajald.ms.app.users.controllers;

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

import us.ignaciocarvajald.ms.app.users.models.entity.Student;
import us.ignaciocarvajald.ms.app.users.services.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;

	@GetMapping
	public ResponseEntity<?> getStudents() {
		return ResponseEntity.ok().body(service.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getStudent(@PathVariable Long id) {
		Optional<Student> studentData = service.findById(id);
		if (studentData.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(studentData.get());
	}

	@PostMapping
	public ResponseEntity<?> create(@RequestBody Student student) {

		Student studentSaved = service.save(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(studentSaved);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> modify(@RequestBody Student student, @PathVariable Long id) {
		Optional<Student> studentData = service.findById(id);
		if (studentData.isEmpty()) {
			return ResponseEntity.notFound().build();
		}

		Student studentStorage = studentData.get();
		studentStorage.setName(student.getName());
		studentStorage.setLastName(student.getLastName());
		studentStorage.setEmail(student.getEmail());

		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(studentStorage));

	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		service.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
