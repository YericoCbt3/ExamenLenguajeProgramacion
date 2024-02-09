package pruebas;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubjectDao dao = new SubjectDaoImpl();
		
		dao.delete(2);
		
		List<Subject> subjectLis = dao.findAll();
		
		for(Subject s: subjectLis) {
			System.out.println(s.getIdSubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
		}
	}

}
