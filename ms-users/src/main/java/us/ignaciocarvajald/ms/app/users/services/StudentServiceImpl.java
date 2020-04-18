package us.ignaciocarvajald.ms.app.users.services;

import org.springframework.stereotype.Service;

import us.ignaciocarvajald.ms.app.users.models.repository.studentRepository;
import us.ignaciocarvajald.ms.commons.services.CommonServiceImpl;
import us.ignaciocarvajald.ms.commons.student.models.entity.Student;

@Service
public class StudentServiceImpl extends CommonServiceImpl<Student, studentRepository> implements StudentService {

}
