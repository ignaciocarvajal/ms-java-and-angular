package us.ignaciocarvajald.ms.app.courses.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import us.ignaciocarvajald.ms.app.courses.models.entity.Course;
import us.ignaciocarvajald.ms.app.courses.services.CourseService;
import us.ignaciocarvajald.ms.commons.controllers.CommonController;

@RestController
public class CourseController extends CommonController<Course, CourseService>{
	
	@PutMapping("/{id}")
	public ResponseEntity<?> modify(@RequestBody Course course, @PathVariable Long id) {
		Optional<Course> courseData = service.findById(id);
		if (courseData.isEmpty()) {
			return ResponseEntity.notFound().build();
		}

		Course courseStorage = courseData.get();
		courseStorage.setName(course.getName());

		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(courseStorage));

	}

}
