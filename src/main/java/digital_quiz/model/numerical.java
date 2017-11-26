
package digital_quiz.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="numerical")
public class numerical implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nm_question;
    private String nm_answer;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNm_question() {
        return nm_question;
    }

    public void setNm_question(String nm_question) {
        this.nm_question = nm_question;
    }

    public String getNm_answer() {
        return nm_answer;
    }

    public void setNm_answer(String nm_answer) {
        this.nm_answer = nm_answer;
    }
   
    
    
     @Override
    public String toString(){
        return "id="+id+", question = "+nm_question+", correct answer = "+nm_answer;
    }
}
