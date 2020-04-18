package us.ignaciocarvajald.ms.app.users.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import us.ignaciocarvajald.ms.app.users.models.entity.Student;
import us.ignaciocarvajald.ms.app.users.models.repository.studentRepository;
import us.ignaciocarvajald.ms.commons.services.CommonServiceImpl;

@Service
public class StudentServiceImpl extends CommonServiceImpl<Student, studentRepository> implements StudentService {

}
