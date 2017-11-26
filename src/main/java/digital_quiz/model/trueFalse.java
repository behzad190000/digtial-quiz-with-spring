
package digital_quiz.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trueFalse")
public class trueFalse implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String tf_question;
    private String option1;
     private String option2;
    private String tf_answer;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTf_question() {
            return tf_question;
        }

        public void setTf_question(String tf_question) {
            this.tf_question = tf_question;
        }

        public String getOption1() {
            return option1;
        }

        public void setOption1(String option1) {
            this.option1 = option1;
        }

        public String getOption2() {
            return option2;
        }

        public void setOption2(String option2) {
            this.option2 = option2;
        }

        public String getTftf_answer() {
            return tf_answer;
        }

        public void setTftf_answer(String tf_answer) {
            this.tf_answer = tf_answer;
        }
        
        
        @Override
    public String toString(){
        return "id="+id+", question = "+tf_question+", correct answer = "+tf_answer;
    }

}
