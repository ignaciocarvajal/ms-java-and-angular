package us.ignaciocarvajald.ms.app.courses.services;

import org.springframework.stereotype.Service;

import us.ignaciocarvajald.ms.app.courses.models.entity.Course;
import us.ignaciocarvajald.ms.app.courses.models.repository.CourseRepository;
import us.ignaciocarvajald.ms.commons.services.CommonServiceImpl;
@Service
public class CourseServiceImpl extends CommonServiceImpl<Course, CourseRepository> implements CourseService {


}
