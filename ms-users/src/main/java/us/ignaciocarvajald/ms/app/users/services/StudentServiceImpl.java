package us.ignaciocarvajald.ms.app.users.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import us.ignaciocarvajald.ms.app.users.models.repository.studentRepository;
import us.ignaciocarvajald.ms.commons.services.CommonServiceImpl;
import us.ignaciocarvajald.ms.commons.student.models.entity.Student;

@Service
public class StudentServiceImpl extends CommonServiceImpl<Student, studentRepository> implements StudentService {

	@Override
	@Transactional(readOnly = true)
	public List<Student> findByNameOrLastname(String term) {
		return repository.findByNameOrLastname(term);
	}

}
