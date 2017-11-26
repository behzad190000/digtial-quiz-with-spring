
package digital_quiz.main;



import digital_quiz.dao.createQuizDAO;
import digital_quiz.model.MCQS;
import digital_quiz.model.createQuiz;
import digital_quiz.model.numerical;
import digital_quiz.model.trueFalse;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new  ClassPathXmlApplicationContext("spring1.xml");
        
        createQuizDAO cqDAO=context.getBean(createQuizDAO.class);
        
        
        createQuiz cq =new createQuiz();
        cq.setTitle("Quiz 1");
        cq.setDescription("Math & physcis ");
        cq.setAllocated_time(150);
        
        
        MCQS mc=new MCQS();
        mc.setMcqs_question("what Pakistan came into being ? ");
        mc.setOption1("1944");
        mc.setOption2("1945");
        mc.setOption3("1946");
        mc.setOption4("1947");
        mc.setMcqs_answer("1947");
        
        trueFalse trf=new trueFalse();
        trf.setTf_question("is 5 > 8");
        trf.setOption1("true");
        trf.setOption2("false");
        trf.setTftf_answer("false");
        
        numerical num=new numerical();
        num.setNm_question("what is your name ?");
        num.setNm_answer("behzad");
        
        
        cqDAO.save(cq);
        cqDAO.save(mc);
        cqDAO.save(trf);
        cqDAO.save(num);
        
        System.out.println("Quiz::"+cq);
        System.out.println("MCQS::"+mc);
        System.out.println("True False::"+trf);
        System.out.println("Numerical::"+num);
        
        
        
        List< createQuiz> list = cqDAO.list();
         List<MCQS> list1 = cqDAO.list1();
          List< trueFalse> list2 = cqDAO.list2();
           List< numerical> list3 = cqDAO.list3();
           
           
        
        for( createQuiz cq2 : list){
            System.out.println("Quiz List :: "+cq2);
        }
        
         for( MCQS mc2 : list1){
            System.out.println("MCQS List :: "+mc2);
        }
         
          for( trueFalse tf2 : list2){
            System.out.println("True False List :: "+tf2);
        }
          
          
           for( numerical num2 : list3){
            System.out.println("Numerical List :: "+num2);
        }
 context.close();
    }
}
