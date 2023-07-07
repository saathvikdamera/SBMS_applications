package com.Damera.StudentDAO;

import com.Damera.entity.StudentCompositeKey;
import com.Damera.entity.StudentEntity;

public interface StudentDAO {
	
	void saveStudent(StudentEntity entity);
	
	StudentEntity fetchStudent(StudentCompositeKey compositeKey);
	
	StudentEntity updateStudent(StudentCompositeKey compositeKey,Integer new_marks);
	
	void deleteStudent(StudentCompositeKey compositeKey);

}
