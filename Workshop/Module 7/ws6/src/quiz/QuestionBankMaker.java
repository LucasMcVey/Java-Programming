package quiz;

public class QuestionBankMaker {

    public static QuestionBank makeQuestionBank1() {
        QuestionBank qb = new QuestionBank();
        ParagraphQuestion pq = new ParagraphQuestion("Explain what gravity is.",
                "force", "attract", "mass");
        qb.addQuestion(pq);
        TextQuestion tq = new TextQuestion("Who is the wealthiest person in the world?",
                "Elon Musk");
        qb.addQuestion(tq);
        qb.addQuestion(new NumericQuestion("What is 17 x 5?", 85));
        qb.addQuestion(new NumericQuestion("What is 12 / 8?", 1.5));
        return qb;
    }
}
