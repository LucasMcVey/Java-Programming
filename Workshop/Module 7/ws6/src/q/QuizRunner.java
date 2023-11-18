package q;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz q = new Quiz();
        TextQuestion tq = new TextQuestion("who is the PM", "ScoMo");
        q.addQuestion(tq);
        ParagraphQuestion pq = new ParagraphQuestion("what is gravity?",
                "force", "attract", "mass");
        q.addQuestion(pq);
        q.run();
    }
}
