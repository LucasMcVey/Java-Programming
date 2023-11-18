package quiz;

import java.util.ArrayList;
import java.util.Random;

public class QuestionBank {
    ArrayList questions = new ArrayList();

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public Question getRandQuestion() {
        Random r = new Random();
        int index = r.nextInt(questions.size());
        return (Question)questions.get(index);
    }
}
