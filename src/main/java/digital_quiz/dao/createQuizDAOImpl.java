
package digital_quiz.dao;

import digital_quiz.model.MCQS;
import digital_quiz.model.createQuiz;
import digital_quiz.model.numerical;
import digital_quiz.model.trueFalse;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class createQuizDAOImpl implements createQuizDAO {

 private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory){
    this.sessionFactory=sessionFactory;
    }
    
     @Override
    public void save(createQuiz cq)
    {
        Session session=this.sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        session.persist(cq);
        t.commit();
        session.close();
    }

     @SuppressWarnings("unchecked")
	@Override
    public List<createQuiz> list(){
        Session session = this.sessionFactory.openSession();
		List<createQuiz> quizList = session.createQuery("from createQuiz").list();
		session.close();
		return quizList;
    }

    public void save(MCQS mc) {
       Session session=this.sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        session.persist(mc);
        t.commit();
        session.close();
    }

    public List<MCQS> list1() {
        Session session = this.sessionFactory.openSession();
		List<MCQS> mcqsList = session.createQuery("from mcqs").list();
		session.close();
		return mcqsList; 
    }

    public void save(trueFalse tf) {
    Session session=this.sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        session.persist(tf);
        t.commit();
        session.close();    
    }

    public List<trueFalse> list2() {
     Session session = this.sessionFactory.openSession();
		List<trueFalse> tfList = session.createQuery("fromtrueFalse").list();
		session.close();
		return tfList;   
    }

    public void save(numerical nm) {
    Session session=this.sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        session.persist(nm);
        t.commit();
        session.close();    
    }

    public List<numerical> list3() {
         Session session = this.sessionFactory.openSession();
		List<numerical> nmList = session.createQuery("from numerical").list();
		session.close();
		return nmList;   }
    
}
    
