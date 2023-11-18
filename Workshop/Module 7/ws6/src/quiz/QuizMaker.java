package quiz;

public class QuizMaker {
    public static void main(String[] args) {
        QuestionBank qb = QuestionBankMaker.makeQuestionBank1();
        Quiz quiz = new Quiz(qb, 3);
        quiz.run();;
    }
}
