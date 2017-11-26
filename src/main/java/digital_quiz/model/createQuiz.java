
package digital_quiz.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="create_quiz")
public class createQuiz implements Serializable {
    
    @Id
    @Column(name="quiz_number")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int quiz_number;
    private String title;
    private String description;
    private int allocated_time;

    public int getQuiz_number() {
        return quiz_number;
    }

    public void setQuiz_number(int quiz_number) {
        this.quiz_number = quiz_number;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAllocated_time() {
        return allocated_time;
    }

    public void setAllocated_time(int allocated_time) {
        this.allocated_time = allocated_time;
    }
    
    @Override
    public String toString(){
        return "quiz_number="+quiz_number+", title = "+title+", desctiption = "+description+", Allocated time = "+allocated_time;
    }
}
