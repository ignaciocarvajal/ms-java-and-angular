package us.ignaciocarvajald.ms.app.courses.services;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import us.ignaciocarvajald.ms.app.courses.models.entity.Course;
import us.ignaciocarvajald.ms.app.courses.models.repository.CourseRepository;
import us.ignaciocarvajald.ms.commons.services.CommonServiceImpl;
@Service
public class CourseServiceImpl extends CommonServiceImpl<Course, CourseRepository> implements CourseService {

	@Override
	@Transactional(readOnly = true)
	public Course findCourseByStudent(Long id) {
		return repository.findCourseByStudent(id);
	}


}
