package m5s.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import m5s.model.Student;
import m5s.util.HibernateUtil;

public class Test {

	public static void main(String[] args) throws Exception {


		Session session = null;
		int id = 0;
		try {
			session = HibernateUtil.getSession();

			if (session != null) {
				Student student = session.get(Student.class, id);
				if (student != null)
					System.out.println(student);
				else
					System.out.println("Record not found for the given id :: "+id);
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}

}


