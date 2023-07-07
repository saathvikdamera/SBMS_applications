import com.Damera.StudentDAO.StudentDAO;
import com.Damera.StudentDAOImpl.StudentDAOImpl;
import com.Damera.entity.StudentCompositeKey;
import com.Damera.entity.StudentEntity;

public class tester {

	public static void main(String[] args) {
		
		StudentDAO dao = new StudentDAOImpl();
		
		StudentCompositeKey compositeKey = new StudentCompositeKey();
		compositeKey.setRollNo(101);
		compositeKey.setSection("A");
		
		StudentEntity s1 = new StudentEntity(compositeKey,"Ravi",600);
		
		dao.saveStudent(s1);

	}
}
