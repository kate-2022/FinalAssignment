package m5s.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import m5s.model.Student;
import m5s.util.HibernateUtil;

public class Test {

	public static void main(String[] args) throws Exception {


		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Integer id = null;
		Student student = new Student();
		
		try {
			session = HibernateUtil.getSession();

			if (session != null)
				transaction = session.beginTransaction();

			if (transaction != null) {

				student.setSid(42);
				student.setSname("JamalMusiala");
				student.setSaddress("FCB");
				student.setSage(20);
				session.update(student);
				flag = true;
			}

		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				id = student.getSid();
				System.out.println("object updated with the id :: " + id);
				
				if (session != null) {
					student = session.get(Student.class, id);
					if (student!= null)
						System.out.println(student);
					else
						System.out.println("Record not found for the given id :: "+id);
				}
			} else {
				System.out.println("Object not saved to database...");
			}

			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}

}


