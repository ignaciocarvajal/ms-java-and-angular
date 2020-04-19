package us.ignaciocarvajald.ms.app.users.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import us.ignaciocarvajald.ms.commons.student.models.entity.Student;



public interface studentRepository extends CrudRepository<Student, Long> {
	
	@Query("select student from Student student where student.name like %?1% or student.lastName like %?1%")
	public List<Student> findByNameOrLastname(String term);

}
