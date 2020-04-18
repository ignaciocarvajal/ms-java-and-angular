package us.ignaciocarvajald.ms.app.users.models.repository;

import org.springframework.data.repository.CrudRepository;

import us.ignaciocarvajald.ms.commons.student.models.entity.Student;



public interface studentRepository extends CrudRepository<Student, Long> {

}
