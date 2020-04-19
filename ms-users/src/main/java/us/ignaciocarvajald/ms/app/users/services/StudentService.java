package us.ignaciocarvajald.ms.app.users.services;


import java.util.List;

import us.ignaciocarvajald.ms.commons.services.CommonService;
import us.ignaciocarvajald.ms.commons.student.models.entity.Student;

public interface StudentService extends CommonService<Student>{
	
	public List<Student> findByNameOrLastname(String term);
}
