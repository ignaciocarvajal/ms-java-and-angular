package us.ignaciocarvajald.ms.app.users.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import us.ignaciocarvajald.ms.app.users.models.entity.Student;
import us.ignaciocarvajald.ms.app.users.models.repository.studentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private studentRepository repository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Student> findAll() {
		
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Student> findById(Long id) {
		
		return repository.findById(id);
	}

	@Override
	@Transactional
	public Student save(Student student) {
		
		return repository.save(student);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		repository.deleteById(id);

	}

}
