package q;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList questions = new ArrayList();

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        double score = 0;

        for (int i = 0; i < questions.size(); i++) {
            Question q = (Question)questions.get(i);
            q.ask();
            String answer = sc.nextLine();
            double s = q.scoreAnswer(answer);
            score += s;
        }

        System.out.println("You have scored " + score);
    }
}
