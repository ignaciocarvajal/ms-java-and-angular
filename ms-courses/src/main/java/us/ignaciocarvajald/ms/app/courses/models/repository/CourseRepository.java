package us.ignaciocarvajald.ms.app.courses.models.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import us.ignaciocarvajald.ms.app.courses.models.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {
	
	@Query("select course from Course course join fetch course.students student where student.id=?1")
	public Course findCourseByStudent(Long id);

}
