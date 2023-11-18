package quiz;

import java.util.Scanner;

public class Quiz {
    QuestionBank questionBank;
    int numQuestions;

    public Quiz(QuestionBank questionBank, int numQuestions) {
        this.questionBank = questionBank;
        this.numQuestions = numQuestions;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        double score = 0;
        double maxScore = 0;
        for (int i = 0; i < numQuestions; i++) {
            Question q = questionBank.getRandQuestion();
            q.ask();
            String answer = sc.nextLine();
            score += q.scoreAnswer(answer);
            maxScore += q.maxScore();
        }
        System.out.println("You have scored " + score + " out of " + maxScore + " ");
    }

}
