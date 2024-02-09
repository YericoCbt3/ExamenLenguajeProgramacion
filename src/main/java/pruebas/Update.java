package pruebas;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubjectDao dao = new SubjectDaoImpl();
		
		Subject subject = new Subject();
		
		subject.setIdSubject(1);
		subject.setSubject("Analisis II");
		subject.setCredits("6");
		
		dao.update(subject);
		
		List<Subject> subjectLis = dao.findAll();
		
		for(Subject s: subjectLis) {
			System.out.println(s.getIdSubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
		}
		
	}

}
