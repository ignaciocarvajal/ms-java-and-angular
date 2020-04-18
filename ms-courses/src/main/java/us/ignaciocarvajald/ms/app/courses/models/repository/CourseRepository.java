package us.ignaciocarvajald.ms.app.courses.models.repository;

import org.springframework.data.repository.CrudRepository;

import us.ignaciocarvajald.ms.app.courses.models.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {

}
