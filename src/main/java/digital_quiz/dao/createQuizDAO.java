
package digital_quiz.dao;


import digital_quiz.model.MCQS;
import digital_quiz.model.createQuiz;
import digital_quiz.model.numerical;
import digital_quiz.model.trueFalse;
import java.util.List;


public interface createQuizDAO {
    
    public void save(createQuiz cq);
    public List<createQuiz> list();

    public void save(MCQS mc);
     public List<MCQS> list1();
     
       public void save(trueFalse tf);
     public List<MCQS> list2();
     
       public void save(numerical nm);
     public List<MCQS> list3();
     
     
    
}
