package q;

public class TextQuestion implements Question {
    private String question;
    private String answer;

    public TextQuestion(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public void ask() {
        System.out.println(question);
    }

    public double scoreAnswer(String answer) {
        if (this.answer.equals(answer)) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
