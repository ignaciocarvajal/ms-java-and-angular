package us.ignaciocarvajald.ms.app.users.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import us.ignaciocarvajald.ms.app.users.services.StudentService;
import us.ignaciocarvajald.ms.commons.controllers.CommonController;
import us.ignaciocarvajald.ms.commons.student.models.entity.Student;

@RestController
public class StudentController extends CommonController<Student, StudentService> {

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

}
