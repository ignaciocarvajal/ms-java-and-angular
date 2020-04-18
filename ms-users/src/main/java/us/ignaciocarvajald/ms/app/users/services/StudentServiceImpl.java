package us.ignaciocarvajald.ms.app.users.services;

import org.springframework.stereotype.Service;

import us.ignaciocarvajald.ms.app.users.models.entity.Student;
import us.ignaciocarvajald.ms.app.users.models.repository.studentRepository;
import us.ignaciocarvajald.ms.commons.services.CommonServiceImpl;

@Service
public class StudentServiceImpl extends CommonServiceImpl<Student, studentRepository> implements StudentService {

}
